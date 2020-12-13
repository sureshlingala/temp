package ImpPrograms;

public class PerfectNumber {

	public Boolean isPerfectNumber(int num){
		
		int number=0;
		for(int i=1;i<=num/2;i++){
			
			if(num%i ==0){
				number+=i;
			}
		}
		if(number ==num)
			return true;
		return false;
	}
	

	
	public static void main(String[] args) {
		 PerfectNumber obj = new PerfectNumber();
		 System.out.println(obj.isPerfectNumber(6));
	}

}
