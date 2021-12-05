package assignmentFive_5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 extends GenericWrappers{
	
	
	@Parameters({"URL","UserName","Password"})
	@Test
	public void testCase1(String url,String userName,String pass) throws InterruptedException {
		
		/*
		 * here we call "invoke app" that method hold the code , that do open our
		 * browser, maxi,and implicitwait. But in this class we are passing argument,
		 * "Chrome" and "https://demoqa.com/login" , bcoz invoke code was paramatarised
		 */
		invokeApp("Chrome", url);
		
		//Here we call enterById method , to locate our element by id, and put the argument here.
		enterById("userName", userName);
		enterById("password", pass);
		
		//Here we call clickById method , to do action by click, and put the argument here those paramatarise before
		clickById("login");
		//stopping our execution for 2 second.
		Thread.sleep(2000);
		//locate element by xpath and keep it as an webelement element
		WebElement element = driver.findElementByXPath("//span[contains(text(),'Book Store')]");
		//calling javascriptExecutor for scroll our page.
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//stopping our execution for 2 second.
		Thread.sleep(2000);
		
		//Here we call clickByXpath method , to do action by click, and put the argument here those paramatarise before
		clickByXpath("//span[contains(text(),'Book Store')]");
		//Here we call enterByXpath method , to locate our element by xpath, and put the argument here.
		enterByXpath("//input[@id='searchBox']", "Git Pocket Guide");
		//Here we call clickByXpath method , to do action by click, and put the argument here those paramatarise before
		clickByXpath("//a[contains(text(),'Git Pocket Guide')]");
		/*
		 * here we call "getTextByXpath" that method hold the code , that bring  text
		 * to us, here booktitle variable hold the value and print it,
		 * But in this class we are passing argument, 
		 */
		String bookTitle = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Book title is " + bookTitle);
		//Calling clickByXpath  method.
		clickByXpath("//button[@id='submit']");
		//closing our single browser by this method
		closeBrowser();
		//closing our all browser by this method
		closeAllBrowsers();
	}

}


