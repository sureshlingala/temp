package dataStructures;

public class ImpStackWithArrays {

	int size;
	int arr[];
	int top;

	public ImpStackWithArrays(int size) {
		this.size=size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int item){
		if(!isFull()){
			top++;
			arr[top]=item;
			System.out.println(item + " - Element pushed to stack");

		}else
			System.out.println("Stack is full " + item + " - is not added");

	}

	public int pop(){
		if(!isEmpty()){
			int popItem=top;
			top--;
			System.out.println("Popped Element -> "+arr[popItem]);
			return arr[popItem];
		}else{
			System.out.println("stack is empty");
			return -1;
		}
	}

	/**Peek will always return the top element of the stack */
	public int peek(){
		if(!isEmpty()){
			return arr[top];
		}else{
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public boolean isEmpty(){
		return top==-1;
	}

	public boolean isFull(){

		return size-1==top;
	}
	
	public static void main(String args[]){
		
		ImpStackWithArrays stackObj= new ImpStackWithArrays(5);
		System.out.println(stackObj.isEmpty());
		System.out.println(stackObj.isFull());
		System.out.println(stackObj.size);
		System.out.println("--------------------");
		stackObj.push(500);
		stackObj.push(1000);
		stackObj.push(1500);
		stackObj.push(2000);
		stackObj.push(2500);
		stackObj.push(3000);
		System.out.println("--------------------");
		stackObj.pop();
		stackObj.pop();
		stackObj.pop();
		System.out.println("--------------------");
		System.out.println(stackObj.peek());
		System.out.println("--------------------");
//		stackObj.push(3000);
//		stackObj.push(3500);
		System.out.println(stackObj.arr[0]);
		System.out.println(stackObj.arr[1]);
		System.out.println(stackObj.arr[2]);
		System.out.println(stackObj.arr[3]);
		System.out.println(stackObj.arr[4]);
				
	}

}
