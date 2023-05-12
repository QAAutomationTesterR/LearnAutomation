package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	
	public static void main(String[] args) throws InterruptedException { // TODO Auto-generated method stub
		  //WebDriver driver = new ChromeDriver();
		  System.out.println("Welcome Selenium");
		  
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\SeleniumProject\\chromedriver_win32 (7)\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		  
		  //Enhanced Page Object Model with Page Factory
		  Thread.sleep(5000);
		  
		  PageFactory.initElements(driver,LoginPageObjects.class );
		  
		  LoginPageObjects.username.sendKeys("Admin");
		  
		  LoginPageObjects.Password.sendKeys("admin123");
		  
		  LoginPageObjects.Login.click();
		  
		  
		 // Normal Page Object Model
			/*
			 * LoginPageObjects.username(driver).sendKeys("Admin");
			 * 
			 * LoginPageObjects.Password(driver).sendKeys("admin123");
			 * 
			 * LoginPageObjects.Login(driver).click();
			 */ 
driver.close();
}
}
