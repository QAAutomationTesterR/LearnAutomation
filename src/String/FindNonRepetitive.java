package String;

public class FindNonRepetitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String inputStr ="chtttichard";
        boolean flag = true;

        for(char i :inputStr.toCharArray())
        {
            // if current character is the last occurrence in the string
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("There is no non repeating character in input string");
    

		/*
		 * String name = "chtttichard";
		 * 
		 * for(int i=0;i<name.length();i++) { Boolean val = true; char ch =
		 * name.charAt(i); for(int j=i+1;j<name.length();j++) {
		 * 
		 * if(ch==name.charAt(j)) { val = false; break; }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * if(val==true) { System.out.println("First non-repetitive : " + ch); break; }
		 * }
		 */		 }
}
