
//Program: How to initialize or call a static member class?

//A static member class must me declared as a static member of top level class.
//Static member class can not have its name as top level class.

public class staticMemberTopClass {
	
	public static class staticMemberClass{
		
		public void printStatus(){
			
			System.out.println("Method under Static member class printed");
		}
	}
	

	public static void main(String[] args){
		
		staticMemberTestClass testObj = new staticMemberTestClass();
		testObj.test();
	}
}

class staticMemberTestClass{
	
	staticMemberTopClass.staticMemberClass obj = new staticMemberTopClass.staticMemberClass();
	public void test(){
		obj.printStatus();
	}
}
