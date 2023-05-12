package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

import arraylist.Mobile;

public class Cursoraction {
	
	private int id;
	private String dta;
	private String dtma;
	private String dmam;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		String s2 = sc.nextLine();
		
		System.out.println(s1.concat(s2));
		
	String [] S3 =	s2.split("\\t",1);
	
	for (String string5 : S3) {
		
		System.out.println(string5);
		
	}
		
		
		ArrayList al = new ArrayList<>();
		
		Mobile samsung = new Mobile (30000,85,8);
		
		Mobile vivo = new Mobile (30000,85,8);
		
		al.add(vivo);
		
		al.add(samsung);
		
		al.add("Arjun");
		
		al.add("Balu");

		al.add("Cat");
		
		al.add("David");

		al.add("Exeran");
		
		al.add("Finolis");
		
		System.out.println(al);
		
		  Iterator li = al.iterator();
		  
		  while(li.hasNext()) 
		  { 
			 if(li.next().equals(vivo))
			 {
				 li.remove();
			 }
			  
		  }
		  
		  System.out.println(al);
			
			/*
			 * ListIterator li2 = al.listIterator();
			 * 
			 * while (li2.hasPrevious()) System.out.println(li2.previous());
			 */
	
}
}