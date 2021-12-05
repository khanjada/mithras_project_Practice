package assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgrameOne {

	@Test
	public static void overLoading() {

		// 1. Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		/*
		 * Here driver object always loaded by different different parameter,
		 * WebDriver is super class, under superclass there is all the browser
		 * driver,,ChromeDriver, FireFox,edge etc.
		 */
		WebDriver driver = new ChromeDriver();

		//Based on a driver object we are doing different different action.

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		/*
		 * Here also Method overloading in implicit wait, for example we can give time
		 * unit different different, like second, min , etc. Different means parameter.
		 * Using implicitlywait for loading element.
		 */
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL, here method overloading happen. b-coz we can put different different argument.
		driver.get("https://demoqa.com/text-box");

		//driver close and quit.
		driver.close();
		driver.quit();

	}
}
