package dataStructures;

public class Queue {
	
	int front;
	int rear;
	int queueArr[];
	int capacity;
	int currentSize;
	
	public Queue(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		this.queueArr = new int[this.capacity];
		this.rear=-1;
		this.front=0;
	}
	
	public boolean isFull(){
		if(currentSize==capacity)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty(){
		if (currentSize==0) {
			return true;
		}else
			return false;
	}
	
	public void enQueue(int element){
		
		if(isFull()){
			System.out.println(currentSize + " is the current size");
			System.out.println("Queue is full and couldnt add " +element);
		}else{
			rear++;
			queueArr[rear]=element;
			currentSize++;
			System.out.println(element +" added to the queue");
		}
	}
	
	public void deQueue(){
		
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			front++;
			currentSize--;
			if(front==capacity){
				System.out.println(queueArr[front-1] + "removed from Queue");
				front =0;
				rear =-1;
				currentSize=0;
			}else
				System.out.println(queueArr[front-1] + " removed from Queue");
			
		}
		
	}
	
	public static void main(String[] args){
		Queue javaQueue = new Queue(5);
		System.out.println("<----------EnQueue --------->");
		javaQueue.enQueue(10);
		javaQueue.enQueue(20);
		javaQueue.enQueue(30);
		javaQueue.enQueue(40);
		javaQueue.enQueue(50);
		javaQueue.enQueue(60);
		//deQueue
		System.out.println("<----------deQueue --------->");
		javaQueue.deQueue();
		javaQueue.deQueue();
		javaQueue.deQueue();
		javaQueue.deQueue();
		javaQueue.deQueue();
		javaQueue.deQueue();
		System.out.println("<----------EnQueue for the second time --------->");
		javaQueue.enQueue(60);
		javaQueue.enQueue(70);
		javaQueue.enQueue(80);
		javaQueue.enQueue(90);
		javaQueue.enQueue(100);
		System.out.println("<----------deQueue for the 2nd time --------->");
		javaQueue.deQueue();
		javaQueue.deQueue();
		javaQueue.deQueue();
		javaQueue.deQueue();
		javaQueue.deQueue();
		javaQueue.deQueue();
	}
}
