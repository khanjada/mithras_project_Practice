package classWork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunTimeEcception {
	
	static ChromeDriver driver;
	@Test
	public void runTimeException() throws WebDriverException, IOException  {

		// Step 1: Launch Chrome
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();

		// Step 2: Maximize window
		driver.manage().window().maximize();

		// Step 3: Load URL
		driver.get("https://www.linkedin.com/login");

		// Step 4: Enter Username		
		try {
			driver.findElementById("username").sendKeys("test");
			//To throw new user defined exception
			throw new Exception("My test is FAILED");
		} 
		catch (NoSuchElementException e) {
			System.out.println("Exception is " +e);
		} 
		catch (Exception e) {
			System.out.println(e);
		} 
		finally {
			takeSnap();
		}
		
		// Step 5: Enter password
		try {
			driver.findElementById("password").sendKeys("test");
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			takeSnap();
		}
		// Step 6: Click submit
		try {
			driver.findElementByXPath("//button[@type='submit']").click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			takeSnap();				
		}
		System.out.println("Success");
		driver.close();
		driver.quit();
	}

	public static long takeSnap() throws WebDriverException, IOException {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/" + number + ".jpg"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return number;
	}
	
	

}


