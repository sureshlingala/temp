package salesforcePrograms;

import java.util.Arrays;

public class StringManipulator {
	
	public static void main(String[] args){
		stringPattern("aaabbddccgbbac");
	}
	public static void stringPattern(String str){
        char[] letters = str.toLowerCase().toCharArray();
    //    Arrays.sort(letters); adding this line will print a5b2c2d2g1
        int count =1;
        String updatevalue = "";
        StringBuilder s1= new StringBuilder();
        for(int i=0;i<letters.length;i++){
        	
        	if(i==letters.length-1){
        		s1.append(letters[i]).append(count);
        		updatevalue=updatevalue+letters[i]+count;
        		break;
        	}
        	if(letters[i]==letters[i+1])
        		count++;
        	else{
        		updatevalue=updatevalue+letters[i]+count;
        		s1.append(letters[i]).append(count);
        		count=1;
        	}
        	
        
        }
        
//        int counter =1;
//        StringBuilder sb = new StringBuilder();
//        System.out.println("Print length:"+letters.length);
//        for(int i=0;i<letters.length;i++){
//            if(letters.length == i+1){
//               sb.append(letters[i]).append(counter);
//                break;
//            }
//            if(letters[i]==letters[i+1]){
//                counter=counter+1;
//            }else{
//                sb.append(letters[i]).append(counter);
//                counter=1;
//            }
//        }
        System.out.println(s1);
        System.out.println(updatevalue);
    }

}
