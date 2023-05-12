package String;

public class FindVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "elephantoxeuteifersasad";
		int vowela = 0;
		int vowele = 0;
		int voweli = 0;
		int vowelo = 0;
		int vowelu = 0;
		int novowel =0;
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
		
		if(ch=='a')
		{
			
			System.out.println("Vowel is present");
			
			vowela = vowela + 1;
	}
		if(ch=='e')
		{
			
			System.out.println("Vowel is present");
			
			vowele = vowele + 1;
	}
		if(ch=='i')
		{
			
			System.out.println("Vowel is present");
			
			voweli = voweli + 1;
	}
		if(ch=='o')
		{
			
			System.out.println("Vowel is present");
			
			vowelo = vowelo + 1;
	}
		if(ch=='u')
		{
			
			System.out.println("Vowel is present");
			
			vowelu = vowelu + 1;
	}
		else
		{
			novowel = novowel+1;
		}
}
		
		System.out.println("a vowel present in string " + vowela);
		System.out.println("e vowel present in string " + vowele);
		System.out.println("i vowel present in string " + voweli);
		System.out.println("o vowel present in string " + vowelo);
		System.out.println("u vowel present in string " + vowelu);
		System.out.println("no vowel present in string " + novowel);
		
		
		
		
		
		
		
}
}