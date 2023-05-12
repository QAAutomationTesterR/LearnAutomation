package array;

import java.util.Comparator;

public  class arrayexe implements Comparator {

	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String S1 = o1.toString();
		
		String S2 =(String) o2;
		
		if (S1.length()>S2.length())
		{
		
		return -12;
	}
		else if (S1.length()<S2.length())
		{
		
		return +12;
	}
		else return 0;

}
}
