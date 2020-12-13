package ImpPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringPrograms {

	public static void swap(char input[], int index){
		
		char temp = input[index-1];
		input[index-1] = input[index];
		input[index] = temp;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		String input  = sc.nextLine();
		System.out.println("Enter char");
		String c = sc.nextLine();
		int i;
		char charInput[] = input.toString().toCharArray();
		
		//method: 2
		
		for(i=0;i<charInput.length;i++){

			if(charInput[i]==c.charAt(0)){
				break;
			}
		}
		List<Character> li = new ArrayList<Character>();
		
		for(char ch:charInput){
			li.add(ch);
		}
		
		if(i==0){
			li.add(charInput.length-1-1,charInput[i]);
			li.remove(i);
		}else{
			char temp = li.get(i-1);
			li.add(li.indexOf(charInput[i])-1,charInput[i]);
			li.remove(i+1);
			li.add(i,temp);
			li.remove(i+1);
		}
		StringBuffer sb = new StringBuffer();
		li.stream().forEach(x->sb.append(x));
		System.out.println(sb);
			
	
	
//	//method: 1
//	for(i=0;i<charInput.length;i++){
//		
//		if(charInput[i]==c.charAt(0)){
//			
//			if(i==0){
//				char temp = charInput[charInput.length-1];
//				charInput[charInput.length-1]  = charInput[i];
//				charInput[charInput.length] = temp;
////				for(char ch:charInput){
////					if(charInput[ch]==charInput[i]){
////						
////					}else{
////						charOutput[ch] = charInput[ch];
////					}
////						
////					
////				}
//			}
//			else
//				swap(charInput, i);
//			break;
//		}
//	}
//	
//	System.out.println(Arrays.toString(charInput));
}
}
