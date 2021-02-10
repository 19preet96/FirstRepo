package test;

public class ForLoopTest {

	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			System.out.println("This is "+ i + " Circle.");
			if(i==50)
			{
				break;
			}
			
		}
		System.out.println("After the loop.");

	}

}
