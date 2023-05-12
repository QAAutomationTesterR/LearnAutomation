package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumProject\\\\chromedriver_win32 (5)\\\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
driver.get("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
	
	//Enter Value
	
	WebElement editbox =  driver.findElement(By.id("email"));
	
	editbox.sendKeys("Raguram@gmail.com");
	
	//Append the Text
	
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("Text");
	
	//Get value in the Text
	String Data = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).getAttribute("value");
	
	System.out.println(Data);
	
	//Clear Text
	
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).clear();
	
	//Check Text Box is disabled
	
	Boolean Result = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled();
	
	Boolean Status = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled();
	
	if(Status.TRUE)
		
	{
		
		
	}
	
	if(Result.TRUE)
	{
	
	System.out.println(Result);
	}
driver.close();
}
}