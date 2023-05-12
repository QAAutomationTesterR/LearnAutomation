package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\SeleniumProject\\Ragunew.txt");
		
		FileReader reader = new FileReader(file);
		
		/*
		 * char [] ch = new char [ (int) file.length()]; reader.read(ch);
		 * 
		 * for (char c : ch) {
		 * 
		 * System.out.print(c);
		 * 
		 * }
		 * 
		 */
	  int rdr = reader.read();
	  
	  while (!(rdr==-1))
	  
	  {
	  
	  System.out.print((char)rdr);
	  
	  rdr = reader.read(); }
	 	 
}
}