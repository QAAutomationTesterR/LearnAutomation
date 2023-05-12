package javaExercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorInHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
HashMap<Integer, String> hmp = new HashMap<Integer, String>();

hmp.put(1, "Alexa");
hmp.put(1, "Bill");

hmp.put(1, "Clist");

hmp.put(1, "Dent");

hmp.put(1, "Elisa");



   Iterator itr =   hmp.entrySet().iterator();
   
   while(itr.hasNext())
   {
	Map.Entry me = (Map.Entry)itr.next();
	
	System.out.println(me.getKey() + " " + me.getValue());
	}
	}
	}


