package dataStructures;

import java.util.Stack;

public class CircularLinkedList {
	
	Node last;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
		
	}
	
	public CircularLinkedList(Node last) {
		super();
		this.last = last;
		if(this.last!=null)
			this.last.next = last;
	}
	
	public void insert(Node newNode) {
		if(last == null) {
			last = newNode;
		}else {
			Node currentNode = last;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			 currentNode.next = newNode;
		}
	}
	
	public void insertAtEnd(int data){
		Node n = new Node(data);
		if(last==null)
			n.next = n;
		else{
			n.next = last.next;
			last.next = n;
		}
		last = n;
	}
	
	public void insertAtStart(int data){
		Node n = new Node(data);
		if(last==null){
			n.next = n;
			last = n;
		}
		else{
			n.next = last.next;
			last.next = n;
		}
	}
	
	public void insertAfter(int IndexEle, int data){
		if(last!=null){
			Node curr = last;
			do{
				if(curr.data == IndexEle){
					Node n = new Node(data);
					n.next = curr.next;
					curr.next = n;
					break;
				}
				curr = curr.next;
				
			}while(curr !=last);
		}
	}
	
	public Node deleteLast(){
		Node toDelete = last;
		if(last==null || last.next == last){
			last = null;
			return toDelete;
		}
		Node prev = last.next;
		while(prev.next!=last){
			prev = prev.next;
		}
		prev.next = last.next;
		last = prev;
		return toDelete;
	}
	
	public Node deleteAtIndex(int data){
		if(last==null)
			return null;
		
		Node toDelete = null;
		Node curr = last;
		
		do{
			if(curr.data ==data){
				toDelete = curr.next;
				if(curr.next == curr){
					last=null;
				}else{
					curr.next =toDelete.next;
					if(toDelete==last)
						last = curr;
				}	
				break;
			}
			curr = curr.next;
		}while(curr!=last);
		return toDelete;
	}
	
	public void show(){
		if(last==null)
			System.out.println("No Elements are available");
		Node curr = last;	
		do{
			curr = curr.next;
			System.out.println(curr.data);
			
		}while(curr!=last);
	}
	
	public static void main(String[] args){
		
		CircularLinkedList CL = new CircularLinkedList(null);
		CL.insertAtEnd(5);
		CL.insertAtEnd(10);
		CL.insertAtEnd(15);
		CL.insertAfter(5, 99);
		CL.insertAtStart(1);
		CL.insertAtEnd(20);

		CL.show();
//		CL.deleteLast();
		
		CL.deleteAtIndex(5);
		CL.show();
		
	}
}
