package fileHandling;

import java.io.File;

public class GetTextFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\SeleniumProject");
		
		File[] filearr = file.listFiles();
		
		for (File file2 : filearr) {
			
			String name = file2.getName();
			//Print text file in Directory
			if(name.contains("txt"))
			{
				System.out.println(file2.length());
			
			System.out.println(name);
			
			}
			//System.out.println(name.lastIndexOf("."));
			
		}
		
	}

}
