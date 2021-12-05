package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		
		//Setting driver path 
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		
		//create object for chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing our window 
		driver.manage().window().maximize();
		
		//Bring our desire website and using implicitlywait for loading element.
		driver.get("https://demoqa.com/radio-button");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		/*
		 * Create element variable with data type WebElement and put all the value
		 * inside the variable & again we create boolean variable name is displayed.Now
		 * we call function called element.isDisplayed. Then we print out displayed.
		 */
		WebElement element = driver.findElementByXPath("//div[contains(text(),'Do you like the site?')]");
		boolean displayed = element.isDisplayed();
		System.out.println("Do you like the site: Label is displayed ------>  "+ displayed);
		
		/*
		 * Create element1 variable with data type WebElement and put all the value
		 * inside the variable & again we create boolean variable name is enable.Now we
		 * call function called element1.isEnabled. Then we print out enable.
		 */
		WebElement element1 = driver.findElementByXPath("//input[@id='noRadio']");
		boolean enable = element1.isEnabled();
		System.out.println("No radio button is Enabled ------>  "+enable);
		
		/*
		 * Create element2 variable with data type WebElement and put all the value
		 * inside the variable & again we create boolean variable name is selected.Now
		 * we call function called element2.isSelected.Then we print out selected.
		 */	
		
		WebElement element2 = driver.findElementByXPath("//label[@for='yesRadio']");
		boolean selected = element2.isSelected();
		System.out.println("Yes Radio button is selected ------>  "+ selected);
		
		//Here we close our current browser by close , and by quit all the opened browser.
		driver.close();
		driver.quit();


	}

}
