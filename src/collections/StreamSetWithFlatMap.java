package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import collections.StreamSetWithFlatMapSupportClass;

public class StreamSetWithFlatMap {
	
	public static void main(String[] args){
		
		StreamSetWithFlatMapSupportClass s1 = new StreamSetWithFlatMapSupportClass();
		s1.setName("Suresh");
		s1.addDevice("Iphone8");
		s1.addDevice("Iphone7");
		s1.addDevice("Samsung");
		s1.addDevice("MOTOROLA");
		
		StreamSetWithFlatMapSupportClass s2 = new StreamSetWithFlatMapSupportClass();
		s2.setName("Chinni");
		s2.addDevice("Iphone5");
		s2.addDevice("IphoneSE");
		s2.addDevice("Samsung9");
		s2.addDevice("MOTOROLA");
		
		List<StreamSetWithFlatMapSupportClass> l1 = new ArrayList<StreamSetWithFlatMapSupportClass>();
		
		l1.add(s1);
		l1.add(s2);
		
		List<String> l2=l1.stream().map(x->x.getDevices()) //returns Stream<Set<String>>
							.flatMap(x->x.stream())//return Stream<String>
							.distinct()
							.collect(Collectors.toList()); 
		l2.forEach(x->System.out.println(x));
	
	}
	

}
