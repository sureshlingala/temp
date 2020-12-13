package ImpPrograms;


//Converting String number to Int without using Integer.parseint
public class ConvertStringNumberToInt {

	public static int convertStringToInt(String value){
		
		int sum = 0;
		int zeroAscii = (int)'0'; //converting string value of 0 to Ascii value
		System.out.println(zeroAscii);
		char ch[] = value.toCharArray();
		
		for (char eachCh : ch) {
			int intCharAscii = (int)eachCh; //converting string values to Ascii value
			sum = sum*10 + (intCharAscii-zeroAscii);
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("Conversion of string \"2345\" is -> "+convertStringToInt("2345"));
	}

}
