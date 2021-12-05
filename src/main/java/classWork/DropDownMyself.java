package classWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMyself {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		WebElement dropDown = driver.findElementByXPath("//select[@id='dropdown']");
		Select select = new Select(dropDown);
		
		Thread.sleep(1000);
		select.selectByIndex(1);
		
		Thread.sleep(1000);
		select.selectByValue("2");
		
		Thread.sleep(2000);
		select.selectByVisibleText("Option 1");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
