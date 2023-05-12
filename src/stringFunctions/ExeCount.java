package stringFunctions;

public class ExeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Count 1st Character in String
		String name = "RaguramRamadass";
		
		Character ch = name.charAt(0);//Character ch ='k';-Count any Character in String
		int count = 1;
		for(int i =1;i<name.length();i++)
		{
			
		if(ch==name.charAt(i))
		{
			
			count++;
	}
	}
		System.out.println(count);
		
		//Count vowels in String
		String word = "educationalinstitutions";
		int count2 = 0; int counta =0;int counte = 0; int counti =0;int counto = 0; int countu =0;
		for(int i =0;i<word.length();i++)
		{
			char ch1 = word.charAt(i);
			
			switch (ch1) {
			case 'a': counta++;break;
			case 'e':counte++;break;
			case 'i':counti++;break;
			case 'o':counto++;break;
			case 'u':countu++;break;	
							}
}
		System.out.println(counta);
		System.out.println(counte);
		System.out.println(counti);
		System.out.println(counto);
		System.out.println(countu);
		
	//Print the vowels in the String
		
		String word1 = "educationalinstitutions";
		for(int i =0;i<word.length();i++)
		{
			char ch1 = word.charAt(i);
			
			switch (ch1) {
			case 'a': 
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				System.out.println(ch1);
							}
			
}
	//Alphanumeric - Print Alphabets alone and Print Numbers alone	
	String word2 = "chennai 23456"	;
	
	String word3 =word2.replaceAll("[a-z]", "");
	
	System.out.println(word3);//Print numbers alone

String word4 =word2.replaceAll("[0-9]", "");
	
	System.out.println(word4);//Print Alphabets alone
	
	String word5 = "chennai 89765";
	//int i;
	//char [] ch5 = "";
	
	  for(int j=0;j<word5.length();j++) 
	  {
		  if(word5.charAt(j)>='a')
		  {
	  if(word5.charAt(j)<='z') 
	  {
	  System.out.print(word5.charAt(j)); 
	  
	   }
		  }
	  }
		/*
		 * String word9 = "ADDA";
		 * 
		 * for(int k=word9.length()-1;k>=0;k--) { System.out.print(word9.charAt(k));
		 * char fn = word9.charAt(k); }
		 */

}
}