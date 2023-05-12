package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement Quick03 = driver.findElement(By.xpath("//*[@id=\'datepicker\']"));
		Quick03.click();
		Thread.sleep(1000);
		
		WebElement Quick = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]"));
		Quick.click();
		Thread.sleep(1000);
		WebElement Quick01 = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		Quick01.click();

		driver.close();
	}

}
