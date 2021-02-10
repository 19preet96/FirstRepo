package test;

public class ArrayTest {

	public static void main(String[] args) {
		String tool = "Selenium";
		System.out.println(tool);
		
		String[] tools= {"Selenium","QTP","Postman","Jira","Testlink"};
		for(int i=0;i<tools.length;i++) {
			
		System.out.println(tools[i]);
		}
		
		int[] numbers = {1,5,7,9,11};
		for(int j=0;j<numbers.length;j++) {
			
			System.out.println(numbers[j]);
			}
		
		
		Object[] general = {4, "Selenium", 'n'};
		for(int k=0;k<general.length;k++) {
			
			System.out.println(general[k]);
			}
		
		

	}

}
