package assignment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgrameFour {
	
	@Test
	public static void frameCount() {
		
		        // 1. Launch chrome web browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				ChromeDriver driver = new ChromeDriver();

				// 2. Synchronization and Maximize
				driver.manage().window().maximize();

				//using implicitlywait for loading element.
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

				// Load URL
				driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
				
				//here we searching more than one elements, thats why using webelements, and put into frameList1 variable
				List<WebElement> frameList1 = driver.findElementsByTagName("iframe");
				
				//here we bring size function for know the size and put into a size1 variable, which one only int data 
				int size1 = frameList1.size();
				
				//here we print the size1 variable.
				System.out.println("Parent Frame count is --- > " +size1);
				
				//driver.switchTo().frame(nameOrId)
				
				
				//Here we close our current browser by close , and by quit all the opened browser.
		        driver.close();
				driver.quit();
		
	}
}
