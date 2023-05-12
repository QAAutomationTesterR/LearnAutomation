package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exe {
	
	@Test
	@Parameters("SName")
	
	public void username(String name) {
	
System.out.println(name);
}
}