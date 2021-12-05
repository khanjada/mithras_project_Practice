package classWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameCount {
	
	@Test
	public void frameCount() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// driver.switchTo().defaultContent();
		
		List<WebElement> framelist1 = driver.findElementsByTagName("frame");
		Thread.sleep(3000);
		int size1 = framelist1.size();
		System.out.println("Parent frame size is " + size1);
		
		driver.switchTo().frame("frame-top");
		List<WebElement> framelist2 = driver.findElementsByTagName("frame");
		Thread.sleep(3000);
		int size2 = framelist2.size();
		System.out.println("Nested frame size is " + size2);
		
		driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame-bottom");
	    
	    List<WebElement> list3=	driver.findElementsByTagName("frame");
	    int size3 =list3.size();
	    System.out.println("Nested frame count of bottom frame is "+size3);
		driver.close();
		driver.quit();
	}

}
