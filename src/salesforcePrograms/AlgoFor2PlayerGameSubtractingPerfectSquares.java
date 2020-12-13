package salesforcePrograms;

import java.util.Arrays;
import java.util.Scanner;

//Code an algorithm for a game consisting of two players. The input is a positive integer x. 
//Each round, a player deducts a perfect square from the number. The player can choose any perfect square as long as 
//it is less than or equal to the current number and greater than 0. The current player wins if the number becomes 0 
//after his deduction.
public class AlgoFor2PlayerGameSubtractingPerfectSquares {

	public static void main(String[] args) {
		int number = 0;
		int count = 1;
		int player = 1;
		System.out.println("Please Enter a positive integer");
		try (Scanner sc = new Scanner(System.in);) {
			number = sc.nextInt();
			while (number > 0) {
				int numberArray[] = generatePerfectSquare(1, number);
				System.out.println("===================");
				System.out.println("perfect square numbers");
				for (int i : numberArray) {
					System.out.print(i);
					System.out.print("   ");
				}
				System.out.println("");
				System.out.println("===================");

				player = ((count % 2 == 0) ? 2 : 1);
				System.out.println("Round : " + count + "   Player : " + player);
				System.out.println("Please Enter your prefered perfect square number");

				number = number - sc.nextInt();
				if (number <= 0) {
					System.out.println("****************");
					System.out.println("You won the game");
					System.out.println("===================");
				} else {
					System.out.println("===================");
					System.out.println("You should try more");
					System.out.println("===================");
				}
				count++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static int[] generatePerfectSquare(int start, int end) {

		if (start > end || start < 0) {
			throw new IllegalArgumentException();
		}
		int[] perfectSquares = new int[end - start];
		int n = 0;
		int candidate = (int) Math.ceil(Math.sqrt(start));
		int square;
		while ((square = candidate * candidate) < end) {
			perfectSquares[n++] = square;
			candidate++;
		}
		return Arrays.copyOf(perfectSquares, n);
	}

}
