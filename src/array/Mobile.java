package array;

import java.util.Arrays;
import java.util.Comparator;

public class Mobile {

	public Mobile(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] oppo = {"Good","Neutral","OK"};
		
		String [] vivo = {"Gooded","Neutralalite","OKishoneother"};
		
		System.out.println(Arrays.equals(oppo, vivo)); // Compare two Arrays
		
		arrayexe comp = new arrayexe(); // Data Binding
		
		Arrays.sort(oppo,comp);//To sort the elements in array as per length
		
		for (String string9 : oppo) {
			
			System.out.println(string9);
			
		}
		
Arrays.sort(vivo,comp);//To sort the elements in array as per length
		
		for (String string10 : vivo) {
			
			System.out.println(string10);
			
		}
	}

}
