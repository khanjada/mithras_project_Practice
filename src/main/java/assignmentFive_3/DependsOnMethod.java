package assignmentFive_3;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void testCase1() {
		System.out.println("testCase1");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "assignmentFive_3.DependsOnMethod.testCase1", alwaysRun = true)
	public void testCase2() {
		System.out.println("testCase2");
	}

	@Test(dependsOnMethods = "assignmentFive_3.DependsOnMethod.testCase2")
	public void testCase3() {
		System.out.println("testCase3");
	}

	@Test(enabled = false)
	public void testCase4() {
		System.out.println("testCase4");
	}

}
