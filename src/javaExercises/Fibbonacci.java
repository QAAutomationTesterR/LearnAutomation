package javaExercises;

import java.util.Iterator;
import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c=1;
Scanner sc = new Scanner(System.in);

int num = sc.nextInt();

for(int i =0;i<num;i++)
{	
		a=b;
		b=c;
		c=a+b;
		System.out.println(a);

	}
}
}