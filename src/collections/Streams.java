package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args){
	
		ArrayList<String> arrayListStreams = new ArrayList<>(Arrays.asList("Suresh", "Prasanth", "Satish", "Trishika"));
		
		//all match predicate
		boolean flag = arrayListStreams.stream().allMatch(x->x.equals("Sunitha"));
		System.out.println(flag);
		
		System.out.println("---------------------");
		//looping
		arrayListStreams.forEach(ele -> System.out.println(ele));
		
		System.out.println("---------------------");
		//Filter
		List<String> result = arrayListStreams.stream().filter(name-> !name.equals("Suresh")).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		System.out.println("---------------------");
		List<Customer> customerDetails = new ArrayList<>(Arrays.asList(new Customer("LPRAO", 56), new Customer("Sasi", 50)));
		customerDetails.add(new Customer("Suresh", 27));
		customerDetails.add(new Customer("Satish", 33));
		customerDetails.add(new Customer("Prasanth", 29));
		
		Customer value = customerDetails.stream(). //Converts list to Stream
						filter(x->x.getName().equals("Trishika")) //filter with trishika
						.findAny() //returns if it finds any
						.orElse(null);
		
		System.out.println(value);
		
		Customer value1 = customerDetails.stream(). //Converts list to Stream
				filter(x->x.getName().equals("Suresh")) //filter with Suresh
				.findAny() //returns if it finds any
				.orElse(null);
		System.out.println(value1.getName() + " - " +value1.getAge());
		
		System.out.println("---------------------");
		
		//Filtering with multiple conditions
		
		Customer value3 = customerDetails.stream(). //Converts list to Stream
		filter(x->x.getName().equals("Satish") && x.getAge() ==33) //filter with Suresh
		.findAny() //returns if it finds any
		.orElse(null);
		System.out.println(value3.getAge());
		
		System.out.println("---------------------");
		
		//Using Map
//		customerDetails
		// customer::getName is a method reference here
		Stream < String> customerList =customerDetails.stream().map(Customer::getName);
		customerList.forEach(x->System.out.println(x));
		
		System.out.println("---------------------");
		List < String> customerList1 =customerDetails.stream().map(Customer::getName).collect(Collectors.toList());
		customerList1.forEach(x->System.out.println(x));

		System.out.println("---------------------");
		//filtering and maps
		String name = customerDetails.stream().filter(x->x.getName().equals("Suresh")).map(Customer::getName).findAny().orElse(null);
		System.out.println(name);
		System.out.println("---------------------");
		//Printing all the names from list
		List<String> namesList = customerDetails.stream().filter(x->!x.getName().equals("Suresh")).map(Customer::getName).collect(Collectors.toList());
		
		namesList.forEach(System.out::println);
	}
	
}
