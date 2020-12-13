package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSynchronization {
	
	//1. Synchronization using Collections
	
	//Arryalist is not threadSafety, hence arrayList will need synchronization.
	// ThreadSafety - No conflicts should be occurred when, multiple threads access the same reference,
	public static void main(String[] args){
		List<String> syncArrList = Collections.synchronizedList(new ArrayList<String>());
		syncArrList.add("Suresh");
		syncArrList.add("Chinni");
		
		// for adding/removing element, synchronization will not be required.
		//but for fetching/traverse the values from list to list, synchronization will be required
		synchronized (syncArrList) {
	
			// loop using lambda
			
			syncArrList.forEach(ele->System.out.println(ele)); 
			
			// using Stream and lambda 
			
			syncArrList.stream().forEach(ele -> System.out.println(ele));
		
		}
		
		//2. Synchronization using CopyonWriteArrayList
		
		CopyOnWriteArrayList<String> syncArrayList2 = new CopyOnWriteArrayList<String>();
		syncArrayList2.add("Java");
		syncArrayList2.add("JavaScript");
		
		//unlike 1st process , we dont need to call Synchronization explicitly for copyOnwriteArrayList
		syncArrayList2.forEach(ele -> System.out.println(ele));
	}

}
