package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	
	
	//Click
	
	//Location 
	
	//Color
	
	//Size

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumProject\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[contains(@alt,'Buttons')]")).click();
		
		
		//Perform Click Operation 
		//driver.findElement(By.xpath("//button[contains(@id,'home')]"));
		
		//To get Position 
		
		WebElement Position  = driver.findElement(By.xpath("//button[contains(@id,'position')]"));
		
		// Point Class will get xy Co-ordinates
		Point point = Position.getLocation();
		
		
		
		int x = point.getX();
		
		int y = point.getY();
		
		System.out.println(x + "and" + y);
		
		//driver.close();
		
		//To get Color
		
		WebElement Color = driver.findElement(By.xpath("//button[contains(@id,'color')]"));
		
		String Colorvalue = Color.getCssValue("background-color");
		
		System.out.println(Colorvalue);
		
		//To get Size 
		
int size =	Color.getSize().getHeight();
		
		//CSS : Cascading Style Sheets
		
		WebElement Size =driver.findElement(By.xpath("//button[contains(@id,'size')]"));
		
		int Height = Size.getSize().getHeight();
		int width = Size.getSize().getWidth();
		
		System.out.println("Height is " + Height + " and Width is " + width);
		
		
	}

}
