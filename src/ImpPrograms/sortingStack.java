package ImpPrograms;

import java.util.Stack;

public class sortingStack {
	
	
	public static void sort(Stack<Integer> input){
		Stack<Integer> tmpStack = new Stack<>();
		
		while(!input.isEmpty()){
			int temp = input.pop();
			
			while(!tmpStack.isEmpty()&&tmpStack.peek()>temp){
				int temp1 = tmpStack.pop();
				input.push(temp1);
			}
			
			tmpStack.add(temp);
			System.out.println("Temporary stack " +tmpStack);
			System.out.println("input stack " +input);
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Stack<Integer> input = new Stack<>();
		input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        System.out.println("stack input "+input);
        sort(input);
	}

}
