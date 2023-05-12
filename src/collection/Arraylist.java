package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Arraylist best for search operations
		//Insertion order is maintained
		//Duplicate values are Allowed
		
		ArrayList al = new ArrayList<>();
		al.add("GITHUB");
		al.add("Selenium");
		al.add("Kanban");
		al.add("TestNG");
		al.add("Cucumber");
		al.add("Datadriven");
		
		System.out.println(al);
		
		for (Object object : al) {
			
			System.out.println(object);
			
		}
		
		ArrayList bl = new ArrayList();
		
		bl.add("SDLC");
		bl.add("UnitTesting");
		bl.addAll(0, al);
		System.out.println(bl);
		bl.set(0, "Start");
		System.out.println(bl);
		System.out.println(bl.get(5));
		System.out.println(bl.remove(5));
		System.out.println(bl);
		ArrayList cl = (ArrayList) bl.clone();
		
		System.out.println(cl);
		
		System.out.println(cl.contains("Start"));
		
		Iterator<String> itr = cl.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ListIterator<String> litr = cl.listIterator();
		
		while(litr.hasNext())
			System.out.println(litr.next());
		
		
	}

}
