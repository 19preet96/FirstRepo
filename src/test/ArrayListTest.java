package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ClassName objectName = new ClassName();
		
		ArrayList<String> tools = new ArrayList<String>();
		tools.add("Jack");
		tools.add("Harper");
		tools.add("Tom");
		tools.add("Cruise");
		
		System.out.println(tools);
		System.out.println(tools.get(0));
		System.out.println(tools.size());
		
		tools.remove(1);
		System.out.println(tools.get(1));
		
		for(int i=0;i<tools.size();i++)
		{
			System.out.println(tools.get(i));
		}
		
		for(String s : tools) {
			System.out.println(s);
		}
		

	}

}
