package searchAndSortingTechniques;

import java.util.Arrays;
import java.util.stream.Stream;

//highly important

public class MergeSort {
	
	public int[] mergeSort(int arr[]){
		
		if(arr.length<2)
			return arr;
		
		int midPoint = arr.length/2;
		
		int left[] = new int[midPoint];
		
		int right[];
		
		if(arr.length %2 == 0)
			right = new int[midPoint];
		else
			right = new int[midPoint+1];
		
		for(int i=0;i<midPoint;i++){
			
			left[i] = arr[i];
		}
		for(int i=0;i<right.length;i++){
			
			right[i] = arr[midPoint+i];
		}
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		int result[] = new int[left.length+right.length];
		
		result =  merger(left, right);
		return result;
	}
	
	
	public static int[] merger(int left[], int right[]){
		
		int result[] = new int[left.length+right.length];
		
		int leftIndex = 0, rightIndex = 0, resultIndex=0;
		
		while(leftIndex<left.length||rightIndex<right.length){
			
			if(leftIndex<left.length && rightIndex<right.length){
				
				if(left[leftIndex]<right[rightIndex])
					
						result[resultIndex++] = left[leftIndex++];
				else
					result[resultIndex++] = right[rightIndex++];
				
			}else if(leftIndex<left.length){
				
				result[resultIndex++] = left[leftIndex++];
				
			}else if(rightIndex<right.length)
				
				result[resultIndex++] = right[rightIndex++];
		}
		
		return result;
		
	}
	

	public static void main(String[] args) {

		int arr[] = {5,4,3,2,1};
		MergeSort obj = new MergeSort();
		int result[] = obj.mergeSort(arr);
		for(int i:result){
			System.out.print(i + " ");
		}

	}

}
