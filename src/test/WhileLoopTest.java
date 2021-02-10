package test;

public class WhileLoopTest {

	public static void main(String[] args) {
		int i = 0;
		
		while(i<100) {
			System.out.println(i);
			if(i==50) {
				break;
			}
			i++;
		}

	}

}
