package exceptionHandling;

public class ExtendsException extends Exception {
	
	
	//User-Defined Exception
	
	public ExtendsException(int i, int j) {
		// TODO Auto-generated constructor stub
		int c = i/j;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		
		int b =5;
		
		int c = a/b;
		
		try {
			
			throw new ExtendsException(5,0);
		}
		
		catch(Exception e)
		{
	System.out.println("Exception occured");
	}

}
}
