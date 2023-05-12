package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	
	
	@Test
	
	public void openGoogle()
	
	{
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");

		}
	
@Test
	
	public void openBing()
	
	{
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");

		}
	
	
}