package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collctionsexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList al = new ArrayList<>();
		
		Mobile samsung = new Mobile (30000,85,8);
		
		Mobile realme = new Mobile(45000, 75, 10);
		
		Mobile oppo = new Mobile(15000,60,6);
		
		al.add(samsung);
		
		al.add(realme);
		
		al.add(oppo);
		
		System.out.println(al);
		
	//	ComparatorExe exe = new ComparatorExe();
		
		comparison comparison = new comparison();
		
			Collections.sort(al,comparison);
		
		//Collections.sort(al,exe);
		
		//System.out.println(Collections.binarySearch(al, 0));
		
		System.out.println(al);
		
		
		
		
	}

}
