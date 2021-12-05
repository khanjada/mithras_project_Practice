package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) {
		
		//Setting driver path 
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		
		//create object for chrome drive
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing our window 
		driver.manage().window().maximize();
		
		//Bring our desire website .
		driver.get("https://demoqa.com/frames");
		
		// Here we handle Frame or Iframe by calling  the function frame. and putting the id value inside the function sign
		driver.switchTo().frame("frame1");
		
		//Print out for make sure we are realy enter the frame.
		System.out.println("In side the window");
		
		/*
		 * Create element variable with data type WebElement and put all the value
		 * inside the variable & again we create String variable name is text .Now we
		 * call function called element.gettext(). Then we print out text variable.
		 */
		WebElement element = driver.findElementByXPath("//h1[@id='sampleHeading']");
		
		String text = element.getText();
		System.out.println("Text is -----> "+text);
		//here we get back to our mother Frame with the help of defaultContent().
		driver.switchTo().defaultContent();
		
		//here we print out to confirm we r in  mother page
		System.out.println("Back to First Window");
		
		//Here we close our current browser by close , and by quit all the opened browser.
		driver.close();
		driver.quit();

	}

}
