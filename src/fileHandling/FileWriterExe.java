package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExe {

	
	public FileWriterExe(File file) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file1 = new File("C:\\SeleniumProject\\Ragunew.txt");
		
		FileWriter writer = new FileWriter(file1);
		
		writer.write("Say my name for You");
		
		writer.flush();
		
		writer.close();
		
		
	}

}
