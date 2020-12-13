package ImpPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MaxWordCountinLine {

	public static void main(String[] args) {

		File file = new File("testFile.txt");
		String line = "";
		int currentMaxCount = 0;
		List<String> lines = new ArrayList<>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			while((line = br.readLine())!=null){
				//	String str[] = line.toLowerCase().split("([,.\\s]+)");
				int wordsCount = line.toLowerCase().split(" ").length;
				if(wordsCount>currentMaxCount){
					lines.clear();
					currentMaxCount = wordsCount;
					lines.add(line);
					System.out.println(currentMaxCount);
				}else if(wordsCount==currentMaxCount){
					lines.add(line);
					System.out.println(currentMaxCount);
				}
				
			}
			
			lines.forEach(System.out::println);
			br.close();
		}catch(Exception e){
			System.out.println("");
		}
	}

}		


