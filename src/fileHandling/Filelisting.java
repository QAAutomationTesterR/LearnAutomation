package fileHandling;

import java.io.File;

public class Filelisting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\Program Files");
		//list folders in directory
		/*
		 * String[] lists = file.list();
		 * 
		 * for (String string : lists) {
		 * 
		 * System.out.println(string);
		 * 
		 * }
		 *///list files as per directory
	File [] files =	file.listFiles();
	
	for (File file2 : files) {
		//To display files
		if(file2.isFile())
			System.out.println(file2);
		
			//To display Folder
		else if(file2.isDirectory())
			
		System.out.println(file2);
		
	}
	
	
	}

}
