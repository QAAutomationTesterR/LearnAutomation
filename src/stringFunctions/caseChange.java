package stringFunctions;

public class caseChange {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "palindrome";

char [] name = word.toCharArray();//String to Char Array

//System.out.print(name);

String snew = new String(name);//Char Array to String

//System.out.print(snew);
//System.out.print(word.substring(0, 1).toUpperCase()+ word.substring(1, 10) );
	
	
for(int i=0;i<word.length();i++)
{
	if(!(i%2==0))
	
		System.out.print(word.substring(i, i+1).toUpperCase());

		

	
	else System.out.print(word.substring(i, i+1).toLowerCase() );

}
	}

}
