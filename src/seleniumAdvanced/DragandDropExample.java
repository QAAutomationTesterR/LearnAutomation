package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[14]/a/img")).click();
		
		//Mouse Interactions use Actions Class
		
		Actions actions = new Actions(driver);
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\'draggable\']/p"));
		
		WebElement To = driver.findElement(By.xpath("//*[@id=\'droppable\']"));
		
		//Actions will be carried out once we provide build and Perform
		
		actions.dragAndDrop(From, To).build().perform();
		
		//actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		Thread.sleep(4000);
		
		driver.close();

		
		
	}

}
