//Program: How to initialize non-static member (local class) class?

//You can create an instance for non-static member class by creating
//instance for top level class.
public class MyNonStaticMemberClassInstance {
 
    public static void main(String a[]){
        ParentClass pc = new ParentClass();
        ParentClass.ChildClass cc = pc.getInnerInstance();
        cc.myMethod();
        ParentClass.ChildClass cc1 = pc.new ChildClass();
        cc1.myMethod();
    }
}
 
class ParentClass{
     
    public class ChildClass{
         
        public void myMethod(){
            System.out.println("Hey you have called me!!!");
        }
    }
     
    public ChildClass getInnerInstance(){
        return this.new ChildClass();
    }
}
