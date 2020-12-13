package ImpPrograms;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDupliacteCharsFromString {
	
	static String name = "suresh";
	
	public static void main(String[] args){
		
		Map<Character, Integer> m1 = new HashMap<>();
		char[] nameArr = name.toCharArray();
		
		//method - 1
		for(int i=0;i<nameArr.length;i++){
			
			if(m1.containsKey(nameArr[i])){
				m1.put(nameArr[i], m1.get(nameArr[i])+1);
			}else
				m1.put(nameArr[i], 1);
			
		}
		Set<Character> keys=m1.keySet();
		for(Character ch:keys){
			if(m1.get(ch)>1){
				System.out.println("duplicated Character = "+ch + " ----> " + m1.get(ch));
			}
		}
		
		//method 2
		Set<Integer> item = new HashSet<>();
		IntStream charStreaminInt=name.chars();
		IntStream charStreaminInt1 = name.chars();
		IntStream charStreaminInt2 = name.chars();
		charStreaminInt.filter(x->!item.add(x)).forEach(x->System.out.print((char)x));
		
		//method 3
//		charStreaminInt1.filter(a->charStreaminInt2.filter(y->y==a).count()>1).forEach(System.out::print);;
	}


}
