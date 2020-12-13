package salesforcePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference 
//between their sums is minimum. If there is a set S with n elements, then if we assume Subset1 has m elements, 
//Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.

public class MinSumDifference{

	public static void main(String[] args){
		
		List<Integer> parentSet= new ArrayList<>(Arrays.asList(1,2,3,90,4));
		minSum(parentSet);
		List<Integer> parentSet1= new ArrayList<>(Arrays.asList(1,2,3,14,15,16));
		minSum(parentSet1);
		
		List<Integer> parentSet2= new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
		minSum(parentSet2);
	}
	
	public static void minSum(List<Integer> set) {
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();

//        List<Integer> sortedSet = set.stream().sorted().collect(Collectors.toList());
//sorted set        
        set.sort((o1,o2)->{
        	return o1>o2?1:-1; 
        }) ;  	
        System.out.println(set);
        int totalSum = set.stream().mapToInt(Integer::intValue).sum();
//        int totalSum = set.stream().mapToInt(Integer::ValueOf).sum(); //both the lines returns same output
        int halfSum = totalSum/2;
        //put highest element n set1
        int maxElement = set.get(set.size()-1);
        set1.add(maxElement);

        int s1Sum = maxElement;
        int s2Sum = 0;
        for(int i=set.size()-2; i>=0; i--) { 
            int curr = set.get(i);
            if(s1Sum <= halfSum && s1Sum + curr <= halfSum) {
                set1.add(curr);
                s1Sum+=curr;
            } else {
                set2.add(curr);
                s2Sum+=curr;
            }
        }

        System.out.println("S1: sum = " + s1Sum);
        System.out.println("S2: sum = " + s2Sum);

    }

}
