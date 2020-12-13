package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSort {
	
	public static void main(String[] args){
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(2500);
		l1.add(2999);
		l1.add(1888);
		l1.add(2222);
		Collections.sort(l1); //sorting based on all the digits
		System.out.println(l1);
		
		// Comparator to sort
		// Anonymous class - since Comparator is interface we cannot create object and this can be achieved using anonymous class as below 
		Comparator<Integer> sorting= new Comparator<Integer>() { 
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10>o2%10)
					return 1;
				return -1;
			}
		};
		Collections.sort(l1, sorting); // Sorting based on 1st digit
		System.out.println(l1);
		
		//above process can be simplified with lambda
		//in lambda, no need of calling Comparator obj and the method instead we just need to call the method arguments.
		Collections.sort(l1, (o1,o2)->{ 
			if(o1%10>o2%10)
				return 1;
			
			else
				return -1;
						
		});
		System.out.println(l1);
	}
}
