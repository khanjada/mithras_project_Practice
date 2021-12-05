package sessionNine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationTimeOut {
	
	
	@Test(invocationCount = 3, invocationTimeOut = 18000)
	public void test() {

		// 1. Launch Chrome web browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);


		driver.quit();	

	}

}
