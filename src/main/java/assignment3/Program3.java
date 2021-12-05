package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting driver path 
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		
		//create object for chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing our window 
		driver.manage().window().maximize();
		
		//Bring our desire website .
		driver.get("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		//Here we perform or locate by Xpath and click as an action.
		driver.findElementByXPath("//button[@id='alertButton']").click();
		
		//Here we handle windows alert by accept
		driver.switchTo().alert().accept();
		
		//completely stop our execution for 2 second for loading.
		Thread.sleep(2000);
		
		
		//Here we perform or locate by Xpath and click as an action.
		driver.findElementByXPath("//button[@id='confirmButton']").click();
		
		//Here we handle windows alert by dismiss.
		driver.switchTo().alert().dismiss();
		//completely stop our execution for 2 second for loading.
		Thread.sleep(2000);
		
		//Here we perform or locate by Xpath and click as an action.
		driver.findElementByXPath("//button[@id='promtButton']").click();
		
		//Here we handle windows alert by sendKeys
		driver.switchTo().alert().sendKeys("Rony");
		
		//Here we handle windows alert by accept.
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		//Here we close our current browser by close , and by quit all the opened browser.
		driver.close();
		driver.quit();

	}

}
