package salesforcePrograms;

//Find a 1st non-repeated char in the string for e.g. if string is "Salesforce is the best company to work for” returns 'l'
public class FindinfNonRepeatedChar {

	public static void main(String[] args){
		
		String s1=  "Salesforce is the best company to work for z";
		int count;
		char[] c1=s1.toLowerCase().toCharArray();
		for(int i=0; i<c1.length;i++){
			count=0;
			for(int j=i+1;j<c1.length;j++){
				if(c1[i]==c1[j]){
					count++;
					break;
				}	
			}
			if(count==0){
				System.out.println(c1[i]);
				break;
			}
		}		
	
	}
}
