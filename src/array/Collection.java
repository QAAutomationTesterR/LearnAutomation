package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList<>();
		
		al.add("Alex");
		
		al.add("Billclin");
		
		al.add("5");
		
		al.add("Christopher");
		
		al.add("David");
		
		al.add("Alex");
		
		System.out.println(al);
		
		al.add(0, "Apple");
		
		System.out.println(al);
		
		Object cl = al.clone();
		
		System.out.println(cl);
		
		System.out.println(al.get(0));
		
	ListIterator iterate = al.listIterator();
	
	
	
	
	  while(iterate.hasNext()) { System.out.println(iterate.next()); }
	  
	  LinkedList list = new LinkedList<>();
	  
	  list.addFirst("Jan");
	  
	  list.add("Mar");
	  
	  list.addLast("Dec"); list.offerFirst("First Jan");
	  
	  System.out.println(list);
	 	
	  
	  HashSet set = new HashSet();
	  
	  set.addAll(al);
	  
	  System.out.println(set);
	  
	  LinkedHashSet lsset = new LinkedHashSet();
	  
	  lsset.add("Affection");
	  
	  lsset.add("Brave");
	  lsset.add("Courage");
	  lsset.add("Defeat");
	  
	  System.out.println(lsset);
	  
	  
	  
	  TreeSet tset = new TreeSet();
	  
	  tset.add("Alex");
	  tset.add("Bill");
	  tset.add("Clill");
	  tset.add("Dill");
	  tset.add("Eill");
	  tset.add("Fill");
	  
	 System.out.println(tset.subSet("Clill", "Fill"));
	  
	  /*
	  
	  tset.addAll(lsset);
	  
	  String [] hp = {"5000","56","spd"};
	  
	  set.add(hp);
	  System.out.println(set);
		
	Iterator desc =  tset.descendingIterator();
	
	while(desc.hasNext())
		
	{
		System.out.println(desc.next());
	}	
	
*/	
	
	
	  
	  
	  
	  
	  
	  
	
	}

}
