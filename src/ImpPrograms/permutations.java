package ImpPrograms;

import java.util.ArrayList;
import java.util.List;

public class permutations {

	
	public static List<String> generatePermutaion(String input){
		List<String> strInput = new ArrayList<>();
		permutation("",input,strInput);
		return strInput;
	}
	
	public static void permutation(String concateChars, String input, List<String> list){
		
		if(input.isEmpty()){
			list.add(concateChars + input);
			return;
		}
		for(int i=0;i<input.length();i++){
			permutation(concateChars+input.charAt(i),input.substring(0,i)+input.substring(i+1),list);
		}
			
	}
	
	public static void main(String[] args) {
	
		System.out.println(generatePermutaion("xyz"));
	}

}
