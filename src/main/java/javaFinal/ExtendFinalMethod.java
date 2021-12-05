package javaFinal;

import org.testng.annotations.Test;

public class ExtendFinalMethod extends CheckFinalMethod{

	// public void test4(){ } 
	@Test
	public void test6(){

		CheckFinalMethod ck = new CheckFinalMethod();
		ck.test4();
		ck.test6();
		System.out.println(ck.color);

	}

	//  public void test5(){ color ="Blue"; }

}
