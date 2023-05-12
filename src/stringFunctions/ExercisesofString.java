package stringFunctions;

public class ExercisesofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = new String("Namma Chennai is Beautiful");//Heap Memory
		
		String S2 = "Namma Chennai is Beautiful";//SCP-Memory Management
		
		String S3 = "";
		
		String S4 = "";
		
		if(S1==S2) //Checks for Memory Reference
		{
			
			System.out.println("equals");
		}
		else System.out.println("Not Equals for Double equals Operator");
		
		if(S1.equals(S2))//Checks for Object Reference
		{
		System.out.println("Equals");
		
	}
		else System.out.println("Not Equals");
		
		System.out.println(S3.isEmpty());//Returns True if length is zero
		
	//Comparison in Strings
		
		System.out.println(S1.equals(S2));
		
		System.out.println(S1.equalsIgnoreCase(S2));
		
		//String S5 = null;
		
		//System.out.println(S5.compareTo(S2));//Throws null Pointer Exception bcoz S5 doesn't have any memory reference for Comparison
		
		if(S1.startsWith("Nam"))
		{
			System.out.println("Name Starts");
		}
		
		if(S1.endsWith("ful"))
		{
			System.out.println("Name Ends");
			
		}
		StringBuffer sb = new StringBuffer("Namma Chennai is Beautiful");//String Buffer Declaration
		if(S1.contentEquals(sb))//It's used to compare String with String Buffer or to compare Char Sequence
				{
		System.out.println("Content Equals");
				}
		
		String S7 = " The Name is Raguram ";
		
		System.out.println("Index Position is" + S7.indexOf('N'));
		
		System.out.println("Index Position after 5th  is" + S7.indexOf('a', 5));
		
		System.out.println("Last Index  is" +S7.lastIndexOf('a'));
		
		System.out.println("Last Index after 12 th is" +S7.lastIndexOf("am", 12));
		
		System.out.println(S1.toLowerCase());
		
		System.out.println(S1.toUpperCase());
		
		
			
		
		
		
		
		
		
		}
		
	}

