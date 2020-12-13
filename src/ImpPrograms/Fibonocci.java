package ImpPrograms;

public class Fibonocci {

	public static void printFibonacciSeries(int count) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
	}

	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String args[]) {
		int n = 10;
		printFibonacciSeries(10);
		System.out.println("");
		System.out.println(fibonacci(n));
	}
}


