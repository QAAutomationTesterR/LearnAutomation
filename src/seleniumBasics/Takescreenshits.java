package seleniumBasics;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Takescreenshits {
	
	@Test
	public void Validation() throws InterruptedException, IOException, AWTException
	{
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\chromedriver_win32 (7)\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.navigate().to("http://www.google.co.in");

Thread.sleep(5000);
//Keys.ENTER is used to perform Keyboard Interactions 
driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);

//File Source = ((Takescreenshot)driver).getScreenshotAs(OutputType.FILE);

File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

Files.copy(Source, new File("C:\\\\SeleniumProject\\\\chromeD.png"));
WebDriverWait wait = new WebDriverWait(driver, 50);

//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));


driver.get(driver.getCurrentUrl());

Robot robot = new Robot();
//Refresh the Browser
robot.keyPress(KeyEvent.VK_F5);
robot.keyRelease(KeyEvent.VK_F5);
//2

driver.manage().window().maximize();

//Dimension dim = new Dimension(123,256);
ChromeOptions options = new ChromeOptions();

options.addArguments("----start maximized------");

//https://username:password@url


driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


String URL = driver.getCurrentUrl();

System.out.println(URL);
}
}