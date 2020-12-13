package ImpPrograms;

public class SumOfEachDigit {

	int sum =0;
	
	
	//Using recursion
	public int summation(int Number){
		if(Number==0)
			return 0;
		sum +=Number%10;
		summation(Number/10);
	
		return sum;
	}
	
		
	public static void main(String[] args){
		
		SumOfEachDigit objref = new SumOfEachDigit();
		System.out.println(objref.summation(2525));
	}
}
