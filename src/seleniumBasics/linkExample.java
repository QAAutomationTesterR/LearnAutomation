package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//img[@alt='Link']")).click();
	
	
	
	Thread.sleep(5000);
	
	driver.findElement(By.partialLinkText("Find where")).click();
	
	//driver.findElement(By.linkText("Go to Home Page")).click();
	
	Thread.sleep(2000);
	
	driver.close();
	}

}
