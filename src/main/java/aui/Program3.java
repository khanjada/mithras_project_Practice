package aui;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Program3 {

	@Test
	public static void dragDrop() throws InterruptedException {

		// 1. Launch Chrome web browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://demoqa.com/droppable");
		
		// create object from action class
		Actions action = new Actions(driver);
		
		//Locate element and keep in a webelement .
		WebElement drag=driver.findElementById("draggable");
		WebElement drop=driver.findElementById("droppable");
		
		//using dragAndDrop method
		action.dragAndDrop(drag, drop).build().perform();
		
		//Stopping execution for 3 second.
		Thread.sleep(3000);
		
		//close all the browser
		driver.quit();
	}


}
