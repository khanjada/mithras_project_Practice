package assignment_SIX;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 extends ProjectWrappers {
	
	
	
	@BeforeClass
	public void setData() {
		testCaseName = "TestCase3";
		testDescription = "Book search for Git Pocket Guide";
		browserName = "chrome";
		dataSheetName = "TC001";
		category = "Smoke";
		authors = "Hurayra";
	}
	
	@Test(dataProvider = "fetchData")
	public void testCase1(String UN, String PW, String searchText) throws InterruptedException {
		invokeApp("Chrome");
		enterById("userName", UN);
		enterById("password", PW);
		clickById("login");
		Thread.sleep(2000);
		WebElement element = driver.findElementByXPath("//span[contains(text(),'Book Store')]");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Book Store')]");
		enterByXpath("//input[@id='searchBox']", searchText);
		clickByXpath("//a[contains(text(),'Git Pocket Guide')]");
		String bookTitle = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Book title is " + bookTitle);
		
		String publisher = getTextByXpath("(//label[@id=\"userName-value\"])[6]");
		System.out.println("Publisher is " + publisher);
		WebElement element2 = driver.findElementByXPath("//button[contains(text(),'Add')]");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		clickByXpath("//button[contains(text(),'Add')]");
		System.out.println("Sucessfully clicked");
		acceptAlert();
		
		WebElement scrollToProfile =  driver.findElementByXPath("//span[contains(text(),'Profile')]");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",scrollToProfile);
		clickByXpath("//span[contains(text(),'Profile')]");
		
		System.out.println("Sucessfully Click on profile");
		
		verifyTextByXpath("//span[@id ='see-book-Git Pocket Guide']","see-book-Git Pocket Guide");
		
		System.out.println("Sucessfully verified");
		clickByXpath("//button[contains(text(),'Log out')]");
		
		System.out.println("Sucessfully logout");
		
		quitBrowser();
	}

}
