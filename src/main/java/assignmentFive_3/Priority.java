package assignmentFive_3;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 4)
	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 3)
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 3, successPercentage = 100)
	public void test3() {
		System.out.println("test3");
	}

	@Test(priority = 1, expectedExceptions = RuntimeException.class)
	public void test4() {
		System.out.println("test4");
		throw new RuntimeException();
	}

}
