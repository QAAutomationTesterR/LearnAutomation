package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\SeleniumProject\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, 125);
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	
	driver.get("http://www.leafground.com/");
	
	
	
	WebElement AlertBox  = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/img"));
	
	AlertBox.click();
	
WebElement NormalAlert	= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));

NormalAlert.click();

Alert alert = driver.switchTo().alert();

alert.accept();


WebElement ConfirmAlert	= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));

ConfirmAlert.click();

Alert alert1 = driver.switchTo().alert();

alert1.dismiss();



WebElement PromptAlert	= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));

PromptAlert.click();

Alert alert2 = driver.switchTo().alert();

alert2.sendKeys("Welcome");

//alert2.getText();

alert2.accept();

Thread.sleep(5000);
	driver.close();
	}

}
