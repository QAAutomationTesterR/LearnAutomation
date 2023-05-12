package testNG;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test()
	public void agentLogin()
	
	{
		
		System.out.println("one should Login");
	}
	
	@Test()
	public void MemberLogin()
	
	{
		System.out.println("Two should Login");
		
	}
	
	@Test
	public void BrokerLogin()
	
	{
		System.out.println("Three should Login");
		
	}
	
	@Test()
	public void EndUserLogin()
	
	{
		
		System.out.println("Four should Login");
	}
	

}
