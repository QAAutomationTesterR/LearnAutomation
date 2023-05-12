package seleniumBasics;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for(int row = 1;row<=3;row++) { for(int col = 1;col<=row;col++) {
		 * System.out.print(row); } System.out.println("");
		 * 
		 * }
		 */		
		
		//Output
		//1
		//22
		//333
		
		/*
		 * for(int row = 3;row>=1;row--) { for(int col = 3;col>=row;col--) {
		 * System.out.print(col); } System.out.println("");
		 * 
		 * }
		 * 
		 */		
		
		/*for(int row = 1;row<=3;row++)
		{
		for(int col = 1;col<row;col++)	
		{
			System.out.print("*");
	}
		for(int col1 = 3;col1>=row;col1--)	
		{
			System.out.print("#");
	}
	*/	
		
		/*for(int row = 3;row>=1;row--)
		{
		for(int col = 1;col<row;col++)	
		{
			System.out.print(" ");
	}
		for(int col1 = 3;col1>=row;col1--)	
		{
			System.out.print(col1);
	}
	*/	
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		System.out.println("");

		}

		
}
}
