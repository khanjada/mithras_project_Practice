package assignmentFive_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut {


	@Test(timeOut = 7000)
	public void test() {

		// 1. Launch Chrome web browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);


		driver.quit();	

	}
}
