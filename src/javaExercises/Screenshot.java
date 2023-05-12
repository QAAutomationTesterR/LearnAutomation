package javaExercises;


import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\chromedriver_win32 (9)\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.navigate().to("http://www.google.co.in");

	Thread.sleep(5000);
	//Keys.ENTER is used to perform Keyboard Interactions 
	driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);

		
		
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	Files.copy(file, new File("C:\\SeleniumProject\\Ragudass.png"));
		
	}

}
