package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFactorywithoutFindBy {

	
	public static WebElement txtUsername;
	
	public static WebElement txtPassword;
	
	public static WebElement btnLogin;
	@Test
	public void Login()
	
	{
	
		 System.out.println("Welcome Selenium");
		  
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\SeleniumProject\\chromedriver_win32 (2)\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		  //if we are using PageFactory means,we should make WebElement Static
		  PageFactory.initElements(driver, PageFactorywithoutFindBy.class);
		  
		  txtUsername.sendKeys("Admin");
		  
		  txtPassword.sendKeys("admin123");
		  
		  btnLogin.click();
	
}
}