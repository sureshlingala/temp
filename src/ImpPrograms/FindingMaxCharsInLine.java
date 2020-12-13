package ImpPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Program: Write a program to find two lines with max characters in descending order.

public class FindingMaxCharsInLine {

	public static void findingMaxChars(File file) throws Exception{
		FindingMaxCharsInLine fx = new FindingMaxCharsInLine();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		List<entries> lineList = new ArrayList<>();
		String line = "";
		while((line = br.readLine())!=null){
			int lineLength = line.trim().length();
			lineList.add(fx.new entries(lineLength, line));
		}
		lineList.stream().sorted(Comparator.comparing(entries::getLine)).forEach(x->System.out.println(x.line + " = "+ x.lineLength));
		
		//to sort in descending order
		System.out.println();
		System.out.println(" --------Descending order -------");
		lineList.stream().sorted(new Comparator<entries>() {

			@Override
			public int compare(entries o1, entries o2) {
				
				return o2.lineLength-o1.lineLength;
			}
			 
		}).forEach(x->System.out.println(x.line + " = "+ x.lineLength));
	
//		Optimized code
		System.out.println(" --------Descending order 2nd method -------");
		lineList.stream().sorted((entries e1, entries e2) -> {
			return e2.lineLength - e1.lineLength;
		}).forEach(x->System.out.println(x.getLine() + " = "+ x.getLineLength()));
		
		System.out.println(" --------Descending order 3rd method -------");
		lineList.stream().sorted(Comparator.comparing(entries::getLine).reversed()).forEach(x->System.out.println(x.line + " = "+ x.lineLength));
	}
	
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("testFile.txt");
		
		findingMaxChars(file);
	}
	
	class entries{
		int lineLength;
		String line;
		public int getLineLength() {
			return lineLength;
		}
		public void setLineLength(int lineLength) {
			this.lineLength = lineLength;
		}
		public String getLine() {
			return line;
		}
		public void setLine(String line) {
			this.line = line;
		}
		public entries(int lineLength, String line) {
			super();
			this.lineLength = lineLength;
			this.line = line;
		}
	}


}
