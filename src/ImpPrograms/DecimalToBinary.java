package ImpPrograms;


//Write a program to convert decimal number to binary format using numeric operations. 
//Below example shows how to convert decimal number to binary format using numeric operations.

public class DecimalToBinary {
	
	
	int index = 0;
	public void binaryConversion(int input){
		
		int binary[] = new int[input];
		
		while(input>0){
			binary[index++] = input%2;
			input = input/2;
		}
		
		for(int i = index-1; i>=0;i--){
			System.out.print(binary[i]);
		}
	}
	
	
	
	public static void main(String args[]){
		
		DecimalToBinary obj = new DecimalToBinary();
		obj.binaryConversion(30); //again converting binary format to int we should multiple each binary digit to 2^index
	}

}
