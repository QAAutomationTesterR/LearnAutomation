package exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\chromedriver_win32 (7)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		
		String name = "Ragu";
		
		if(name.equals("Ragu"))
		{
		
		System.out.println("Name is displayed");
	}
	
	}
	

}
