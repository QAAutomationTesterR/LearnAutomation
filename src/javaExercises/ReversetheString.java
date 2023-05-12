package javaExercises;

public class ReversetheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Reverse the string using String Buffer
		StringBuffer sb = new StringBuffer("ALEXA");
		StringBuffer sg = sb.reverse();
		
		System.out.println(sb.reverse());
		//Reverse the String using String
		String s = "ALEXA";
		
		char [] ch = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		
		{
		System.out.print(ch[i]);
		
	}

}
}