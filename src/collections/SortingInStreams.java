package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingInStreams {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Selenium", "Python", "JavaScript", "Ruby"));
		
		//1. using sorted method
		list.stream().sorted().forEach(System.out::println);;

		System.out.println("----------------");
		//2. using comparator natural order
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		System.out.println("----------------");
		//3. using Compare to method and lambda
		list.stream().sorted((x1,x2)->x1.compareTo(x2)).forEach(System.out::println);
		
		System.out.println("----------------");
		
		/** Descending order **/
		//4. using reverseOrder
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("----------------");
		//5. using compareTo method and lambda
		list.stream().sorted((x1,x2)->x2.compareTo(x1)).forEach(System.out::println);
		
		System.out.println("----------------");
	
		//6. sort employees using sort
		
		SortingInStreams objref = new SortingInStreams();
		
		List<employee> emp = new ArrayList<>();
		emp.add(objref.new employee(10,"Java",30, 10000));
		emp.add(objref.new employee(20,"Selenium",20, 20000));
		emp.add(objref.new employee(30,"Ruby",10, 30000));
		emp.add(objref.new employee(40,"Python",10, 15000));
		
		Collections.sort(emp, new Comparator<employee>() {

			@Override
			public int compare(employee o1, employee o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
		});
		System.out.println("xxxxxxxxx " + emp);

		emp.stream().sorted(new Comparator<employee>() {

			@Override
			public int compare(employee o1, employee o2) {
				
				return o1.getSalary()-o2.getSalary();
			}
			
		}).forEach(System.out::println);
		
		System.out.println("----------------");
		
		// updating above code using lambda
		emp.stream().sorted((employee o1, employee o2) -> {
			return o1.getAge()-o2.getAge();
		}).forEach(System.out::println);
		
		System.out.println("----------------");
		
		//7. Sorting using comparator comparing
		emp.stream().sorted(Comparator.comparing(employee::getName)).forEach(System.out::println);
		
		//8. Sorting using comparator comparingLong
		System.out.println("----------------");
		emp.stream().sorted(Comparator.comparingLong(employee::getId)).forEach(System.out::println);
		
		//9. reverse
		System.out.println("----------------");
		emp.stream().sorted(Comparator.comparingInt(employee::getId).reversed()).forEach(System.out::println);
		
	}
	
	public class employee{
		
		int id;
		String name;
		int age;
		int salary;
		
		public employee(int i, String string, int j, int k) {
			this.id = i;
			this.name = string;
			this.age = j;
			this.salary = k;
		}
		
		@Override
		public String toString() {
			return "employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		
	}

}
