package ImpPrograms;

import java.io.InputStream;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonElementsInArray {

	public static void main(String[] args){
		
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,7,8,9,1,3,5};
	
		
		Stream<int[]> stream1 =Stream.of(arr1);
		Stream<int[]> stream2 =Stream.of(arr2);
		
		//method - 1	
		Arrays.stream(arr1).filter(a-> Arrays.stream(arr2).filter(x->x==a).count()>=1).forEach(System.out::println);
		
		System.out.println("-------------");
		//method - 2
		IntStream.of(arr1).filter(a-> IntStream.of(arr2).filter(x->x==a).count()>=1).forEach(System.out::println);
		System.out.println("-------method 3------");
		
//		method - 3 - is not printing any values
//		stream1.filter(a-> stream2.filter(x->x==a).count()>=1).forEach(System.out::println); //does not print values
//		IntStream s3=stream1.flatMapToInt(x->Arrays.stream(x)).map(x->x);
//		IntStream s4 = stream2.flatMapToInt(y->Arrays.stream(y)).map(y->y);
//		s3.filter(a-> s4.filter(x->x==a).count()>=1).forEach(System.out::println);
		
		//method 4 - using regular method 
		System.out.println("-------------");
		for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
	
	
	}
	
		
}
