package ImpPrograms;

import java.util.Arrays;

public class RemoveduplicatesFromSortedEle {

	public static void removeDuplicates(int[] sortedEle){
		//method 1 using streams
		Arrays.stream(sortedEle).distinct().forEach(System.out::print);
		
		int i = 0;
		int j=1;
		if(sortedEle.length<2)
			System.out.print(sortedEle);
		
		while(j<sortedEle.length){
			
			if(sortedEle[i]==sortedEle[j]){
				j++;
			}else{
				sortedEle[++i] =sortedEle[j++];
			}
		}
		System.out.println();
		int output[] = new int[i+1];
		for(int k=0;k<output.length;k++){
			output[k] = sortedEle[k];
			System.out.print(output[k] + " ");
		}
		
		
	}
	
	public static void main(String[] args){
		
		int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
		removeDuplicates(input1);	
	}
}
