package stringFunctions;

public class ExeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String - Immutable
		//String Buffer - Mutable - Synchronised - Multi Threading - When the values are changing more often
		//String Builder - Mutable - Non -Synchronized - JDK 1.5 - Quick Operations
		
		
String S8 = " Say my name you buddy ";
		
		System.out.println(S8.trim());
		
		String S9 = " Say my name you buddy ";
		
		//System.out.println(S9.strip());
		
String S10 = " Say my name you buddy ";
		
	
String S11 = " Say my name you buddy ";
	
System.out.println(S11.substring(3));


System.out.println(S11.substring(4, 9));//first index is inclusive and last index is exclusive

String S12 = "Ragu Ram";

//String S19 = S12.matches(\\w{3} \\w{2});

System.out.println(S12.replace('y', 'i'));
String S13 = "Ragu Ram";

System.out.println(S13.replaceAll("\\s", "-"));


String S15 = " My Name is Ragu Ram ";

System.out.println(S15.replaceFirst("\\s", "-"));

String [] srr = S15.split("");

for (String Display : srr) {
	
	
	System.out.println(Display);
	
}


//String S19 = String.join("*", "Ragu","is","Coming");
String S25 = " My Name is Ragu Ram ";

//S25.indent(3);

StringBuffer SB = new StringBuffer("Raguram is my name");

SB.append("ds");

System.out.println(SB);

System.out.println(SB.deleteCharAt(3));

System.out.println(SB.reverse());

	}

}
