package array;

import java.util.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayInCol {

	public ArrayInCol(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String [] name = {"Anu","Sonu","Banu","Thenu"}; //Array Declaration - Non
		 * Prim DT
		 * 
		 * Arrays.sort(name); // Sorting Array
		 * 
		 * for (String string : name) {
		 * 
		 * System.out.println(string);
		 * 
		 * }
		 * 
		 * String [] no = {"33","24","95","56"};
		 * 
		 * for (String s1 : no) {
		 * 
		 * System.]out.println(s1);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * Arrays.sort(no);//Sorting the elements in Array
		 * 
		 * for (String s : no) {
		 * 
		 * System.out.println(s);
		 * 
		 * }
		 */

ArrayInCol a1 = new ArrayInCol("Vishnu");

ArrayInCol a2 = new ArrayInCol("Ganesh");

ArrayInCol a3 = new ArrayInCol("Murugan");

ArrayInCol [] user = {a1,a2,a3};

arrayexe exe = new arrayexe();



//Arrays.sort(user,exe);

//Arrays.sort(user);

for (ArrayInCol s5 : user) {
	
	System.out.println(s5);
	
}

		
			}

}
