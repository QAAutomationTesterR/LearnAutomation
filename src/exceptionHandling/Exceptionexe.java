package exceptionHandling;

import java.util.Scanner;

public class Exceptionexe {
	
	private static void execute()
	{
Scanner sc1 = new Scanner(System.in); //Getting input from Console
		
		int a = sc1.nextInt();
		
		int b = sc1.nextInt();
		
		System.out.println("Getting input again from user");
		
int c = a/b;
		
		System.out.println(c);
		
		Methodexe exe = new Methodexe(); //Dynamic Binding
		
		exe.validate(5,5);
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); //Getting input from Console
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		System.out.println("Getting input from user");
		try {
		int c = a/b;
		
		System.out.println(c);
		execute();

		
		}
		catch(Exception e)
		{
			
			System.out.println("Exception occured");
			
				}
		finally {
			System.out.println("Result was published");
			
			}

}
}