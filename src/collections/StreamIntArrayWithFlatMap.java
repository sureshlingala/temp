package collections;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntArrayWithFlatMap {

	public static void main(String[] args){
		
		int data[] = {1,2,3,4,5,6,7,8,9};
		
		Stream<int[]> intArr=Stream.of(data);
		IntStream intStream = intArr.flatMapToInt(x->Arrays.stream(x));
		intStream.forEach(x->System.out.println(x));
	}
}
