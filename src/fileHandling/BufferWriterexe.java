package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterexe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file1 = new File("C:\\SeleniumProject\\Ragunew.txt");
		//If we add Boolean arguments , then it will append to existing one
		FileWriter writer1 = new FileWriter(file1);
		BufferedWriter writer = new BufferedWriter(writer1);
		
		writer.write("I will come to see you da");
		//The advantage of BufferWriter is that we can write in new Line
		writer.newLine();
		
		writer.write("For sure will come da");
		
		writer.flush();
		
		writer.close();

	}

}
