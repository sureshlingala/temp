package patternProgram;

import java.util.Scanner;

public class pascalTriangle {

	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		pascalTriangle objref = new pascalTriangle();
		objref.pascalPattern(input);
	}
	
	
	public void pascalPattern(int rows){
		int temp = rows;
		int printNum=1;
		for(int i=0;i<rows;i++){
			for(int k=0;k<temp;k++){
				System.out.print(" ");
			}
			temp--;
			for(int j=0;j<=i;j++ ){
				
				if(i==0||j==0){
					printNum = 1;
				}else
					printNum = printNum *(i-j+1)/j; //remember the formula
				
			System.out.print(printNum + " ");	
			}
			System.out.println();
		}
	}

	
}
