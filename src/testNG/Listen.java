package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result)

	{
System.out.println("KING");
	
	}
	
	@Override()
	public void onTestSuccess(ITestResult result)
	{
System.out.println("DAVID");
}
}
