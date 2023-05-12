package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\SeleniumProject\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		
		
		WebElement CheckBox  = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img"));
		
		CheckBox.click();
		

		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		
		
		checkbox1.click();
		
		Thread.sleep(4000);
		
		
		  WebElement checkbox2 = driver.findElement(By.xpath(
		  "//*[@id=\'contentblock\']/section/div[2]/div/input"));
		  
		  
		  if(checkbox2.isSelected())
		  
		  { 
			  
			  checkbox2.click();
		  
		  }
		  
		  
		 		
		
		
	}

}
