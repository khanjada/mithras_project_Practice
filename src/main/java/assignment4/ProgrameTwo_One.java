package assignment4;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgrameTwo_One {

	public static WebDriver driver;

	public  void base() {


		//Setting driver path 
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

		//create object for chrome driver
		driver = new ChromeDriver();

		//Maximizing our window 
		driver.manage().window().maximize();


	}

}
