package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParalellTesting {
	
	

	@Test
	@Parameters("Name")
	public void Printname(String named)
	{
System.out.println("The name is " + named);
}
}
