package collection;

import java.util.ArrayList;
import java.util.Collections;

import array.Mobile;

public class ComparatorInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Device m1 = new Device(35000, 64, 8);
		
		Device m2 = new Device(25000, 32, 12);
		
		Device m3 = new Device(45000, 128, 4);
	
		ArrayList al = new ArrayList();
		
		al.add(m1);
		
		al.add(m2);
		
		al.add(m3);
		
		System.out.println(al);
		
		Verification verify = new Verification();
		
		Collections.sort(al,verify);
		
		System.out.println(al);
		
	}

}
