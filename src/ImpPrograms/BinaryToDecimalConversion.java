package ImpPrograms;

public class BinaryToDecimalConversion {

	public static int decimalConversion(int binary){
		
		int decimal = 0;
		int temp = binary;
		
		int power =0;
		while(true){
			if(temp ==0)
				break;
			else{
				decimal = decimal + (temp%10) * ((int) Math.pow(2, power));
				temp= temp/10;
				power++;
			}
		}
		
		return decimal;		
				
	}
	
	public static void main(String[] args) {
		 
		System.out.println(BinaryToDecimalConversion.decimalConversion(111));
		System.out.println(BinaryToDecimalConversion.decimalConversion(110));
	}

}
