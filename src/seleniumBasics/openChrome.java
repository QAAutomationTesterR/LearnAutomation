
  package seleniumBasics;
  
  import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
  
  public class openChrome {
  
  private static final String TakesScreenshot = null;

public static void main(String[] args) throws InterruptedException, IOException { // TODO Auto-generated method stub
  //WebDriver driver = new ChromeDriver();
  System.out.println("Welcome Selenium");
  
  System.setProperty("webdriver.chrome.driver",
  "C:\\SeleniumProject\\chromedriver_win32 (7)\\chromedriver.exe");
  
  WebDriver driver = new ChromeDriver();
  
  //To provide URL in Chrome window
  
  //Get method to transverse in forward direction
  
  
 // driver.get("http://www.google.co.in");
  
  
  //Navigate method to transverse in both forward and backward direction 
  driver.navigate().to("http://www.google.co.in");
  
  Thread.sleep(5000);
  //Keys.ENTER is used to perform Keyboard Interactions 
  driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);
  
  //WebElement element = driver.findElement(By.partialLinkText("https://tiruchirappalli.nic.in/"));
  
  //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello Google");
  
  Thread.sleep(5000);
  
 // driver.navigate().refresh();
  
 // Thread.sleep(5000);
  
  // driver.navigate().back();
  
  Thread.sleep(5000);
  
  //Take Screenshots
  
  File Fl =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  
  Files.copy(Fl, new File("C:\\SeleniumProject\\chromed.png"));
 // File SF = screenshot.getScreenshotAs(OutputType.FILE);
  
  
  
  
  //driver.quit();
  
  }
  
  }
 