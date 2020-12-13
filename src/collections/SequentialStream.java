package collections;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main(String[] args){
	
		//1
		Stream stream =Stream.of("Java", "Selenium", "Javascript", "Python");
//		stream.findFirst().ifPresent(x->System.out.println(x));
		stream.forEach(x->System.out.println(x));
		
		System.out.println("----------");
		//2
		Arrays.asList("a1","a2","a3").stream().findFirst().ifPresent(System.out::print);
		
		System.out.println("----------");
		//3
		IntStream.range(1, 25).forEach(System.out::println);
		
		System.out.println("----------");
		//4
		Arrays.stream(new int[]{1,2,3,4,5,6,7,8})
			.map(n -> 2*n+5).average().ifPresent(System.out::println);
		
		System.out.println("----------");
		
		//5
		Arrays.stream(new int[]{1,2,3,4,5,6,7})
//		.map(n -> 2*n+5)
		.average().ifPresent(System.out::println);
		
		System.out.println("----------");
		
		//6 String data objects
		Stream.of("a1","a2","a3","a4", "a111").map(a->a.substring(1))
		//.mapToInt(x->Integer.parseInt(x)) // can also be used 
		.mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		
		System.out.println("----------");
		
		//7 double to String objects
		Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(x->"appendex "+x).forEach(System.out::print);
		
		System.out.println("----------");
		
		//8. limit
		Stream.iterate(1, n->n+2).limit(10).forEach(System.out::print);
		
		System.out.println("----------");
		
		//10. odd mnumbers
		Stream.iterate(1, n->n+2).filter(x->x%2!=0).limit(10).forEach(System.out::print);
	}
}
