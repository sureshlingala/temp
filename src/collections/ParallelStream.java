package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {
	
	public static void main(String[] args){
		
		ForkJoinPool cores = ForkJoinPool.commonPool();
		System.out.println(cores.getParallelism()); // gives the number of cores available on the machine for ex: for I7 core processer 7 cores will be available
		
		System.out.println("------------");
		//1. parallel method on stream
		
		Stream<String> stream=Stream.of("Java", "Javascript", "Python", "UiPath");
		
		//using sequential 
		stream.forEach(System.out::println);
		
		System.out.println("------------");
		//using parallel - below script will run on different cores parallelly and prints all the values 
//		stream.parallel().forEach(System.out::println);
		Stream.of("Java", "Javascript", "Python", "UiPath").parallel().forEach(System.out::println);
		
		System.out.println("------------");
		
		//2. Use parallelSteam method on collections
		Arrays.asList("Java", "JavaScript","Python", "Ruby").parallelStream().forEach(System.out::println);
		
		//3. 1 to 10
		
		System.out.println("------------");
		
		//Normal Stream
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		System.out.println("------------");
		//parallel stream
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		//4. to print from a to z (97 till 122)
		System.out.println(getAlphabetList());
		//sequential stream
		getAlphabetList().stream().forEach(System.out::println);
		//parallel stream
		getAlphabetList().parallelStream().forEach(System.out::print);
		
		System.out.println("------------");
		//5. check if stream is parallel
		System.out.println(IntStream.rangeClosed(1, 10).isParallel());
		System.out.println(IntStream.rangeClosed(1, 10).parallel().isParallel());
		
		System.out.println("------------");
		//6. check if number is prime
		System.out.println(isPrime(7));
		System.out.println(isPrime(24));
		
		System.out.println("------------");
		
		long t1, t2, t3;
		t1 = System.currentTimeMillis();
		//using sequential stream
		long count  = Stream.iterate(0, n->n+1).limit(1000000).
				filter(ParallelStream::isPrime). 
				peek(System.out::println). //peek method consumes input
				count();
		System.out.println(count);
		t2 = System.currentTimeMillis();
		System.out.println("Total time " +(t2-t1)/1000);
		
		//using parallel  - //this will reduce the total time of execution
		long count1  = Stream.iterate(0, n->n+1).limit(50).
				parallel().
				filter(ParallelStream::isPrime). 
				peek(System.out::println). //peek method consumes input
				count();
		System.out.println(count);
		
		t3 = System.currentTimeMillis();
		System.out.println("Total time " +(t3-t2)/1000);
	}

	public static List<String> getAlphabetList(){
		List<String> alpha = new ArrayList<String>();
		int n = 97;
		while(n<=122){
			char c = (char)n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
	}
	
	public static boolean isPrime(int number){
		if(number <=1){
			return false;
		}
		else
			return !IntStream.rangeClosed(2, number/2).anyMatch(x->number%x==0);
	}
}
