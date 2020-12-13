package patternProgram;

import java.util.Scanner;

public class NumbersPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		NumbersPattern objref = new NumbersPattern();
		objref.numberPattern(input);
		System.out.println("--------------------");
		objref.numberPattern1(input);

	}

	public void numberPattern(int input){
		int temp = 2*input;		
		for(int i=1;i<=input;i++){
			
			for(int k=0;k<temp;k++){
				System.out.print(" ");
			}
			temp--;
			temp--;
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
	
	public void numberPattern1(int input){
		int temp = 2*input;	
		int count=1;
		for(int i=1;i<=input;i++){
			
			for(int k=0;k<temp;k++){
				System.out.print(" ");
			}
			temp--;
			temp--;
			for(int j=1;j<=i;j++){
				System.out.print(count+" ");
				count++;
			}
			
			for(int j=i-1;j>=1;j--){
				count--;
				System.out.print(count-1+" ");
			}
			System.out.println();
		}

	}

}
