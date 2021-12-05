package aui;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Program5 {

	@Test
	public static void holdAndRelease() throws InterruptedException {

		// 1. Launch Chrome web browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://jqueryui.com/selectable/");

		// switch to desire frame
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		
		//Locate element and keep in a webelement .
		WebElement item1 = driver.findElementByXPath("(//ol[@id='selectable']//li)[1]");
		WebElement item7 = driver.findElementByXPath("(//ol[@id='selectable']//li)[7]");
		
		// create object from action class
		Actions action = new Actions(driver);
		
		//using click and hold method
		action.clickAndHold(item1).release(item7).build().perform();
		
		//Stopping execution for 3 second.
		Thread.sleep(3000);
		
		//Close all browser
		driver.quit();

	}

}
