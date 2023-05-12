package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortTablesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/sortable.html");
		
List<WebElement> Sort	=	driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));

for (WebElement webElement01 : Sort) {
	
	System.out.println(webElement01.getText());
}

WebElement From = Sort.get(6);

WebElement To = Sort.get(0);

Actions action = new Actions(driver);

action.dragAndDrop(From, To).build().perform();

Thread.sleep(5000);

driver.close();


	}

}
