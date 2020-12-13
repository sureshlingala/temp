package ImpPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findTop2numbers {
	
	int max1=0;
	int max2=0;
	
	public void findingMaxTwo(List<Integer> list){
	
		//method - 1
		long time1 = System.currentTimeMillis()/1000;
		for(int eachNum:list){
			
			if(eachNum>max1){
				max2 = max1;
				max1 = eachNum;
			}else if(max2<eachNum){
				max2 = eachNum;
			}
		}
		System.out.println(max1 + " & "+max2);
		long time2 = System.currentTimeMillis()/1000;
		System.out.println((time1-time2));
		
		//using Streams
		long time3 = System.currentTimeMillis()/1000;
		System.out.println("Max element " +list.stream().max(Comparator.naturalOrder()).get());
		System.out.println("2nd Largest "+list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		long time4 = System.currentTimeMillis()/1000;
		System.out.println((time3-time4));
	}
	
	
	
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,5,3,9,10,25,15));
//		list = IntStream.rangeClosed(0, 500000).boxed().collect(Collectors.toList());
		findTop2numbers ojref = new findTop2numbers();
		ojref.findingMaxTwo(list);
		
	}

}
