package arraylist;

import java.util.Comparator;

public class comparison implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Mobile d1 = (Mobile) o1;
		
		Mobile d2 = (Mobile) o2;
		
		if(d1.Price>d2.Price)
		{
			return -1;
			
		}
		if(d1.Price<d2.Price)
		{
			return 1;
			
		}
		else
		return 0;
	}

}
