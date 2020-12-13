import java.util.Scanner;
public class RecursionWithOutloop {


	static int i=0;

	public static void main(String args[]){
		
		Animal animal= new Animal("puppy", 4);
		Dog dog= new Dog("rocky", 4, 20, "gold");
		dog.eat();
		
		
		
		//enter input
		Scanner input=new Scanner(System.in);
		boolean hasInt = input.hasNextInt(); // verifies the entered input is integer
		if(hasInt){
			String x=input.nextLine(); // for entering the string value.  Note: input mismatch exception will be thrown if string is entered instead of int
			System.out.println("firstName"+x);
			int z= input.nextInt(); //for entering integer values. no need of calling "input.nextline" before reading int input but should give if wanted to read any other input after reading int value 
			input.nextLine(); // this line should be called  before entering the next string @line14, if not added the next line will be skipped
			String y =input.nextLine();
			System.out.println("2nd Name"+y);

			i = factorial(z);
			System.out.println(i);
		}else
			System.out.println("invalid entry");

	}

	public static int factorial(int f) {
		if(f==1)
			return 1;
		else{
			f=f*factorial(f-1);
			System.out.println(f);
		}
		return f;
	}

}
