package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
	
	public static void main(String[] args){
	
		HashMap<Integer, String> map1= new HashMap<Integer, String>();
		map1.put(1, "a");
		map1.put(2, "b");
		map1.put(3, "c");
		map1.put(4, "d");
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(4, "d");
		map2.put(1, "a");
		map2.put(2, "b");
		map2.put(3, "c");
		HashMap<Integer, String> map3= new HashMap<Integer, String>();
		map3.put(1, "a");
		map3.put(2, "b");
		map3.put(3, "c");
		
		//1. Using equals method
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		System.out.println("-------------------------");
		//2. Compare for the same keys Using keys.set
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		System.out.println("-------------------------");
		//3.Find Out the extra keys
		HashMap<Integer, String> map4= new HashMap<Integer, String>();
		map4.put(1, "a");
		map4.put(2, "b");
		map4.put(3, "c");
		map4.put(4, "d");
		HashSet<Integer> combinedSet = new HashSet<Integer>();
		combinedSet.addAll(map3.keySet());
		combinedSet.addAll(map4.keySet());
		combinedSet.removeAll(map3.keySet());
		System.out.println(combinedSet);
		
		System.out.println("-------------------------");
		//4. Compare map by values
		HashMap<Integer, String> map5= new HashMap<Integer, String>();
		map5.put(1, "a");
		map5.put(2, "b");
		map5.put(3, "c");

		HashMap<Integer, String> map6= new HashMap<Integer, String>();
		map6.put(4, "a");
		map6.put(5, "b");
		map6.put(6, "c");

		HashMap<Integer, String> map7= new HashMap<Integer, String>();
		map7.put(4, "a");
		map7.put(5, "b");
		map7.put(6, "b");
		System.out.println(map5.values());
		System.out.println(map6.values());
		System.out.println(map5.values().equals(map6.values()));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
	}

}
