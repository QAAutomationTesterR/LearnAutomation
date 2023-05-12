package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumProject\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[contains(@alt,'ListBox')]")).click();
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropdown1);
		
		select.selectByIndex(1);
		
		select.selectByValue("3");
		
		select.selectByVisibleText("Loadrunner");
		
		
		//List is a Collection Type to store different Elements 
		
		List<WebElement> Value = select.getOptions();
		
		int Size = Value.size();
		
		System.out.println(Size);
		
		//We can Select values from dropdown using Send Keys 
		
		dropdown1.sendKeys("App");
		
		
		//To Select multiple Options from Dropdown
		
		WebElement Multiple = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select multiSelect = new Select(Multiple);
		
		multiSelect.selectByIndex(3);
		multiSelect.selectByValue("1");
		multiSelect.selectByVisibleText("Appium");
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		//Select the data by index
		
		//Select the data by Value
		
		//Select the data by visible Text
		
		//Get no of Data available in Options 
		
		//Select Values through Sendkeys 
		
	}

}
