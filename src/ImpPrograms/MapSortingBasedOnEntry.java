package ImpPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSortingBasedOnEntry {

	public static void main(String[] args){
					
		Map<String, Integer> map = new HashMap<>();
		map.put("Aletter", 1);
		map.put("Bletter", 2);
		map.put("aletter", 97);
		map.put("bletter", 98);
		map.put("Sletter", 18);
		map.put("Rletter", 17);
		
		 Set<Entry<String,Integer>> entryList= map.entrySet();
		 List<Entry<String,Integer>> arrayList=new ArrayList<>(entryList);
		 
		 Collections.sort(arrayList,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		 
		 arrayList.stream().forEach(System.out::println);
		 
		 //or
		 for(Entry<String, Integer> itr :arrayList){
			 System.out.println(itr.getKey() +" :: "+itr.getValue());
		 }
	}
}
