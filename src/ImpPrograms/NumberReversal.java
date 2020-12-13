package ImpPrograms;

public class NumberReversal {
	
	int y;
	
	
	//using recursion
	public int numReverseRecusrion(int x){
		if(x==0)
			return x;
		else {
			y=y*10+x%10;
			numReverseRecusrion(x/10);	
		
		return y;
		}
	}
	
	//using loop
	
	public int numreverse(int input){
		
		int reverse = 0;
		while(input!=0){
			reverse = (reverse*10)+(input%10);
			input = input/10;
		}
		
		return reverse;
	}
	
	public String numreverseConvertingToString(int input){
		
		int reverse =0;
		String reverseNumber ="";
		while(input!=0){
			reverse = (reverse*10)+(input%10);
			reverseNumber += String.valueOf(input%10);
			input = input/10;
		}
		
		return reverseNumber;
	}
	
	public static void main(String[] args){
		
		NumberReversal obj = new NumberReversal();
		System.out.println(obj.numreverse(9890)); //trailing 0 will not print since 0989 is nothing but 989. to print 0, use Strings
		System.out.println(obj.numreverseConvertingToString(9890));
	}

}
