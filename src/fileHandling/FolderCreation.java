package fileHandling;

import java.io.File;
import java.io.IOException;

public class FolderCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\Ragu\\SeleniumProject");
		
	System.out.println(file.exists());//To check the existense of File
	
	file.mkdir();//Create Folder
	
	System.out.println(file.exists());//To check the existense of File
	
	File file1 = new File("C:\\Ragu\\SeleniumProject\\Framework\\BDD\\Cucumber");
	
	file1.mkdirs();//Create sub-Folder
	
	
	File file3 = new File("C:\\Ragu\\SeleniumProject\\exe.txt");
	
	file3.createNewFile();//Create new File
	
	File file4 = new File("C:\\Ragu\\SeleniumProject\\text.txt");
	
	
	file3.renameTo(file4);//Rename existing File
	
	// Check the access properties of File
	
	System.out.println(file3.canExecute());
	
	System.out.println(file3.canRead());
	
	System.out.println(file3.canWrite());
	//Print File Name
	System.out.println(file4.getName());
	
	
	
	
	
	}

}
