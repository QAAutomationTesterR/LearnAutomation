package arraylist;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");
	      
	     System.out.println( hm.containsKey(100));
	     System.out.println( hm.containsValue("Vijay"));
	     HashMap<Integer, String> hmp = new HashMap<>();
	     
	     hmp.putAll(hm);
	     
	    System.out.println(hmp.keySet());
	    
	   Collection<String> csd = hmp.values();
	   
	   System.out.println(csd);
	     
	    // System.out.println(hm);
	     
	Set<Entry<Integer, String>> st =     hmp.entrySet();
	//System.out.println(st); 
	
	for (Map.Entry<Integer,String> entry : hmp.entrySet()) {
		
	System.out.println(entry.getKey() + "=" + entry.getValue());
		
	}
	}

}
