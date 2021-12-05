package assignmentFour4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgramSix {


	@Test
	public static void xpath() {

		// 1. Launch Chrome web browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://demoqa.com/text-box");

		//here we using relative xPath with "tag name attribute and value"
		driver.findElement(By.xpath("//input[@id='userName']")).isDisplayed();

		//here we using relative xPath with " tagName , contains,attribute,& partial of the value.
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).isDisplayed();

		//here we using relative xPath with "tagName ,starts-with,attribute and first part of value
		driver.findElement(By.xpath("//textarea[starts-with(@id,'current')]")).isDisplayed();

		//here we using relative xPath with "tagName ,starts-with,attribute and first part of value
		driver.findElement(By.xpath("//textarea[starts-with(@id,'permanent')]")).isDisplayed();

		//Here we close our current browser by close , and by quit all the opened browser.
		driver.close();
		driver.quit();

	}
}
