package threadingPrograms;

public class generateNumbers {

	int number=1;
	int numberOfThreads;
	int numberOfSequence;
	
	public generateNumbers(int numberOfThreads, int numberOfSequence) {
		super();
		this.numberOfThreads = numberOfThreads;
		this.numberOfSequence = numberOfSequence;
	}
	
	public void print(int result){
		
		synchronized (this) {
			while(number<numberOfSequence-1){
				while(number%numberOfThreads!=result){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				if(Thread.currentThread().getName().contains("3"))
					System.out.println(Thread.currentThread().getName() + " "+ "3");
				else{
					System.out.println(Thread.currentThread().getName() + " "+ result); //for printing 1 2 3 in an order
//					System.out.println(Thread.currentThread().getName() + " "+number); // printing even/Odd numbers
				}
				number++;
				
//				System.out.println(Thread.currentThread().getName()+" "+number++);
				notifyAll();
			}
		}
	}
	
	
}
