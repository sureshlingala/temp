package ImpPrograms;


//Singleton class means you can create only one object for the given class. 
//You can create a singleton class by making its constructor as private, 
//so that you can restrict the creation of the object. 
//Provide a static method to get instance of the object, wherein you can handle the object creation inside the class only. 
//In this example we are creating object by using static block.

public class SingletonClass {
	
	private static SingletonClass obj;
	private SingletonClass(){
		
	}
	static{
		obj = new SingletonClass();
	}
	
	public static SingletonClass getInstance(){
		
		return obj;
	}
	
	public void test(){
		System.out.println("Singleton class worked");
	}
	
	public static void main(String[] args) {

		SingletonClass objref = getInstance();
		objref.test();

	}

}
