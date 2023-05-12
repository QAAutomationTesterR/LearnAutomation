package testNG;

import org.testng.annotations.Test;

public class PrioritizeTestcase {

	//Prioritizing the Test Case is used to set the order of Execution
	
	@Test()
	public  void DReport() 
	{
	System.out.println("Welcome to TestNG-A");
}
	@Test()
	public  void CReportA() 
	{
	System.out.println("Welcome to TestNG-B");
}
	@Test()
	public  void CReporta()
	{
	System.out.println("Welcome to TestNG-C");
}
	@Test()
	public  void AReportC ()
	{
	System.out.println("Welcome to TestNG-D");
}

	
}
