package exercise;

import java.util.ArrayList;
import java.util.ListIterator;

public class ExeCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList al = new ArrayList();
		 * 
		 * al.add("Ragu");
		 * 
		 * al.add("Siva");
		 * 
		 * al.add("David");
		 * 
		 * ListIterator li= al.listIterator();
		 * 
		 * while(li.hasNext())
		 * 
		 * System.out.println(li.next());
		 */

String name = "Chennai is the only place in Chennai people for the Chennai";

String name1 = name.substring(0,8);

System.out.println(name1);

String [] name3 = name.split(" ");
int count =0;
for (String string : name3) {
	System.out.println(string);
	
	int equals = string.compareTo(name1);
	if(equals==0)
	{
		count=count+1;
	
}
	System.out.println(equals);

	}

}
}