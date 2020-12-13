package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FunctionalInterfaces {

	public static void main(String[] args){
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("Suresh", "Java", "Selenium", "GOT"));
		
		/** Interface Function<T,R> Type parameters:
		 * T - type of the input - can be anything - String/integer etc..
		 * R - type of the result - can be anything - String/integer etc..
		 * */
		System.out.println("--------Function Interface-----------");
		Function<String, Integer> func= x -> x.hashCode();
		System.out.println(func.apply("Test"));
		l1.forEach(x->{
			int y = func.apply(x);
			System.out.println("HashCode of each Element - " + y);
			
			});
		
		//Chaining function
		Function<Integer, Integer> func1 = x->x%10;
		l1.forEach(x->System.out.println(func.andThen(func1).apply(x)));
		
		System.out.println("---------Binary Operator Interface----------");
		/** BinaryOperator<T> - where T is the type of input can be anything 
		 * Binary Operator expects 2 operands of same type and result also will be of same type 
		 * Bifunction also can be used instead of binaryOperator which also expects 2 inputs of same type and result with same type 
		 *  */
		
		BinaryOperator<String> binOp= (x,y)->x.concat("_"+y);
		l1.forEach(x->System.out.println(binOp.apply(x, x)));
		// Using BiFunction
		
		ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		BiFunction<Integer, Integer, Integer>  biFunc= (x,y)->x + y;
		l2.forEach(x->System.out.println(biFunc.apply(x, x)));
		
		System.out.println("---------Unary Operator Interface----------");
		/**Unary Operator Interface performs only on one type of operand and return the result of same type 
		 * */

		UnaryOperator<String> unaryFunc = x->x.toUpperCase();
		l1.forEach(x->System.out.println(unaryFunc.apply(x)));
		
		l1.replaceAll(ele ->ele+"_Unary"); //replaceAll method will expect unary arguments
		System.out.println(l1);
		
		System.out.println("---------Predicate Interface----------");
		/** Predicate<T> : T can be any type. and it returns boolean type
		 *  */
		Predicate<String> predicateFunc = ele -> ele.length()>10; 
		List<String> l3=l1.stream().filter(predicateFunc).collect(Collectors.toList()); // filters the list with size greater than 10
		System.out.println(l3);
		
		Predicate<Integer> predicateFunc1 = ele->ele>3; 
		//filters elements greater than 3 in l2 list   
		List<Integer> resultList=l2.stream().filter(predicateFunc1).collect(Collectors.toList());
		System.out.println(resultList);
		
		//predicate with &&
		List<Integer> resultList1=l2.stream().filter(x->x>3 && x<6).collect(Collectors.toList());
		System.out.println(resultList1);
		
		//Predicate with Negate : Negate ignores the element, here in this scenario it ignore the elements with Sure
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("Suresh", "Sures", "Sure", "Java", "Jav", "Ja"));
		Predicate<String> ele= x->x.startsWith("Sure");
		List<String> resultList2=l4.stream().filter(ele.negate()).collect(Collectors.toList());
		System.out.println(resultList2);
		
		System.out.println("---------Consumer Interface----------");
		/** Consumer interface returns nothing i.e result is void
			hence it will b used during printing msg/ printing stacktrace  
		*/
		Consumer<String> consumerFunc = x->System.out.println(x+" Automation QA");
		Consumer<Integer> consumerFunc1 = x->System.out.println(x+" Automation QA");
		consumerFunc.accept("This is Suresh");
		l2.forEach(x->consumerFunc1.accept(x));
	
		System.out.println("---------Supplier Interface----------");
		/** Takes nothing but returns a result
		 *  */
		getText(()->"SupplierInterface - text msg");
		getText(()->"Suresh");
		
	}
	public static void getText(Supplier<String> text){
		System.out.println(text.get());
		System.out.println(text.get().length());
	}
	
	
}
