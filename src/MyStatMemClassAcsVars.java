
//Program: How to access top level class variables from static member classes?

//Since static code does not have a this reference, you can not access
//instance variable of a top level class. You can only access static
//members of a top level class.
public class MyStatMemClassAcsVars { //top class
     
	private static String staticVar = "You can access me!!!";
    private String privVar = "You cannot access me";
     
    public static class ChildClass{ //static member class
         
        public void myMethod(){
            //you can access all static members of 
            //top level class
            System.out.println(staticVar);
            //you cannot access instance members of
            //top level class
            //below line gives compile error
            //System.out.println(privVar);
        }
    }
     
    public static void main(String a[]){
        MyStatMemClassAcsVars.ChildClass cc = new MyStatMemClassAcsVars.ChildClass();
        cc.myMethod();
    }
}