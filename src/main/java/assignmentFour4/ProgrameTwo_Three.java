package assignmentFour4;

public class ProgrameTwo_Three extends ProgrameTwo_Two {

	public static void main(String[] args) {

		/*
		 * Here we applying multilevel inheritance. we create object for ProgrameTwo_Three,
		 * and create object obj ,we are calling previous method from different 2
		 * classes and and execute on 3rd class.
		 */

		ProgrameTwo_Three obj = new ProgrameTwo_Three();

		obj.base();
		obj.waitAndUrl("https://www.simplesite.com/pages/service-login.aspx");
		driver.close();
		driver.quit();

	}


}
