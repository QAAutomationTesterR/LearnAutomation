package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\SeleniumProject\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		
		
		WebElement RadioButton  = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[6]/a/img"));
		
		RadioButton.click();
		
		WebElement RadioButton1  = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		
	boolean Status1  = RadioButton1.isSelected();
	System.out.println(Status1);
		
		WebElement RadioButton2  = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
		
		boolean Status2  = RadioButton2.isSelected();
		
		System.out.println(Status2);
		
		
		WebElement RadioButton3  = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
	
		
		boolean Status3  = RadioButton3.isSelected();
		
		System.out.println(Status3);
		
	}

}
