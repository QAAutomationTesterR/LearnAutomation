package arraylist;

import java.util.Comparator;

public class ComparatorExe implements Comparator {
	
	
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Mobile m1 = (Mobile)o1;
		
		Mobile m2 = (Mobile)o2;
		
		if (m1.storage>m2.storage)
		{
		return +4;
	}
		if (m1.storage<m2.storage)
		{
		return -4;
	
	
}
		else
		return 0;
			

		
}
}