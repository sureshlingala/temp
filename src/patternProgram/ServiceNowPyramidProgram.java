package patternProgram;

import java.util.ArrayList;

/*
1
1 2
2 3 5
5 7 10 15

*/


public class ServiceNowPyramidProgram {

	public void pattern(int rows){
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(1);
		int count=0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<i+1;j++){
				if(j==0){
					b.add(a.get(a.size()-1));
					count=0;
				}else{
					
					b.add(b.get(j-1)+a.get(count));
					count++;
				}
			}
			System.out.println(b);
			a.clear();
			a.addAll(b);
			b.clear();
		
		}
		
	}
	
	
	public static void main(String args[]){
		
		ServiceNowPyramidProgram objref = new ServiceNowPyramidProgram();
		objref.pattern(5);
		
	}
	
	
	
}
