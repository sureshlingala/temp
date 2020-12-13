package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class virtualCapacity {
	
	public static void main(String[] args){
		
		//ArrayList can be declared without generics but Java will not encourage the coding standards, hence it will throw warning saying raw type reference.
		// passing the argument as line# 15, will resolve this warning. 
		ArrayList list = new ArrayList();
		// Java assigns a default virtual capacity of 10 on arrayList declaration (can be seen in debug mode).
		// and the capacity limit will be extended by 1 after this allocation is used by adding the elements.
		// we can also make the virtual capacity limit as dynamic by passing the value during instance creation.
		ArrayList<String> capacity = new ArrayList<String>(5);  //5 in the statement is the virtual capacity limit
		capacity.add("10");
		capacity.add("20");
		capacity.add("30"); // in this scenario 3 (holds 10, 20,30) is the physical capacity (counted based on the number of elements that arrayList holds).
		
	}
	

}
