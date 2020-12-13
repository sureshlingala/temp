package ImpPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//you have got a range of numbers between 1 to N, where one of the number is
//repeated. You need to write a program to find out the duplicate number
//note: this works only for seq of numbers, will not work for for random numbers
public class FindingDuplicateNumber {


	public static void main(String[] args){

		ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,5));
		
		System.out.println(duplicateNumber(l1));
		//Method 2
		Set<Integer> item = new HashSet<>();
		l1.stream().filter(x->!item.add(x)).forEach(x->System.out.print(x));
	}

	public static int duplicateNumber(List<Integer> l){

		int totalNumbers = l.size()-1;
		int duplicateNum= sum(l) -(totalNumbers*(totalNumbers+1)/2);
		return duplicateNum;

	}

	//sum using Streams
	public static int sum(List<Integer> l){
		Integer sum=	l.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum using reduce method :-> "+sum);
		Integer sum0=	l.stream().reduce(0, Integer::sum);
		System.out.println("Sum using reduce method1 :-> "+sum0);
		Integer sum1 =	l.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Sum using Collectors method :-> "+sum1);
		IntStream sumStream = l.stream().mapToInt(Integer::intValue);
		int sum2= sumStream.sum();
		System.out.println("Sum using mapToInt method :-> "+sum2);
//		IntStream sumStream1 = l.stream().mapToInt(Integer::valueOf);
//		int sum3= sumStream.sum();
//		System.out.println("Sum using mapToInt :-> "+sum3);
		
		return sum;
	}
}
