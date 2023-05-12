package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	//We can use Assertions to perform Unit Testing
	
	String name = "Ragu";
	
	boolean value = true;
	@Test
	public void Printname()
	
	{
		/*
		 * if (name.equals("Ragu"))
		 * 
		 * {
		 * 
		 * System.out.println("Your name is Correct"); }
		 * 
		 * else {
		 * 
		 * System.out.println("Your name is not Correct"); }
		 */
		
		//Assert.assertEquals(name, "Ragu");
		
		Assert.assertNotEquals(name, "Ragu");
		
		//Assert.assertTrue(value, "mRagu");
		
	//	Assert.assertFalse(value, "mRagu");
		
		Assert.assertEquals(value, value);
}
	
	
}