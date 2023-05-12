package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[20]/a/img")).click();
		
		//ToolTip- when we keep cursor towards any element it shows info about the element called tooltip

		
		String Value  = driver.findElement(By.xpath("//*[@id=\'age\']")).getAttribute("title");
		
		System.out.println(Value);
		
		driver.close();
		
	}

}
