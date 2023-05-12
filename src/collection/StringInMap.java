package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class StringInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name =" Chennai is the Chennai is the only place in Chennai";


String [] word = name.split(" ");
TreeMap<String, Integer> hmp = new TreeMap<String, Integer>();

for (String string1 : word) {
	
	
	if(hmp.containsKey(string1))
	{
		
		hmp.put(string1, hmp.get(string1)+1);
	
}
	else
		
		hmp.put(string1, 1);
	}
//Set<Entry<String, Integer>> sd =  hmp.entrySet();

   Set< Entry<String,Integer>> sd  =hmp.entrySet();  
   
   
   
   for (Map.Entry<String, Integer> entry : sd) {
	   
	   
	 if(!(entry.getValue()==1))
	 {
	System.out.println(entry.getKey());
	break;
}
}
}
}