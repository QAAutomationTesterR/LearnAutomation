package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.ITestAnnotation;



public class Listeners implements ITestListener
	


{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Run one");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Run Two");	
		
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("Run Three");
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
		System.out.println("Run Four");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
		System.out.println("Run Five");
	}
	
	public void onStart(ITestResult result)
	{
		System.out.println("Run Six");
		
	}
	
	public void onFinish(ITestResult result)
	{
		System.out.println("Run Seven");
		
	}
	

}