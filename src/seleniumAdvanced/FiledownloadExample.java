package seleniumAdvanced;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiledownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[18]/a/img")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'wrapper\']/div/div[3]/div[2]/a[1]")).click();
		
		Thread.sleep(2000);
		
		
		
		File fileL = new File("C:\\Users\\674541\\Downloads");
		
		File [] array = fileL.listFiles();
		
		for (File file : array) {
			
			if(file.getName().equals("testleaf.xlsx"))
			{
				
				System.out.println("File is downloaded");
				
				break;
			}	
			
		}
	}

}
