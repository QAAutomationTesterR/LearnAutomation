import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> hmp = new HashMap<>(); 
		String name ="alexander";
		
		for(int i=0;i<name.length();i++)
		{
		
		char ch = name.charAt(i);
		
		if(hmp.containsKey(ch))
			
		{
			hmp.put(ch, hmp.get(ch)+1);
			
	}
		else
		{
			hmp.put(ch, 1);
}
}
		
		
	System.out.println(hmp);
	Set<Entry<Character, Integer>> col =hmp.entrySet();

	for (Entry<Character, Integer> integer : col) {
		
		if((integer.getValue()==1))
		{
		
		System.out.println(integer.getKey() +" = " + integer.getValue());
		}
	}
		}

	
	}