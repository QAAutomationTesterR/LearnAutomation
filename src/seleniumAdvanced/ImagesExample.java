package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img")).click();
		
		Thread.sleep(2000);
		
driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img")).click();
		
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img")).getAttribute("naturalWidth").equals("0"))
			
		{
		System.out.println("Image is broken");

	}

}
}