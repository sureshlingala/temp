package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListPossibleLoops {
	static int ele;
	public static void main(String[] args){
		ArrayList<Integer> marksList = new ArrayList <Integer>();
		marksList.add(100);
		marksList.add(90);
		marksList.add(80);
		marksList.add(70);
		marksList.add(60);
		
		// 1. for loop
		
		//2. for each
		for(int i:marksList){
			System.out.println(i);
		}
		System.out.println("------------");
		
		//3. JDK 8 - Streams with lambda
		marksList.stream().forEach(eachScore -> System.out.print(eachScore+ " "));
		System.out.println("--------------");
		marksList.stream().forEach(x->System.out.print((ele=(x/2))+" "));
		System.out.println(marksList);
		System.out.print(ele);
		System.out.println("--------------");

		//4. iterator
		Iterator<Integer> itr= marksList.iterator();
		while(itr.hasNext()){
			int ele1=itr.next();
			System.out.println(ele1);
		}
		System.out.println("--------------");
		//5.  using iterator and for eachremaining method
		itr = marksList.iterator();
		itr.forEachRemaining(ele->System.out.println(ele));
		
		System.out.println("--------------");
		//6. using list iterator which raverse in both forwards and in a reverse order
		ListIterator<Integer> marks=marksList.listIterator(marksList.size());
		while(marks.hasPrevious()){
			int eachMark= marks.previous();
			System.out.println(eachMark);
		}
	}

}
