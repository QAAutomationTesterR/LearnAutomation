package javaExercises;

import java.util.Set;
import java.util.TreeMap;

import com.google.common.collect.Multiset.Entry;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Alexa play some good music for me Alexa play music";
		
		TreeMap<String, Integer> tmp = new TreeMap<String, Integer>();
		
		String [] words = name.split(" ");
		
		System.out.println(words.length);
		
		for (String string : words) {
			
			if(tmp.containsKey(string))
			{
			tmp.put(string, tmp.get(string)+1);
		}
			
			else
				tmp.put(string, 1);
	}
		System.out.println(tmp);
	
	for (java.util.Map.Entry<String, Integer> stringed : tmp.entrySet()) {
		
		
 if(stringed.getValue()==2)
	 
 {
	 
	 System.out.println(stringed.getKey()+ " : " + stringed.getValue());
	 break;
	}
	
	
	}
}
}