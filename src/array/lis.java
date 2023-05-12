package array;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.ITestListener;

public abstract class lis implements ITestListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Character, Integer> tmp = new TreeMap<>();
		
		String name = "assassination";
		
		char [] ch = name.toCharArray();
		
		for (char c : ch) {
			
			if(tmp.containsKey(c))
				
			{
				
				tmp.put(c, tmp.get(c)+1);
			
		}
			else
			{
		tmp.put(c, 1);
		}
			
			
	}
		Set<Map.Entry<Character,Integer>> smp = tmp.entrySet();
		//for (Entry<Character, Integer> entry : smp) {
			
			for (Map.Entry<Character, Integer> entry : smp) {
				
			
			//System.out.println(entry);
			
			if (entry.getValue()==1)
			{
				System.out.println(entry.getKey());

			}
		}
		//System.out.println(tmp);

	}

}
