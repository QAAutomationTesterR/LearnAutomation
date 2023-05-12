package array;

public class TypeCasting {

	public TypeCasting(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("on the process");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TypeCasting type = new TypeCasting("AjayKumar");
		
		int a = 15 ;
		
		float f =(int)a;//upCasting in Type Casting
		
		System.out.println(f);
		
		long l = 12345;
		
		short s = (short)l;//Downcasting in Type Casting
		
		System.out.println(s);
	}

}
