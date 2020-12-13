package ImpPrograms;

public class stringComparasions {
	
	
	public static void main(String[] args){
		String abc = "Suresh";
		String xyz = "Suresh";
		
		String b = abc;
		
		//both strings refers the same content. hence returs true
		if(abc==xyz){
			System.out.println("1=>true");
		}else
			System.out.println("1=>false");
		
		if(abc.equals(xyz)){
			System.out.println("2=>true");
		}else
			System.out.println("2=>false");
		
		
		//both strings refers the same content.hence returs true
		if(abc==b){
			System.out.println("3=>true");
		}else
			System.out.println("3=>false");
		
		if(abc.equals(b)){
			System.out.println("4=>true");
		}else
			System.out.println("4=>false");

//		Reason: If you create a String object using the `new` keyword a separate space is allocated to it on the heap.
		String s1 = new String("Stack Overflow");
		String s2 = new String("Stack Overflow");
		if(s1 == s2)// false
			System.out.println("5=>"+true);
		else
			System.out.println("5=>"+false);
		
		if(s1.equals(s2))// true
			System.out.println("6=>"+true);
		else
			System.out.println("6=>"+false);
	}
	

}
