package classWork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SnapShot {

	public static ChromeDriver driver;

	@Test
	public static void photo() throws IOException {

		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://drive.google.com/drive/u/0/folders/1d2_LMFFTaC2zwoyRvXzVCB2a2b35e6Hb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		photoshoot();
		
		driver.quit();


	}

	public static void photoshoot() throws IOException {
		
		//random file name generator 
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;

		// Take screen shot and save it to file name src File src =
		File source = driver.getScreenshotAs(OutputType.FILE);

		// create new file dest in the project folder to copy the screen shot taken
		File destFile = new File("./reports/images/" + number + ".jpg");

		// Copy file from src to dest file created inside project folder
		FileUtils.copyFile(source, destFile);
	
       //or--- FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/" + number + ".jpg"));

	}



}
