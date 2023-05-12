package seleniumAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\SeleniumProject\\\\\\\\\\\\\\\\chromedriver_win32 (1)\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		WebElement Quick = driver.findElement(By.xpath("//td[contains(text(),\'30%\')]//following::td[1]"));
		Quick.click();

		
		  List<WebElement> Columncount =
		  driver.findElements(By.xpath("//*[@id=\'table_id\']/tbody/tr[1]/th"));
		  
		  System.out.println(Columncount.size());
		  
		  List<WebElement> Rowcount = driver.findElements(By.tagName("tr"));
		  
		  System.out.println(Rowcount.size());
		  
		  WebElement Percent = driver.findElement(By. xpath("//td[contains(text(),\'Learn to interact with Elements\')]//following::td[1]" ));
		  ////td[contains(text(),\'30%\')]//following::td[1]
		  System.out.println(Percent.getText());
		  
		  Thread.sleep(5000);
		 
	List<WebElement> Percentage = driver.findElements(By.xpath("//td[2]"));
	
	List<Integer> Operation = new ArrayList<Integer>();
	
	for (WebElement webElement : Percentage) {
		
	String Per = 	webElement.getText().replace("%","");
	
	
	
	
	
	
	
	Operation.add(Integer.parseInt(Per));
	//System.out.println(Operation);
	
	
	}
	System.out.println(Operation);
		
		int min = Collections.min(Operation);
		
	String Data = Integer.toString(min);
	
	String Final = Data + "%";
	
	String Pass = "//td[contains(text(),"+"\""+ Final+"\"";
	
	//+"//following::td[1]\"
	
	System.out.println(Pass);	
	
	String Pass01 = Pass + ")]" + "//following::td[1]";
	
	System.out.println(Pass01);	
	
	String Pass02 = "\""+Pass01 + "\"";
	
	System.out.println(Pass02);
	
	Thread.sleep(5000);
	
	//	WebElement Quick = driver.findElement(By.xpath("//td[contains(text(),\'30%\')]//following::td[1]"));
			//	Quick.click();
		
		Thread.sleep(5000);
		//driver.close();
		
		
	}

}
