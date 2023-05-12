package collection;

import java.util.Comparator;

public class Verification implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Device d1 = (Device) o1;
		
		Device d2 = (Device) o2;
		
		if(d1.RAM>d2.RAM)
		return -1;
		
		else if(d1.RAM>d2.RAM)
			return +1;
		else
			return 0;
	}

}
