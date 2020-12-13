package ImpPrograms;

public class FindOutMiddleIndex {
	
	public static void main(String[] args){
		
		int[] num = { 2, 4, 4, 5, 4, 1 };
		
		System.out.println("Left and right sequences sum's are equal at index  "+findMiddleIndex(num));
	}
	
	public static int findMiddleIndex(int[] num){
		
		int arrEndIndex = num.length-1;
		int arrStartIndex = 0;
		int sumRight = 0;
		int sumLeft = 0;
		while(true){
			
			if(sumLeft>sumRight){
				sumRight =+ num[arrEndIndex--];
			}else
				sumLeft =+ num[arrStartIndex++];
		
			if(arrStartIndex > arrEndIndex)
				if(sumLeft==sumRight){
					break;	
				}else
					System.out.println("enter a valid sequence");
	
		}
		return arrEndIndex;
	}

}
