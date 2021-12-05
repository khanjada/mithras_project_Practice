package aui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class Program4 {

	@Test
	public static void rightClick() throws InterruptedException {

		// 1. Launch Chrome web browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		// Load URL
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		// create object from action class
		Actions action = new Actions(driver);

		//create object from webdriverwait
		WebDriverWait ex= new WebDriverWait(driver,30);

		//Locate element and keep in a webelement .
		WebElement rightClick = driver.findElementByXPath("//span[@class='context-menu-one btn btn-neutral']");

		// using explicit object  with condition
		ex.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='context-menu-one btn btn-neutral']")));

		// using context click for right click
		action.contextClick(rightClick).build().perform();
		action.click(rightClick);

		//Stopping execution for 3 second.
		Thread.sleep(3000);
		
		//close all the browser
		driver.quit();

	}

}
