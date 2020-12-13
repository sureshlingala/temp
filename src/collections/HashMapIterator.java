package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterator {
	
	public static void main(String[] args){
		
		//No Order, no indexing and Key values cannot be duplicate, also it is not threadSafe - unsynchronized
		HashMap<String, String> capitalMap=new HashMap<String,String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("Aus", "Sydney");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", null); // Key cannot be duplicate, but it wont throw any error instead the latest values will override the previous value
	
		System.out.println(capitalMap.get("UK")); // will print "null" value which is latest and overrides the old value i.e London.
		System.out.println(capitalMap.get("AP"));//will print null since no key is available with AP
		capitalMap.put(null, "Hyd");
		capitalMap.put(null, "Vizag");
		System.out.println(capitalMap.get(null));// will print its latest value i.e Vizag 
	
		System.out.println("-------------------");
		
		//1. Iterator  using Keyset : return the set of keys into the iterator, hence values can get based on keys 
		Iterator<String> mapItr =capitalMap.keySet().iterator();
		while(mapItr.hasNext()){
			String key= mapItr.next();
			System.out.println(key + " ---> "+ capitalMap.get(key));
		}
		
		System.out.println("-------------------");
		
//		2. Iterator using entrySet: this method will return the entire mapSet i.e both keys and values together into iterator
		Iterator<Entry<String,String>> entrySet= capitalMap.entrySet().iterator();
		while(entrySet.hasNext()){
			Entry<String, String> mapSet=entrySet.next();
			System.out.println(mapSet.getKey() + " ---- >" +mapSet.getValue());
		}
		
		System.out.println("-------------------");
		
		//3. using forEach
		for (Map.Entry<String, String> mapvalue : capitalMap.entrySet()) {
			System.out.println(mapvalue.getKey()+" "+mapvalue.getValue());
		}
		
		System.out.println("-------------------");
		//4. Using lamda
		capitalMap.forEach((key, value)->System.out.println(key + " -- " +value)); //Stream is not available on maps
		
	}

}
