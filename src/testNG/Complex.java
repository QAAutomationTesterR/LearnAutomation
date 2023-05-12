package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Complex {
	WebDriver driver;
	long En;
	long St;
	
	@BeforeSuite
	public void BrowserLaunch()
	{
		long St = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumProject\\\\chromedriver_win32 (3)\\\\chromedriver.exe");

		 driver = new ChromeDriver();

	}

@Test	
	public void openGoogle()
	{
		
		
			
	driver.get("https://www.google.com/");
	
	
	}
@Test
public void openBingee()
	
	
	{
		
	driver.get("https://www.bing.com/");
	
	
}

@Test
public void openYahoo()


{
	
driver.get("https://in.yahoo.com/?p=us");


}
@AfterSuite	
public void BrowserClose()
{
	driver.quit();
	 En = System.currentTimeMillis();
	
	long Tt = En-St ;
	
	System.out.println(Tt);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}