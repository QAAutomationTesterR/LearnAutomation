package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {

	@Test(priority=4)
	public  void DReport() 
	{
	System.out.println("Welcome to TestNG-A");
}
	@Test()
	public  void CReportA() 
	{
	System.out.println("Welcome to TestNG-B");
}
	@Test(priority=3)
	public  void BReportB()
	{
	System.out.println("Welcome to TestNG-C");
}
	@Test()
	public  void AReportC ()
	{
	System.out.println("Welcome to TestNG-D");
}

	
}
