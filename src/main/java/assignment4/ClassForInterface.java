package assignment4;

import org.testng.annotations.Test;

public class ClassForInterface implements InterfaceOne,InterfaceTwo{
	//Here we implement 2 interface a single class By using implements keyword.

	public static void impTest() {

		System.out.println("Class that implements interfaceOne and have its own function too");		

	}

	//instead of main method, we are using here @Test annotation for execute the test.
	@Test
	public void run(){

		//calling method and passing parameter argument.
		add(3,4);
		subb(5,3);
		mul(3,5);
		div(10,2);
		addA(3,4);
		subbA(5,3);
		mulA(3,5);

	}	
	//Method implemented from interfaceOne
	public  void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is "+sum);

	}
	//Method implemented from interfaceOne
	public void subb(int a, int b) {
		int sub = a-b;
		System.out.println("Sub is "+sub);

	}
	//Method implemented from interfaceOne
	public void mul(int a, int b) {
		int mul = a*b;
		System.out.println("Mul is "+mul);

	}
	// Class ClaasForInterface own method
	public void div(int a, int b){
		int div = a/b;
		System.out.println("Div is "+div);
	}
	//Method implemented from interfaceTwo
	public void addA(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is "+sum);

	}
	//Method implemented from interfaceTwo
	public void subbA(int a, int b) {
		int sub = a-b;
		System.out.println("Sub is "+sub);

	}
	//Method implemented from interfaceTwo
	public void mulA(int a, int b) {
		int mul = a*b;
		System.out.println("Mul is "+mul);


	}

}
