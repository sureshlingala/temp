package collections;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args){
		
		//1. Using Iterate()
		// static(T seed, Unary operator<T>, F>)
		// return a stream -->Stream<T>
		
		List<Integer> collect = IntStream.iterate(1, n->n+2)
				.mapToObj(Integer::valueOf)
				.limit(10).collect(Collectors.toList());
		System.out.println(collect);
		
		//2. Using generate
		// static generate(supplier<T> s) //supplier will not have any inut but it will return values
		// random numbers -- 100
		
		List<Integer> randomValues=Stream.generate(()->new Random().nextInt(100)).limit(10).collect(Collectors.toList());
		System.out.println(randomValues);
		
	}
}
