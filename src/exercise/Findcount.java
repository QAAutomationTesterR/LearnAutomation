package exercise;

public class Findcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Chennai is the Chennai best place in for Chennai the people in";
		
		String name1 = name.substring(0,8);
		
		System.out.println(name1);
		
		String name2 = "Channel";
		
		String name3 = "Channel";
		
		if(name2.equals(name3)) System.out.println("Both are same");
		
		int count = 0;
		  String [] arr = name.split("\\s");
		  
		  for (String string2 : arr) {
			  System.out.println(string2);
				if(!(name1 == string2))
			 // if(!(name1.equalsIgnoreCase(string2)))
			  {
				  System.out.println(string2);
					 
			 // System.out.println("Not Repetitive");
			  count = count +1;
			  }
			 
			 	
		  }
		  System.out.println(count);
				
	}

}
