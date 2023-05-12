package array;

import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Wordscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "chennai is the best chennai location in chennai";
		
	String[] name1 =	name.split(" ");
	
	TreeMap<String, Integer> tmp = new TreeMap<String, Integer>();
	
	for (String string : name1) {
		
		if(tmp.containsKey(string))
			
		{
		tmp.put(string, tmp.get(string)+1);
	}
		
		else {
			tmp.put(string, 1);
		}
		}
Set<Entry<String, Integer>> col =tmp.entrySet();

for (Entry<String, Integer> integer : col) {
	
	if(!(integer.getValue()==1))
	{
	
	System.out.println(integer.getKey() +" = " + integer.getValue());
	break;
	}
}
	}

}
