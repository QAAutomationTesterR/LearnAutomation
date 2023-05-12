package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	//@FindBy(how = How.NAME,using = "username")
	
	@FindBy(id = "txtUsername")
	public static WebElement username;
	@FindBy(id = "txtPassword")
	public static WebElement Password;
	@FindBy(id = "btnLogin")
	public static WebElement Login;
	
	/*
	 * 
	 * public static WebElement username(WebDriver driver)
	 * 
	 * 
	 * 
	 * {
	 * 
	 * return driver.findElement(By.id("txtUsername"));
	 * 
	 * }
	 * 
	 * public static WebElement Password(WebDriver driver)
	 * 
	 * { return driver.findElement(By.id("txtPassword")); }
	 * 
	 * public static WebElement Login (WebDriver driver)
	 * 
	 * { return driver.findElement(By.id("btnLogin"));
	 * 
	 * }
	 */	
}