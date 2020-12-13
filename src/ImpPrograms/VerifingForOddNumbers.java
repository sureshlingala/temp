package ImpPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class VerifingForOddNumbers {

	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		
		list.stream().forEach(x->{
			if(x%2==0)
				System.out.println("List contains even Numbers");;
		});
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		// Using parallel Stream
		System.out.println(oddNumberCheck(list1));
		
	}
	
	public static boolean oddNumberCheck(ArrayList<Integer> list){
		// // parallel stream for faster processing
//		return as soon as any elements match the condition
		return list.parallelStream().allMatch(x -> x%2 != 0); 
	}
}
