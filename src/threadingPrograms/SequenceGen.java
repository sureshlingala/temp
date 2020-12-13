package threadingPrograms;

public class SequenceGen implements Runnable {

	private generateNumbers generatenum;
	private int result;
	
	public SequenceGen(generateNumbers generatenum, int result) {
		super();
		this.generatenum = generatenum;
		this.result = result;
	}

	@Override
	public void run() {
		
		generatenum.print(result);
	}

}
