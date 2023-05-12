package seleniumAdvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/upload.html");

		//driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[19]/a/img")).click();

		Thread.sleep(4000);



		driver.findElement(By.name("filename")).click();

		Thread.sleep(7000);

		String file = "C:\\Users\\674541\\Downloads\\testleaf.xlsx";

		StringSelection selection = new StringSelection(file);


		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
				null);

		Robot robot = new Robot();

		Thread.sleep(5000);
		
		Keys.chord(Keys.CONTROL,Keys.RETURN);

		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);



		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
	}

}
