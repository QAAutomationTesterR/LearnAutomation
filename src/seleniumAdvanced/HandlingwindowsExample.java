package seleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingwindowsExample {
	
	
	//Navigate from one window to other and perform actions
	
	//To get no of windows Opened
	
	//To close all windows other than Parent window

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		
		
		WebElement WnButton = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[11]/a/img"));
		
		WnButton.click();
		
		Thread.sleep(5000);
		
		String Parentwindow = driver.getWindowHandle();
		
				
		driver.findElement(By.id("home")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for (String NewWindow : windows) {
			
			driver.switchTo().window(NewWindow);
			
		}
		
		Thread.sleep(5000);
		
WebElement WnButton1 = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img"));
		
		WnButton1.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		driver.switchTo().window(Parentwindow);
		
		//
		
		WebElement WnButton2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
				
				WnButton2.click();

				
				 Set<String> Count = driver.getWindowHandles();
				 
				int TotalWn =  Count.size();
				
				System.out.println(TotalWn);

WebElement WnButton3 = driver.findElement(By.xpath("//*[@id=\'color\']"));
				
				WnButton3.click();
				
		Set<String>	WHandling =	driver.getWindowHandles();
		
		for (String WHN : WHandling) {
			
			if (!WHN.equals(Parentwindow))
			
			{
				
				driver.switchTo().window(WHN);
				
				Thread.sleep(4000);
				
				driver.close();
			
		}

		}	
				
				

		
		
		

	}

}
