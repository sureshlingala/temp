package searchAndSortingTechniques;

/** search by element */
public class LinearSearch {

	public static void main(String[] args) {

		int a[] = {1,3,5,9,2,6,10};
		int search = 2;
		for(int i=0;i<a.length;i++){
			
			if(a[i]==search){
				System.out.println(search + " available at index " +i);
			}
		}

		
		System.out.println(linearSearchRecursion(a, 0 ,a.length-1, search));
	}

	//using recursion
	
	
	public static int linearSearchRecursion(int arr[],int start, int length, int search){
		
		if(length<start)
			return -1;
		else
			if(arr[start] ==search)
				return start;
		
		return linearSearchRecursion(arr, start+1, length, search);
	}
	
	
}
