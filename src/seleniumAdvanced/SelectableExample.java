package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[15]/a/img")).click();
		
		List<WebElement> Selectables = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		int Size = Selectables.size();
		
		System.out.println(Size);
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(Selectables.get(0)).click(Selectables.get(1)).click(Selectables.get(3)).build().perform();
		
		action.clickAndHold(Selectables.get(2));
	
		action.clickAndHold(Selectables.get(4));
		
		action.build().perform();
		
		//action.keyDown(Keys.ENTER);
		
	}
	}


