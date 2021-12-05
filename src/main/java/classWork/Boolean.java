package classWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean {


	public static void main(String[] args) {

		// Step1: Launch Chrome.
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		//Step2: Load URL.
		driver.get("https://the-internet.herokuapp.com/checkboxes");

		//Step3: Maximize window.
		driver.manage().window().maximize();

		//Step4: Check whether web element is displayed.
		WebElement element = driver.findElementByTagName("h3");
		boolean Display = element.isDisplayed();

		//Step5: Check whether the CheckBox is selected or not.
		WebElement checkBox1 = driver.findElementByXPath("(//input[@type='checkbox'])[1]");
		boolean Selected1 = checkBox1.isSelected();

		WebElement checkBox2 = driver.findElementByXPath("(//input[@type='checkbox'])[2]");
		boolean Selected2 = checkBox2.isSelected();

		//Step6: Check whether web element is enabled.
		driver.get("https://demoqa.com/radio-button");
		WebElement element2 = driver.findElementByXPath("//input[@id='noRadio']");
		boolean Enable = element2.isEnabled();

		//Step7: Print all outputs
		System.out.println("Display is :" +Display);
		System.out.println("Selected1 is :" +Selected1);
		System.out.println("Selected2 is :" +Selected2);
		System.out.println("Enable is :" +Enable);

		//Step8: Close browser and driver instance.
		driver.close();
		driver.quit();
	}

}
