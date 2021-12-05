package assignment4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgrameFive {

	public static ChromeDriver driver;

	@Test
	public static void tryCatch() throws InterruptedException, IOException {


		//Setting driver path 
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

		//create object for chrome driver
		driver = new ChromeDriver();

		//Maximizing our window 
		driver.manage().window().maximize();

		//Bring our desire website and using implicitlywait for loading element.
		driver.get("https://www.simplesite.com/pages/service-login.aspx");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		/*
		 * Here we use try and catch , for handle our exception then finally block use
		 * for execute at the end. Basically we keep our snap shot code here.
		 */
		try {
			driver.findElementByXPath("//input[@id='loginBox_username']").sendKeys("test");
		} 
		catch (NoSuchElementException e) {

			e.printStackTrace();
		}

		catch (Exception e) {

			e.printStackTrace();
		}
		finally {

			photoshoot();
		}

		try {
			driver.findElementByXPath("//input[@id='loginBox_password']").sendKeys("test");
		} 


		catch (Exception e) {

			e.printStackTrace();
		}

		finally {
			photoshoot();
		}


		try {
			driver.findElementByXPath("//a[@id='loginBox_loginbtn']").click();

			Thread.sleep(20000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		finally {

			photoshoot();
		}


		//Here we close our current browser by close , and by quit all the opened browser.
		driver.close();
		driver.quit();

	}

	public static void photoshoot() throws IOException {

		//random file name generator 
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;

		// Take screen shot and save it to file name src File src =
		File source = driver.getScreenshotAs(OutputType.FILE);

		// create new file dest in the project folder to copy the screen shot taken
		File destFile = new File("./reports/imagesTryCatch/" + number + ".jpg");

		// Copy file from src to dest file created inside project folder
		FileUtils.copyFile(source, destFile);

		//or--- FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/" + number + ".jpg"));

	}

}
