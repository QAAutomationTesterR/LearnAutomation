package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class arraylistexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al = new ArrayList<>();
		
		al.add("Ragu"); // append elements in end of list
		
		al.add(5);
		
		al.add("Sivan");
		
		
		al.add(true);
		
		System.out.println(al);
		
		ArrayList bl = new ArrayList();
		
		bl.addAll(al);//Add elements from one list to another
		
		System.out.println(bl);
		
		al.get(0);//Get element at particular index
		
		al.remove(0);//Get and remove element at particular index
		
		bl.removeAll(bl);//Remove all elements in list
		
		System.out.println(bl);
		
	ArrayList cl =	(ArrayList)al.clone();//Type Casting
	
	System.out.println(cl);
	//Array List - Best for Search Operations and not good for Insertion and Deletion operations
	//Linked List - Not best for Data Retrieval and good gor Insertion and Deletion
	LinkedList li = new LinkedList();
	
	System.out.println();
	
	System.out.println(li.offer("Ball"));
	
	System.out.println(li.poll());
	
	System.out.println();
	
	System.out.println(li.getFirst());
	
	
	}

}
