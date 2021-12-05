package sessionNine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParalalRun {
	
	WebDriver driver = null;
	
	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		System.out.println("m1");
		driver.close();
	}

	@Test
	public void test2(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		System.out.println("m2");
		driver.quit();
	}
	
	
	

}
