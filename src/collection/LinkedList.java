package collection;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.LinkedList list = new java.util.LinkedList<>();
		
		list.add("Ragu");
		
		list.addFirst("UR");
		
		list.addLast("Ram");
		
		list.removeFirst();
		
		list.removeLast();
		
		System.out.println(list);
		
list.add("Ragu");
		
		list.addFirst("UR");
		
		list.addLast("Ram");
		
		list.offer("MNP");
		
		list.offerFirst("VLPDY");
		
		list.offerLast("Salem");
		
		System.out.println(list);
		
		list.poll();
		
		System.out.println(list);
		System.out.println(list.peekFirst());
		
		System.out.println(list.peekLast());
		
		System.out.println(list.removeFirstOccurrence("UR"));
		
		System.out.println(list);
System.out.println(list.removeLastOccurrence("Salem"));
		
		System.out.println(list);
		
	}

}
