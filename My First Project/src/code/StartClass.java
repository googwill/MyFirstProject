package code;

import testPackage.TestClass;

public class StartClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		TestClass myObject = new TestClass();
		int num = myObject.GetNumber();
		System.out.println(num);
		
		myObject.display();
		System.out.println("test 1");
		
	}

}
