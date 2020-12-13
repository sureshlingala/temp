package ImpPrograms;

import java.util.stream.IntStream;

public class SumOfPrimeNumbers {

	//using Streams
	public static int printSumUsingStreams(){
		
		System.out.println(IntStream.iterate(2, n->n+1).filter(SumOfPrimeNumbers::isPrime).limit(1000).sum());
		return IntStream.rangeClosed(2, 7950).filter(SumOfPrimeNumbers::isPrime).limit(1000).sum();
	}
	
	
	public static void primeSum(int range){
		int sum=0;
		int number = 2;
		while(range>0){
			
			if(isPrime(number)){
				sum += number;
				range --; 
			}
//			range--; // to print sum of first 1000 prime numbers it should be placed inside if block
			number++;
			
		}
		System.out.println(sum);
	}
	
	public static void primeSumBlogMethod(){
		
		int number = 2;
        int count = 0;
        long sum = 0;
        while(count < 1000){
            if(isPrime(number)){
                sum += number;
                count++;
            }
            number++;
        }
        System.out.println(sum);
		
	}
	
	public static Boolean isPrime(int number){
		for(int i=2;i<=number/2;i++){
			if(number%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		primeSum(1000);
		primeSumBlogMethod();
		System.out.println(printSumUsingStreams());
	}

}
