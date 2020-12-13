package dataStructures;


// refer single linked list class for insertion at starting node and index level and deletion  
public class LinkedListStack {
	
	Node head;
	
	public class Node {
		int value;
		Node next;
	}
	
	public LinkedListStack() {
		head = null;
	}
	
	public void push(int element){
		
		Node extraHead= head;
		System.out.println("Head ----> "+head);
		System.out.println("extraHead -------> "+extraHead);
		System.out.println("------------------------------");
		head= new Node();
			
		head.value=element;
		head.next=extraHead;
		System.out.println("Head ----> "+head);
		System.out.println("Head.next() ----> "+head.next);
		System.out.println("extraHead -------> "+extraHead);
		System.out.println("____________________________");
	}
	
	public int pop(){
		int value = head.value;
		System.out.println("head ----->"+head);
		head=head.next;
		System.out.println("head after head.next ----->"+head);
		return value; 
	}
	
		
	public static void main (String[] args){
		
		LinkedListStack listStack= new LinkedListStack();
				
		listStack.push(10);
		listStack.push(20);
		listStack.push(30);
		
		
		//prints all the values in the linkedlist
		Node node = listStack.head;
		while(node.next!=null){
			System.out.println(node.value);
			node = node.next;
		}
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("------------POP----------");
		System.out.println(listStack.pop());
		System.out.println(listStack.pop());
		
	} 
	
	
	
	
	
	

}
