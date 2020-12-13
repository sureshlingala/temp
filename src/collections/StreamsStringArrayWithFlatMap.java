package collections;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {

	public static void main(String[] args) {
		
		String data[][] = new String[][]{
			
			{"Suresh","27"},
			{"Prasanth","29"},
			{"Satish", "33"},
			{"Trishika", "3"}
		};
		
		/** Below code is for converting array to streams and performing operations on the streamResult, but this will not give 
		 * proper results though it does not throw any compile time errors ***/
		Stream<String[]> dataArr =Arrays.stream(data);
		Stream<String[]> filteredStreamArray=dataArr.filter(x->x.equals("Suresh"));
		filteredStreamArray.forEach(System.out::println); //printing all the values using method reference.

//		below steps are for printing the count 
//		long value= filteredStreamArray.count();
//		System.out.println(value);
		
		/*** Applying FlatMap is the solution for the above issue **/
		Stream<String[]> dataStream =Arrays.stream(data);
		Stream<String> mapperStream =dataStream.flatMap(x->Arrays.stream(x));
		Stream<String> filteredFlatMap = mapperStream.filter(x->x.equals("Suresh"));
		filteredFlatMap.forEach(System.out::println);
	
		//shortform of above code
		String result = Arrays.stream(data).flatMap(x->Arrays.stream(x)).filter(x->x.equals("Trishika")).findAny().orElse(null);
		System.out.println(result);
	}

}
