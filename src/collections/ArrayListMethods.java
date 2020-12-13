package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListMethods {

	public static void main(String[] args){

		// list with other collection
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Suresh", "Satish", "Prasanth", "Trishika", "Sunitha"));
		System.out.println(names);
		
		names.add("Sasi");
		names.add("Lprao");
		
		System.out.println("----------Converting to array--------------");
		
		//Converting to Array
		Object[] namesarr=names.toArray();
		for (Object obj : namesarr) {
			System.out.println(obj.toString());
			System.out.println((String)obj);
		}
		//or optimized code 
		String namesArray=Arrays.toString(names.toArray());
		System.out.println(namesArray);
		
		
		System.out.println("----------Cloning--------------");
		
		//cloning
		ArrayList<String> namesClone = (ArrayList<String>) names.clone();
		System.out.println(namesClone);
		
		//Indexing
		System.out.println("----------Indexing of--------------");
		System.out.println(names.indexOf("Suresh"));
		System.out.println(names.indexOf("Trishika")>3);
		
		System.out.println("----------last Index of--------------");
		
		names.add("Suresh");
		System.out.println(names.lastIndexOf("Suresh"));
		System.out.println(names.indexOf("Suresh"));
		
		System.out.println("----------removal--------------");
		//remove -> can be done using index or value.
		names.remove(1); //removes value at index 1
		names.remove("Sunitha"); //removes name
		
		//remove if -> removes based on condition
		names.removeIf(ele->ele.equals("Suresh")); // lambda (->) expression is used 
		System.out.println(names);
		
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		nums.removeIf( ele-> ele%2==0); // lambda (->) expression is used
		System.out.println(nums);
		
		System.out.println("----------retainAll--------------");
		//retainAll - retains the specific ele in the list and removes all the other
		ArrayList<Integer> nums1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,9,9));
		nums1.retainAll(nums);
		nums1.retainAll(Collections.singleton(9));
		nums1.retainAll(nums);
		System.out.println(nums1);
		
		System.out.println("----------Subset--------------");
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,9,9));
		ArrayList<Integer> nums3 = new ArrayList<Integer>(nums2.subList(1,5)); // nums3 will hold the values from index 1 till 4th index i.e (end index-1). 5 is the end index 
		System.out.println(nums3);
	}
}
