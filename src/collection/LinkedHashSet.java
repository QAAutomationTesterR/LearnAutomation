package collection;

import java.util.Arrays;

public class LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.LinkedHashSet hsset = new java.util.LinkedHashSet<>();
hsset.add("Selenium");
hsset.add("Kanban");
hsset.add("TestNG");
hsset.add("Cucumber");
hsset.add("Datadriven");
hsset.add("Selenium");
hsset.add(null);
System.out.println(hsset);

Object[]  hsetarr=   hsset.toArray();

for (Object object1 : hsetarr) {
	

System.out.println(object1);
	}

Arrays.asList(hsetarr);

}
}