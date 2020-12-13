package ImpPrograms;

import java.util.Arrays;

public class DisticntElements {

	public static void usingLoops(int arr[]){
		//method 1 - using for loops	
		 for(int i=0;i<arr.length;i++){
	            boolean isDistinct = false;
	            for(int j=0;j<i;j++){
	                if(arr[i] == arr[j]){
	                    isDistinct = true;
	                    break;
	                }
	            }
	            if(!isDistinct){
	                System.out.print(arr[i]+" ");
	            }
	        }
		 System.out.println(" ------------");
		 //method:2 using streams
		 Arrays.stream(arr).distinct().forEach(System.out::print);
	}
	
	public static void main(String[] args) {
		int arr[] = {5,2,7,2,4,7,8,2,3};
		usingLoops(arr);
	}

}
