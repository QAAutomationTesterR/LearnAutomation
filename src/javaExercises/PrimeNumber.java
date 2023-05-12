package javaExercises;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		int a = num/2;
		boolean flag = true;
		if(num==0||num==1)
		{
		
		System.out.println("Not Palindrome");
	}
		else
		{
			for(int i =2;i<a;i++)
			{
				
				if(num%i==0)
				{
					System.out.println("Palindrome");
				}
				else
					System.out.println("Not");
				break;
		}

}
		}
}