package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListComparisions {
	
	public static void main(String[] args){
		//1. ArrayList Comparison
		ArrayList<Integer> arrComparision= new ArrayList<Integer>(Arrays.asList(1,3,2,9,4,5,7,8,8));
		ArrayList<Integer> arrComparision1= new ArrayList<Integer>(Arrays.asList(2,4,1,8,3,5,8,7,9));
		ArrayList<Integer> arrComparision3= new ArrayList<Integer>(Arrays.asList(6,9,1,8,3,5,8,8,9));
		Collections.sort(arrComparision);
		Collections.sort(arrComparision1);
		Collections.sort(arrComparision3);
		System.out.println(arrComparision.equals(arrComparision1));
		System.out.println(arrComparision.equals(arrComparision3));
		
		System.out.println("-----------------");
		//2. Find Out additional numbers
		ArrayList<Integer> l1= new ArrayList<Integer>(Arrays.asList(2,4,1,8,3,5,8,7,9));
		ArrayList<Integer> l2= new ArrayList<Integer>(Arrays.asList(6,9,1,8,3,5,8,8,9));
		l1.removeAll(l2);
		System.out.println(l1);
		System.out.println("-----------------");
		//3. Find Out Missing numbers
		
		ArrayList<Integer> l3= new ArrayList<Integer>(Arrays.asList(2,4,1,8,3,5,8,7,9));
		ArrayList<Integer> l4= new ArrayList<Integer>(Arrays.asList(6,9,1,8,3,5,8,8,9));
		l4.removeAll(l3);
		System.out.println(l4);
		
		System.out.println("-----------------");
		//4. findout the common elements
		ArrayList<Integer> l5= new ArrayList<Integer>(Arrays.asList(2,4,1,8,3,5,8,7,9));
		ArrayList<Integer> l6= new ArrayList<Integer>(Arrays.asList(6,9,1,8,3,5,8,8,9));
		l5.retainAll(l6);
		System.out.println(l5);
		
	}

}
