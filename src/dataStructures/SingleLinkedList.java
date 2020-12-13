package dataStructures;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class SingleLinkedList {

	Node head; // initially head will be null

	public class Node{
		int value;
		Node next;
	}

	public SingleLinkedList() {
		this.head = null;
	}

	//insertion
	public void push(int data){

		Node node = new Node();
		node.value = data;
		node.next = null;

		if(head==null)
			head=node; // node address wll be assigned to head 
		else{
			Node n=head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=node; // node address will be assigned to next variable
		}

	}

	//Insertion at start of the node
	public void insertAtStart(int data){

		Node node = new Node();
		node.value = data;
		node.next = head; //head address is assigned to next variable 
		head = node; // and new node address will be assigned back to head which will point the first address 
	}

	//insertion at index
	public void insertAtIndex(int index, int data){

		Node node = new Node();
		node.value = data;
		if(index==0)
			insertAtStart(data);
		else{
			Node n = head;
			for(int i=0;i<index-1;i++){ //index-1 is given coz n.next will refer the next node 
				n=n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	//deletion
	public void deletion(int index){

		if(index==0){
			head =head.next;
		}else{
			Node n = head;
			Node n1;
			for(int i=0;i<index-1;i++){
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println(n1.value + " is deleted");
		}

	}

	//finding middle element
	public void findMiddleElement(){
		int count =0;
		Node n = head;
		Node n1 = head;
		while(n.next!=null){
			count++;
			n=n.next;
		}

		count = count/2;
		while(n1!=null){
			n1 = n1.next;
			count--;
			if(count==0)
				System.out.println("middle element "+ n1.value);
		}
	}

	//printing all the values from the linkedList
	public void show(){
		Node n= head;
		while(n.next!=null){
			System.out.println(n.value);
			n=n.next;
		}	
	}
	
	public void show1(Node node){
		Node n= node;
		while(n!=null){  //here n will be Node, n.next will be pointer
			System.out.println(n.value);
			n=n.next;
		}	
	}
	
	
	//verifies if the linkedlist is circularLinkedList
	public Boolean isCircularLinkedList(){
		if(head == null) {
            return Boolean.FALSE;
        }
        Node temp = head;
        do {
            temp = temp.next;
        } while(temp != null && temp != head);
 
        return (temp == head);
	}

	//Verifying if the linkedList is palindrome
	public boolean isPalindrome() {

		Node tempNode = head;
		Node tempNode1 = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(tempNode != null) {
			stack.push(tempNode.value);
			tempNode = tempNode.next;
		}
		while(tempNode1 != null) {
			if(tempNode1.value != stack.pop()) {
				return Boolean.FALSE;
			}
			tempNode1 = tempNode1.next;
		}

		return Boolean.TRUE;
	}

	//removes duplicates only for sorted linked list
	
	public void deleteDuplicates() {
		// copy head node to temp current node
		Node curr = head;
		Stack<Integer> stack = new Stack<Integer>();
		
		// Traverse the linked list
		while(curr != null) {
			// copy current node to temp node.
			Node temp = curr;
			stack.push(curr.value);
		
			/**
			 * Compare the current node with next nodes data and
			 * keep on continue comparing as long as current nodes
			 * data is matching with other nodes.
			 */
			
			while(temp != null && temp.value == curr.value){
					temp = temp.next;
			}
			
			
			/**
			 * Set current node next pointer to the node which has
			 * different data value.
			 */
			curr.next = temp;
			curr = curr.next;
		
		}

		while(!stack.empty())
			System.out.println(stack.pop());
	}
	
	//Find if list is a loop
	//using  Floyd’s Cycle-Finding Algorithm - refer https://www.java2novice.com/java-interview-programs/find-loop-lenght-in-linkedlist/
	
	public boolean linkedListFindingLoop(){
		
		Node slowMove = head;
		Node fastMove = head;
		while(slowMove!=null && fastMove!=null&&fastMove.next!=null){
			
			slowMove = slowMove.next;
			fastMove = fastMove.next.next;
			
			if(slowMove == fastMove){
				System.out.println(" Total  number of nodes in a loop is - " + findingLengthOfLoop(slowMove));
				breakLoop(slowMove,head);
				return true;
			}
		}
		
		return false;
		
	}
	
	public int findingLengthOfLoop(Node specificNode){
		
		int count = 1;
		Node tempNode = specificNode;
		while(tempNode.next!=specificNode){
			count++;
			tempNode = tempNode.next;
		}
		
		return count;
	}
	
	public void breakLoop(Node specificNode, Node head){
		
		Node p1 = specificNode;
		Node p2 = specificNode;
		int count=1;
		
		while(p1.next!=p2){
			count++;
			p1 = p1.next;
		}
		p1 = head;
		p2 = head;
		
		for(int i=0;i<count;i++){
			p2 = p2.next;
		}
		
		//moving both p1 and p2 at the same pace
		while(p1!=p2){
			p1= p1.next;
			p2=p2.next;
			
		}
		while(p2.next!=p1){
			p2=p2.next;
		}
		p2.next =null;
	}
	
	
	public Node reverseSinglyLinkedList(){
		
		Node curr = head;
		Node previous = null;
		Node next = null;
		
		while(curr!=null){
			
			next = curr.next;
			curr.next = previous;
			previous = curr;
			curr = next;
		}
		return previous;
	}
	

	public static void main(String[] args){
		SingleLinkedList l1 = new SingleLinkedList();
		l1.push(10);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		l1.push(40);
		l1.push(50);
		l1.push(50);
		//		l1.show();
//		l1.insertAtStart(5);
//		l1.insertAtIndex(2, 99);
//		l1.push(50);
//		l1.push(40);
//		l1.push(30);
//		l1.push(20);
//		l1.push(99);
//		l1.push(10);
//		l1.push(5);
		System.out.println(l1.isPalindrome());
		l1.deletion(1);
		l1.show();
		l1.findMiddleElement();
		l1.deleteDuplicates();
//		l1.show();
		System.out.println("is Loop detected " + l1.linkedListFindingLoop());
		Node  reverseLastNode= l1.reverseSinglyLinkedList();
		l1.show1(reverseLastNode);
		System.out.println("is circularLinkedList -> "+l1.isCircularLinkedList());
		
	}
}
