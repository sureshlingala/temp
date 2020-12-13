package searchAndSortingTechniques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// searches splitting the array at middle index
public class BinarySearch {
	
	public static int searchUsingRecursion(int arr[],int start, int middleIndex, int end, int search){
		
		if(start>middleIndex)
			return start;
		else if(search ==arr[middleIndex]){
			return middleIndex;
		}else{
			if(search>arr[middleIndex]){
				start = middleIndex+1;
				middleIndex = (start+end)/2;
			}else{
				end = middleIndex;
				middleIndex = (start+end)/2;
			}
		}
			
			return searchUsingRecursion(arr, start, middleIndex, end, search);
			
	}
	
	public static void withOutRecursion(int arr[],int search){
		int n = arr.length;
		int mid = (0+arr.length)/2;
		int start = 0;
		
		while(start<n){
			if(search>arr[mid]){
				start = mid+1;
				mid = (start+n)/2;
			}
			else if(search<arr[mid]){
				n = mid-1;
				mid = (start+n)/2;
			}
			if(search == arr[mid]){
				System.out.println("found search "+ arr[mid] +" @ " + mid);
				break;
			}
		}

	}
	
	public static void main(String[] args){
		
		int arr[] = {1,2,3,5,6,9,12,15,20};
		int search = 9;
		System.out.println(searchUsingRecursion(arr, 0, arr.length/2, arr.length-1, search));
		withOutRecursion(arr, 15);
		
	}
	
	

}
