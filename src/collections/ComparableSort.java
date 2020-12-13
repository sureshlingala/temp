package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSort {
	
	public static void main(String[] args){
		
		ArrayList<Laptop> lap = new ArrayList<>();
		
		lap.add(new Laptop("Dell", 8, 50000));
		lap.add(new Laptop("Mac", 16, 150000));
		lap.add(new Laptop("HP", 6, 45000));
		
		Collections.sort(lap);
		
		lap.forEach(ele -> System.out.println(ele));
	} 

}
