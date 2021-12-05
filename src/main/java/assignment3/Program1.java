package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[]args) {
		
		//Setting driver path 
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		
		//create object for chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing our window 
		driver.manage().window().maximize();
		
		//Bring our desire website and using implicitlywait for loading element.
		driver.get("https://www.simplesite.com/pages/service-login.aspx");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		//To get the title of the page and put in a string variable name is title.& also print out.
		String title = driver.getTitle();
		System.out.println("Title Name----->  "+title);
		
		//To get the Url of the page and put in a string variable name is url.& also print out.
		String url = driver.getCurrentUrl();
		System.out.println("URl Address---->  "+url);
		
		//To get the pageSource of the page and put in a string variable name is dom .& also print out.
		String dom = driver.getPageSource();
		System.out.println("Page source---->  "+dom);
		
		/*
		 * Create element variable with data type WebElement and put all the value
		 * inside the variable & again we create String variable name is attribute.Now
		 * we call previous function called element.getAttribute. And inside the
		 * getAttribute function sign, we put attribute.Then we print out attribute.
		 */
		WebElement element = driver.findElementById("loginBox_username");
		String attribute = element.getAttribute("id");
		System.out.println("Attribute is --->  "+attribute);

		/*
		 * create element1 variable with data type WebElement and put all the value
		 * inside the variable & again we create String variable name is text.Now we
		 * call previous function called element1.getText. Then we print out text.
		 */
		WebElement element1 = driver.findElementByXPath("//a[@id='loginBox_loginbtn']");
		String text = element1.getText();
		System.out.println("Login Button Text is----->  "+ text);

		/*
		 * create element2 variable with data type WebElement and put all the value
		 * inside the variable & again we create String variable name is text1.Now we
		 * call previous function called element2.getText. Then we print out text1.
		 */
		WebElement element2 = driver.findElementByXPath("//strong[contains(text(),'Login')]");
		String text1 = element2.getText();
		System.out.println("Text is----->  "+ text1);

		/*
		 * Here we create variable name location with the help of data type Point.And
		 * put the desire element.getlocation() function. At the end we printOut
		 * location.
		 */
		Point location=element.getLocation();
		System.out.println("Login Field location is -------->  "+location);
		
		/*
		 * Here we create variable name size with the help of data type Dimension.And
		 * put the desire element.getSize() function. At the end we printOut size.
		 */
		Dimension size=element.getSize();
		System.out.println("Login Field size is -------->  "+size);
		
		/*
		 * Here we create variable name tagName with the help of data type String.And
		 * put the desire element.getTagName() function. At the end we printOut tagName.
		 */
		String tagName = element.getTagName();
		System.out.println("Login Field Tag name is -------->  "+tagName);
		
		//Here we close our current browser by close , and by quit all the opened browser.
        driver.close();
		driver.quit();

	}
}