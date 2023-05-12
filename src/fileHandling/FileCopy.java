package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fin = new FileInputStream("");
		
		FileOutputStream fout = new FileOutputStream("");
		
		int rd = fin.read();
		
		while(!(rd==-1))
			
		{
		fout.write(rd);
		rd = fin.read();
		
		
	}
		fout.flush();

}
}