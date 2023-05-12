package javaExercises;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();

String reverse = "";

for(int i=name.length()-1;i>=0;i--)
{
	reverse = reverse + name.charAt(i);
	
	}
System.out.println(reverse);

if(name.equals(reverse))
{
	System.out.println("It's palindrome");
}
else
	System.out.println("Not Palindrome");
}
}