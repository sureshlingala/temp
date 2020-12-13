package ImpPrograms;

//Armstrong numbers are the sum of their own digits to the power of
//the number of digits. It is also known as narcissistic numbers.
public class ArmStrongNumber {
	
	public Boolean isArmStrong(int number){
		
		int temp = number;
		int length = String.valueOf(number).length();
		int sum =0;
		if(number==0)
			return false;
		else{
			while(temp>0){
				sum += (int) Math.pow(temp%10,length);
				System.out.println(sum);
				temp = temp/10;
			}
		}
		if(sum ==number)
			return true;
		return false;
	}
	
	public static void main(String[] args){
		ArmStrongNumber objref = new ArmStrongNumber();
		System.out.println(objref.isArmStrong(371));
		
	}

}
