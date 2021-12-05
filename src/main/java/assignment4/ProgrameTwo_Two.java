package assignment4;

import java.util.concurrent.TimeUnit;

public class ProgrameTwo_Two extends ProgrameTwo_One {

	public  void waitAndUrl() {
		
		//Bring our desire website and using implicitlywait for loading element.
		
		driver.get("https://www.simplesite.com/pages/service-login.aspx");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	}

}
