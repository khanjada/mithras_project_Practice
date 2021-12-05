package aui;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Program6 {
	@Test
	public static void selectAll() throws InterruptedException {

		// 1. Launch Chrome web browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		// Load URL
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		// switching to desire frame
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']")); 
		
		

		//creating object from action class
		Actions action = new Actions(driver);

		//locate webelement and put in under given name.
		WebElement volvo
		=driver.findElementByXPath("(//select[@name='cars']//option)[1]");
		WebElement saab
		=driver.findElementByXPath("(//select[@name='cars']//option)[2]");
		WebElement opel
		=driver.findElementByXPath("(//select[@name='cars']//option)[3]");
		WebElement audi
		=driver.findElementByXPath("(//select[@name='cars']//option)[4]");

		// here using key down for pressing commad key and keyup for release that key.
		action.keyDown(Keys.COMMAND)
		.click(volvo)
		.click(saab)
		.click(opel)
		.click(audi)
		.keyUp(Keys.COMMAND)
		.build()
		.perform();

		//stop execution for 3 second
		Thread.sleep(3000); 
		//close all browser
		driver.quit();

	}

}
