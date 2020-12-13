package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayListDuplicateElements {
	
	public static void main(String[] args){
		
		ArrayList<String> values = new ArrayList<String>(Arrays.asList("Suresh", "Prasanth", "Satish", "Suresh", "Prasanth", "Alpha", "Winner"));
		
//		1. Using LinskedHaset/HashSet - set will not allow duplicate elements 
		System.out.println("--------Using Set -------------");
		
		LinkedHashSet<String> setValues = new LinkedHashSet<String>(values);
		System.out.println("LinkedsetValues" + setValues);
		ArrayList<String> updatedValues = new ArrayList<String>(setValues);
		System.out.println(updatedValues);
		
		System.out.println("---------------------");
		
		HashSet<String> temp = new HashSet<String>(values);
		System.out.println("HashsetValues" + temp);
		ArrayList<String> updatedValues1 = new ArrayList<String>(temp);
		System.out.println(updatedValues1);
		
		System.out.println("---------------------");
		
		TreeSet<String> temp1=new TreeSet<String>(values);
		ArrayList<String> updatedValues2 = new ArrayList<String>(temp1);
		System.out.println(updatedValues2);
		
		
//		2. JDK 8 - Stream
		System.out.println("----------Using Stream-----------");
		ArrayList<String> arrValues = new ArrayList<String>(Arrays.asList("Suresh", "Prasanth", "Satish", "Suresh", "Prasanth"));
		List<String> updatedValues3=arrValues.stream().distinct().collect(Collectors.toList());
		System.out.println(updatedValues3);
	}

}

