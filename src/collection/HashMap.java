package collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.HashMap<Integer, String> hmap = new java.util.HashMap<Integer, String>();

hmap.put(0, "Alex");
hmap.put(4, "Selenium");
hmap.put(2, "CSharp");
hmap.put(1, "Phython");
hmap.put(3, "Java");
hmap.put(5, "Eclipse");
hmap.put(null, "Eclipse");

System.out.println(hmap);

System.out.println(hmap.containsKey(1));

System.out.println(hmap.containsValue("Java"));

System.out.println(hmap.get(1));

  Set<Integer> st =  hmap.keySet();
  
  System.out.println(st);
  
 Collection<String> cstring =  hmap.values();
 
 System.out.println(cstring);

Set<Entry <Integer,String>> sd =  hmap.entrySet();

for (Entry<Integer, String> entry : sd) {
	
	System.out.println(entry.getKey() + " : " + entry.getValue());
	
}

LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();

lhmap.putAll(hmap);

System.out.println(lhmap);
	}

}
