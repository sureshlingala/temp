package patternProgram;

/*
Star pattern:
*
**
***
****

number pattern
1
12
123
1234

*/


import java.util.Scanner;

public class HalfPyramid {

	//using stars
	
	public void starPattern(int rows){
		
		for(int i=rows;i>=1;i--){
			
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void numberPattern(int rows){

		for(int i=rows;i>=1;i--){

			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void alPhabet(int rows){
		char alphabet = 'A';
		for(int i=rows;i>=1;i--){

			for(int j=1;j<=i;j++){
				System.out.print(alphabet+" ");
			}
			alphabet++;
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		int input =sc.nextInt();
		HalfPyramid objref = new HalfPyramid();
		objref.starPattern(input);
		System.out.println("--------------------");
		objref.numberPattern(input);
		System.out.println("--------------------");
		objref.alPhabet(input);
	}

}
