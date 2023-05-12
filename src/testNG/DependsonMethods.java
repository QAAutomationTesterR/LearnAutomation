package testNG;

import org.testng.annotations.Test;

public class DependsonMethods {

	@Test(enabled = true)
	public  void DReport() 
	{
	System.out.println("Welcome to TestNG-A");
}
	@Test(dependsOnMethods = "BReportB")
	public  void CReportA() 
	{
	System.out.println("Welcome to TestNG-B");
}
	@Test(enabled=true)
	public  void BReportB()
	{
	System.out.println("Welcome to TestNG-C");
}
	@Test(dependsOnMethods = "DReport")
	public  void AReportC ()
	{
	System.out.println("Welcome to TestNG-D");
}

	
}
