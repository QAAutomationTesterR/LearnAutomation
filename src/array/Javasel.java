package array;

import java.util.TreeSet;

public class Javasel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Character> ts = new TreeSet<>();

ts.add('A');
ts.add('B');
ts.add('C');
ts.add('D');
ts.add('E');
System.out.println(ts.higher('B'));
System.out.println(ts.lower('B'));

System.out.println(ts.headSet('B'));
System.out.println(ts.tailSet('B'));
System.out.println(ts.subSet('B', 'E'));
System.out.println(ts.pollFirst());
System.out.println(ts.pollLast());
System.out.println(ts.descendingSet());


	}

}
