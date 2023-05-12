package collection;

import java.util.ArrayList;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		java.util.HashSet bl = new java.util.HashSet<>();
		
		System.out.println(bl.size());
		
		//Insertion order is not maintained
		//Duplicate values are not allowed
		ArrayList al = new ArrayList<>();
		
		al.add("Selenium");
		al.add("Kanban");
		al.add("TestNG");
		al.add("Cucumber");
		al.add("Datadriven");
		al.add("Selenium");
		System.out.println("Elements in Array List" + al);
		
		bl.addAll(al);
		
		System.out.println("Elements in Linked List" +bl);
		
	}
}