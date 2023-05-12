package stringFunctions;

public class Stringrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "acceptance";
		
		for(int i=0;i<word.length();i++) {
			Boolean val = true;
			char ch = word.charAt(i);
			
			for(int j=i+1;j<word.length();j++) {
				
				if(ch==word.charAt(j))
						{
				
				val = false;
				//System.out.println("Findable");
				break;
	}
		}
			if(val==true)
			{
System.out.println("Not Findable is " + ch );
break;
}
}
}
}