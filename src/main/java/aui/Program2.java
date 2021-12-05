package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Program2 {
	@Test
	public static void mouseOverOne() throws InterruptedException {
		// 1. Launch Chrome web browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://www.browserstack.com");
		
		//Locate element and keep in a webelement .
        WebElement element= driver.findElementByXPath("(//div[@class=\"product-card product-card-hero\"])[1]");
		WebElement element2 = driver.findElementByXPath("(//div[@class=\"product-card product-card-hero\"])[5]");

		// create object from action class
		Actions action = new Actions(driver);
		
		//using move to element method for moving cursor
		action.moveToElement(element).build().perform();
		System.out.println("cursor moved");
		
		//Stopping execution for 3 second.
		Thread.sleep(3000);
		
		action.moveToElement(element2).build().perform();
		System.out.println("cursor moved");
		Thread.sleep(3000);
		
		// here we use double click method 
		action.doubleClick(driver.findElementById("free-trial-link-anchor")).build().perform();
		Thread.sleep(3000);
		System.out.println("DoubbleClick job done");
		
		driver.findElementByXPath("//img[@class='w-svg']").click();
		// here we use- sendKeys(Keys.PAGE_DOWN) for scrolling our page allthe way down
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		System.out.println("Page Scroll all the way down");
		Thread.sleep(3000);
		
		// close all the browser
		driver.quit();
		}
	
}


