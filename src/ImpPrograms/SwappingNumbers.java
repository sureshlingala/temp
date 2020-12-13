package ImpPrograms;

public class SwappingNumbers {
	
	public void Swap(int a, int b){
		System.out.println("before Swapping : " + "a = "+a + "; b="+b);
		
		// Method 1 - without using 3rd variable
		b = b+a; // b = 15
		a = b-a; // a = 10
		b= b-a; // b = 5
		System.out.println("after Swapping : " + "a = "+a + "; b="+b);
		
		//Method 2 - with 3rd variable
//		int temp;
//		temp = b;
//		b=a;
//		a = temp;
//		System.out.println("after Swapping : " + "a = "+a + "; b="+b);
	}

	public static void main(String[] args){
		SwappingNumbers swapPbj = new SwappingNumbers();
		swapPbj.Swap(5, 10);
	}
}
