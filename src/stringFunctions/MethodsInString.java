package stringFunctions;

public class MethodsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String Se = "Say my name is an name of an name in the name ";
		
		System.out.println(Se.isEmpty());
		
		String rd = Se.replace("name", "eman");
		
		System.out.println(rd);
		
String sd = Se.replaceAll("name", "eman");
		
		System.out.println(sd);
		
		
		String sde = "Account cability ced";
		
		
		String [] sfe = sde.split(" ");
		
		for (String string : sfe) {
			
			System.out.println(string);
			
		}
	}

}
