package test;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		printMe();
		String a = hell();
		System.out.println(a);
		System.out.println(hell());
		
		System.out.println(sum());
		int b = sum();
		System.out.println(b);
		

	}
	
	public static void printMe() {
		System.out.println("printMe");
	}
	
	public static String hell() {
		String s ="Testing";
		return s;
		
	}
	
	public static int sum() {
		int p =4+5;
		return p;
	}

}
