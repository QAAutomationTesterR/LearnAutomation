package collection;

import java.util.Iterator;

public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.TreeSet hsset = new java.util.TreeSet();

//Natural Sorting order is maintained

hsset.add("Selenium");
hsset.add("Kanban");
hsset.add("TestNG");
hsset.add("Cucumber");
hsset.add("Datadriven");
hsset.add("Selenium");

System.out.println(hsset);

System.out.println(hsset.higher("Selenium"));

System.out.println(hsset.lower("Selenium"));

System.out.println(hsset.headSet("Selenium"));

System.out.println(hsset.tailSet("Selenium"));

System.out.println(hsset.descendingSet());

Iterator descitr=hsset.descendingIterator();

while(descitr.hasNext())
	
	System.out.println(descitr.next());



	}

}
