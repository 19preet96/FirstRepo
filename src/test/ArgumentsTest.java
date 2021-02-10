package test;

public class ArgumentsTest {

	public static void main(String[] args) {
		
		int a = sum();
		System.out.println(a);
		
		int c = sum(3,7);
		System.out.println(c);
		System.out.println(sum(6,10));
		
		int w = sum(5,6,7);
		System.out.println(w);

	}
	public static int sum() {
		int p =4+5;
		return p;
	}
	
	public static int sum(int x, int y) {
		int q = x + y;
		return q;
	}
	
	public static int sum(int e, int f, int g) {
		int r = e+f+g;
		return r;
		
	}


}
