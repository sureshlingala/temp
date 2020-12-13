package ImpPrograms;

public class SubstringFreqInString {

	String str = "JavaExamplesJavaCodeJavaProgram";
	
	String input = "Java";
	int fromIndex,Count =0;
	
	public void occurences(){
		
		String[] strArr = str.split(input);
		int count = str.split(input, -1).length-1;
		System.out.println(count);
		System.out.println(strArr.length-1);
		
		//method 2
		
		while((fromIndex=str.indexOf(input, fromIndex))!=-1){
			System.out.println("found at index => " + fromIndex);
			Count++;
			fromIndex++;
		}
		System.out.println("total occurances => " + count);
	}
	
	
	public static void main(String[] args) {
		SubstringFreqInString obgref = new SubstringFreqInString();
		obgref.occurences();

	}

}
