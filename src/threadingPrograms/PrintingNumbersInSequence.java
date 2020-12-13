package threadingPrograms;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Printing multiple thread values in a sequence
// 2nd - prints even and odd numbers

public class PrintingNumbersInSequence {

	private static int numberOFthreads=3;
	private static int TotalNumberOfSequence=10;		
	static ExecutorService es=null;
	public static void main(String[] args){

		generateNumbers gn = new generateNumbers(numberOFthreads, TotalNumberOfSequence);	
		//	Thread t1=new Thread(new SequenceGen(gn, 1), "Thread-1");
		//	Thread t2=new Thread(new SequenceGen(gn, 2), "Thread-2");
		//	Thread t3=new Thread(new SequenceGen(gn, 0), "Thread-3");
		//	t1.start();
		//	t2.start();
		//	t3.start();

		//above steps can be simplified - executorService will automatically creates a threadpool and no need of calling Start method also in this case 
		try{	
			es= Executors.newFixedThreadPool(numberOFthreads);
			es.submit(new SequenceGen(gn, 1));
			es.submit(new SequenceGen(gn, 2));
			es.submit(new SequenceGen(gn, 3));
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(es!=null)
				es.shutdown();
		}


		//generating even and odd numbers
//		numberOFthreads = 2;
//		generateNumbers gn1 = new generateNumbers(numberOFthreads, TotalNumberOfSequence);	
//		Thread t4=new Thread(new SequenceGen(gn1, 1), "Thread-1");
//		Thread t5=new Thread(new SequenceGen(gn1, 0), "Thread-2");
//		t4.start();
//		t5.start();
	}
}
