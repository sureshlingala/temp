package ImpPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaxRepeatedWordsinFile {

	public void duplicateWordCount(File file) throws Exception{
		String line,word = "";
		ArrayList<String> words = new ArrayList<>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			while((line = br.readLine())!=null){
//				String str[] = line.toLowerCase().split("([,.\\s]+)");
				String str[] = line.toLowerCase().split(" ");
				for(String s:str){
					words.add(s);
				}

			}
			String maxRepeatedWord = words.stream().collect(Collectors.groupingBy(eachWord->eachWord, Collectors.counting())).entrySet()
			.stream().max(Comparator.comparing(Entry::getValue)).get().getKey();
			
			System.out.println("max repeated word " +maxRepeatedWord);
			
			Set<String> repeatedWords = words.stream().filter(i -> Collections.frequency(words, i)>1).collect(Collectors.toSet());
			
			repeatedWords.stream().forEach(x->System.out.println(x));
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception{

//		C:\Users\sulingala\workspace\JavaPractice\testFile.notepad
		File file  = new File ("testFile.txt");
		MaxRepeatedWordsinFile obj = new MaxRepeatedWordsinFile();
		obj.duplicateWordCount(file);
		
		System.out.println("------------------");
		String str= "test one test the test a autoamtion test";
		System.out.println(Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(eachWord->eachWord, Collectors.counting()))
		.entrySet().stream().max(Comparator.comparing(Entry::getValue)).get().getKey());
		
	}

}
