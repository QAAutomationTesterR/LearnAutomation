package seleniumBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionsMap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> AddValues = new HashMap<>();
		
		AddValues.put(0, "Ragu");
		AddValues.put(1, "Ram");
		AddValues.put(2, "Shabana");
		AddValues.put(3, "Arun");
		AddValues.put(4, "Aravind");
		AddValues.put(5, "Aarthi");
		AddValues.put(6, "Sajin");
		
		for (Entry<Integer, String> string : AddValues.entrySet()) {
			
			Integer Data = string.getKey();
			
			System.out.println(string);
			System.out.println(Data);
			
		} 
		
		
	}

}
