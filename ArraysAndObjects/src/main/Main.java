package main;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		
		ArrayList<Object> objects = new ArrayList<Object>();
		
		Object o1 = new Object();
		
		Object o2 = new Object("Colan", 10, 52.7);
		
		objects.add(o1);
		
		objects.add(o2);
		
		for(int i =0; i<objects.size(); i++) {
			
			System.out.println(objects.get(i).getName());
			System.out.println(objects.get(i).getHealth());
			System.out.println(objects.get(i).getGold());
			
		}
		
	}
	
}
