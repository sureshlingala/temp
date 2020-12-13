package ImpPrograms;

public class StringReverse {
	
	public void stringRev(String input){

		//method 1 : Using StringBuilder
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		System.out.println(sb);
		
		//method 2: converting input to charArray
		
		String revValue = "";
		char[] rev=input.toCharArray();
		for(int i = rev.length- 1; i>=0;i--){
			
			revValue += rev[i];
			
		}
		System.out.println(revValue);
		
	}
	
	//using recursiion
	
	public String StringReversal(String input){
		
		String reverseStr = "" ;
		if(input.length()==1){
			return input;
		}else{
			reverseStr =reverseStr + input.charAt(input.length()-1)+StringReversal(input.substring(0, input.length()-1));
			return reverseStr;
		}
			
	}
	
	public static void main (String[] args){
		
		StringReverse sr = new StringReverse();
		sr.stringRev("Suresh");
		System.out.println(sr.StringReversal("hseruS"));
	}

}
