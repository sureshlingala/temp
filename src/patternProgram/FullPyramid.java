package patternProgram;

import java.util.Scanner;

public class FullPyramid {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		FullPyramid objref = new FullPyramid();
		objref.starPyramid(input);
		System.out.println("---------------------");
		objref.numberPyramid(input);
		System.out.println("---------------------");
		objref.numberPyramidIncrementalOrder(input);
	}
	
	public void starPyramid(int rows){
		int temp = rows;
		for(int i=1;i<rows;i++){
			for(int k=0;k<temp-1;k++){
				System.out.print(" ");
			}
			temp--;
			for(int j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void numberPyramid(int rows){
		int temp = rows;
		for(int i=1;i<rows;i++){
			for(int k=0;k<temp;k++){
				System.out.print(" ");
			}
			temp--;
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public void numberPyramidIncrementalOrder(int rows){
		int temp = rows;
		int Count =1;
		for(int i=1;i<rows;i++){
			for(int k=0;k<temp-1;k++){
				System.out.print(" ");
			}
			temp--;
			for(int j=1;j<=i;j++){
				System.out.print(Count+" ");
				Count++;
			}
			System.out.println();
		}
	}
	
	
}
