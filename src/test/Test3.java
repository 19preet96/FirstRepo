package test;
//static methods can be called directly in other classes just with their name first
//non static methods need to be made object first even in same class.

public class Test3 {
	
	static Test1 t1 = new Test1();
	static Test3 t3 = new Test3();

	public static void main(String[] args) {
		Test1.scanMe();
		t1.testMe();
		
		circle();
		t3.square();
		
		

	}
	
	public static void circle() {
		System.out.println("Circle");
	}
	public void square() {
		System.out.println("Square");
	}

}
