package searchAndSortingTechniques;

import java.util.Arrays;

public class InsertionSort {

	
	public static void insertionSort1(int array[]) {
        
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && (array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
            Arrays.stream(array).forEach(x->System.out.print(x + " "));
            System.out.println("-----------");
            printNumbers(array);
        }
    }
	
	public static void printNumbers(int[] input){
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
//		int arr[] = {5,20,2,12,30,7,15,1};
		int arr[] = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		System.out.println(Arrays.toString(arr));
		System.out.println("------Input-------");
		insertionSort1(arr);
	}

}
