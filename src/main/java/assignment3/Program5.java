package assignment3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting driver path 
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		
		//create object for chrome drive
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing our window 
		driver.manage().window().maximize();
		
		//Bring our desire website .
		driver.get("https://demoqa.com/browser-windows");
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		//here we using locator as xpath and action as an click.
		driver.findElementByXPath("//button[@id='tabButton']").click();
		
		//here we bring get title and current url and print out on a console for making sure we r in 1st window.
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		/*
		 * Here we create a variable name is - windows. Data type as Set<String>. And we
		 * put all the value for driver.getwindowHandle() inside the windows variable.
		 */
		Set<String> windows = driver.getWindowHandles();
		
		/*
		 * here we using for each loop. and creating a variable inside the condition
		 * field name is- eachWindow ,data type as String : then put windows variable.
		 */
		for(String eachWindow : windows) {

			driver.switchTo().window(eachWindow);
		}
		
		/*
		 * we have 2 windows. when the loop start. 1st loop met the condition then
		 * Switch to last Window- when start 2nd loop.. and condition dont met, loop
		 * break here and print get title and get current url.
		 */
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//2nd window closing here
		driver.close();
		
		/*
		 * here 2nd window is already closed . but the control is not switched from 2nd
		 * to first autometically. we have 1 windows. when the loop start. 1st loop met
		 * the condition then Switch to 1st Window- when start 2nd loop.. and condition
		 * doesn't met, loop break here.
		 */		
		windows = driver.getWindowHandles();
		for(String eachWindow : windows) {

			driver.switchTo().window(eachWindow);
		}
		
		//2 second completely stop our execution. For loading.
		Thread.sleep(2000);
		
		//here  print get title and get current url.
		System.out.println("Current Page Title is ---->  "+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Here we close our current browser by close , and by quit all the opened browser.
		driver.close();
		driver.quit();
	}


}
