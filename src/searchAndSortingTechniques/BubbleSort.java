package searchAndSortingTechniques;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BubbleSort {

	
	public static void sort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			int temp;
			for(int j=0;j<arr.length-1;j++){
				
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
			Arrays.stream(arr).forEach(x->System.out.print(x + " "));
			System.out.println("------------------");
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {5,10,12,7,15,1};

		sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("---------");
		IntStream.of(arr).forEach(System.out::println);
	}

}
