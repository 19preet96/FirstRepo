package test;

import selenium.Test4;

public class Test1 {
	
	//ClassName objName = new ClassName
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	
	static Test4 t4 = new Test4(); // creating object from different package
	

	public static void main(String[] args) {
		System.out.println("I am in Main Method");
		printMe();
		scanMe();
		t1.testMe();
		t1.cleanMe();
		Test2.red();
		t2.blue();
		
		Test3.circle();
		t3.square();
		
		Test4.car();
		t4.truck();
		

	}
	
	public static void printMe() {
		System.out.println("Print me method");
	}
	
	public static void scanMe() {
		System.out.println("Scan Me");
	}
	
	public void testMe() {
		System.out.println("testMe");
	}
	
	public void cleanMe() {
		System.out.println("CleanMe");
	}

}
