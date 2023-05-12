package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtended {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.navigate().back();
		
		String Page = driver.findElement(By.partialLinkText("Find where")).getAttribute("href");
		
		System.out.println(Page);
		
		//Stale Element Reference Exception - Element Property will get changed when navigate from one page to other
		
		
WebElement BrokenLink = driver.findElement(By.partialLinkText("Verify"));
		
		
BrokenLink.click();

String Title = driver.getTitle();

if (Title.contains("404"))
	
{
		System.out.println("Link is Broken");
	}
driver.navigate().back();

}
}