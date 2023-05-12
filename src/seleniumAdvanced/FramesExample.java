package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		
		
		WebElement FmButton = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[10]/a/img"));
		
		FmButton.click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click")).click();
		
		String Text = driver.findElement(By.id("Click")).getText();
		
		System.out.println(Text);
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
driver.findElement(By.id("Click1")).click();
		
		String Text1 = driver.findElement(By.id("Click1")).getText();
		
		System.out.println(Text1);
		
		driver.switchTo().defaultContent();
		
		
	List<WebElement> Count = 	driver.findElements(By.tagName("iframe"));
	
	int Size = Count.size();
		
		System.out.println(Size);
		driver.close();
		

	}

}
