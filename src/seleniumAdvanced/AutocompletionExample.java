package seleniumAdvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompletionExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[17]/a/img")).click();
		
		driver.findElement(By.xpath("//*[@id=\'tags\']")).sendKeys("s");
		Thread.sleep(5000);
		
	List	< WebElement> ad= driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
	
	System.out.println(ad.size());
	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
		 
		for (WebElement webElement : ad) {
			
			if(webElement.getText().equals("Selenium")) {
				
				
				webElement.click();
				Thread.sleep(5000);
				break;
				
				//Using break statement used to avoid further execution once the condition is satisfied
			
		}
		
		}
		
	}

}
