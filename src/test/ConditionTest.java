package test;

public class ConditionTest {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		
		if(a==b) {
			System.out.println("These are equal");
		}else {
			System.out.println("Not Equal");
		}
		
		
		String p ="Canada";
		String q = "canada";
		
		if(p.equalsIgnoreCase(q)) {
			System.out.println("These are equal");
		}else {
			System.out.println("Not Equal");
		}
		
		

	}

}
