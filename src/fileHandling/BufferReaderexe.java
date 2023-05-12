package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderexe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file1 = new File("C:\\SeleniumProject\\Ragunew.txt");
		
		FileReader reader = new FileReader(file1);
		
		BufferedReader reader1 = new BufferedReader(reader);
		//BufferReader reads data by line where reader class reads by character
	String line =	reader1.readLine();
	int linecount = 0;
	
	int sentencecount = 0;
	
	int wordscount = 0;
	
	int lengthcount1 = 0;
	while(!(line==null))
	{
		System.out.println(line);
		
		
	 
	 lengthcount1 = lengthcount1 +line.length();
	 
		
		String [] sentence = line.split("[.]");
		
		String [] words = line.split(" ");
		wordscount = wordscount + words.length;
		
		
		sentencecount = sentencecount + sentence.length;
		
		line = reader1.readLine();
		
		linecount ++;
		
		
	}
	System.out.println(linecount);
	System.out.println(sentencecount);
	System.out.println(wordscount);
	System.out.println(lengthcount1);
		
	}

}
