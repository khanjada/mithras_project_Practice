package assignmentFour4;

import java.util.concurrent.TimeUnit;

public class ProgrameTwo_Two extends ProgrameTwo_One {

	public  void waitAndUrl(String url) {
		
		//Bring our desire website and using implicitlywait for loading element.
		
		//we did here parametarise b-coz , we want to put the value 
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	}

}
