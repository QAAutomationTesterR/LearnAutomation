package collection;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		java.util.TreeMap<Integer, String> hmap = new java.util.TreeMap<>();
		

hmap.put(0, "Alex");
hmap.put(4, "Selenium");
hmap.put(2, "CSharp");
hmap.put(1, "Phython");
hmap.put(3, "Java");
hmap.put(5, "Eclipse");

//hmap.put(null, "ddd");

System.out.println(hmap);

System.out.println(hmap.headMap(4));

System.out.println(hmap.tailMap(4));

System.out.println(hmap.higherKey(3));

System.out.println(hmap.descendingMap());



	}

}
