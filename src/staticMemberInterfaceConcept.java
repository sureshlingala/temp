//Program: How to implement a static member interface?

//A static member interface must me declared as a static member of top level class.
//Static member interface can not have its name as top level class.

public class staticMemberInterfaceConcept implements test.staticMemberInterface1, test.staticMemberInterface{

	@Override
	public void implementMe() {
		System.out.println("StaticMemberInterface");
	}
	
	@Override
	public void nonStaticMethod() {
		System.out.println("Non Static method in not Static interface method");
		
	}
	
	public static void main (String args[]){
		staticMemberInterfaceConcept testref= new staticMemberInterfaceConcept();
		testref.implementMe();
		
		test.staticMemberInterface1 interfaceObj = new staticMemberInterfaceConcept(); 
		
		test.staticMemberInterface1.implementMe1();
		test.staticMemberInterface2.implementMe2();
		interfaceObj.implent();
	}

}

// to make interface as static it should be declared inside a class
// we cannot directly write static interface as that will throw compile time error 

class test{ //even public modifier cannot be declared as it is throwing compile time error since we already declared at a parent class

	//adding the annotation means expecting only single abstract method (sam) inside the interface
	@FunctionalInterface	// hence this kind of interfaces are calleds with Functional Interface, but we can add other static and default methods
	public static interface staticMemberInterface {

		void implementMe(); //only one abstract method is allowed
		
		public static void imp(){
			System.out.println("Static method can be declared in functional interface");
		}
		
		default void defaultimp(){
			System.out.println("default method also can be delcared in functional interface");
		}
	}
	
	public interface staticMemberInterface1{
		//static methods and default methods also can be declared inside the interface from Java 8 onwards
		static void implementMe1(){
			System.out.println("I am called by the other class directly");
		}
		
		default void implent(){
			System.out.println("default method also called");
		}
		
		void nonStaticMethod();
//		void nonStaticMethod1(); //multiple sam methods can be created since its not funcational interface
	}
	
	public static interface staticMemberInterface2{
		//static methods and default methods also can be declared inside the interface from Java 8 onwards
		static void implementMe2(){
			System.out.println("I am also called by the other class directly");
		} 
	}

}


 