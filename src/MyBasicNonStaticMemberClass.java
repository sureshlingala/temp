//Program: Give an example of basic non-static member class.
//You can create an instance for non-static member class by creating
//instance for top level class.

public class MyBasicNonStaticMemberClass {
	  public class ChildClass{
	         
	        public void myMethod(){
	            System.out.println("Hey you have called me!!!");
	        }
	    }
	     
	    public ChildClass getInnerInstance(){
	        return this.new ChildClass();
	    }
	     
	    public static void main(String a[]){
	        MyBasicNonStaticMemberClass mbn = new MyBasicNonStaticMemberClass();
	        ChildClass cc = mbn.getInnerInstance();
	        cc.myMethod();
	    }
	
}
