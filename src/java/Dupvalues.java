package java;

import java.util.HashSet;
import java.util.TreeMap;

public class Dupvalues {

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
		System.out.println(tmp);
	}
}
