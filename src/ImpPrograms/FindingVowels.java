package ImpPrograms;

public class FindingVowels {
	
	public void findVowels(String input){
		
		System.out.println(input.toLowerCase().matches(".*[aeiou].*"));
	}
	
	public static void main(String[] args){
		FindingVowels v = new FindingVowels();
		v.findVowels("Suresh");
	}

}
