package exercise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		
		actions.moveToElement(null).build().perform();
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		actions.contextClick().build().perform();
	}

}
