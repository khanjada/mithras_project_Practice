package assignmentFive_6;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sequential {
	
	@Test
	public void test() {

		// 1. Launch Chrome web browser
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://www.google.com/");
		
		driver.quit();

	}

	@Test
	public void test1() {

		// 1. Launch Chrome web browser
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://www.google.com/");
		driver.quit();
	}

	@Test
	public void test2() {

		// 1. Launch Chrome web browser
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://www.google.com/");
		driver.quit();
	}
	@Test
	public void test3() {

		// 1. Launch Chrome web browser
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://www.google.com/");
		driver.quit();
	}

	@Test
	public void test4() {

		// 1. Launch Chrome web browser
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		//using implicitlyWait for loading element.
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Load URL
		driver.get("https://www.google.com/");
		driver.quit();
	}
	
}
