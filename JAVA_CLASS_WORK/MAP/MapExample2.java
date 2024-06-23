package com.mapexamples;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a map using hashmap
		Map<String, Integer> emp = new HashMap<String, Integer>();
		
		//inserting elements inside the map
		emp.put("Atharva", 1111);
		emp.put("Sahil", 2222);
		emp.put("Sagar", 3333);
		emp.put("Prathamesh",4444);
		emp.put("Yash", 5555);
		System.out.println("Map:" +emp);
		
		//Access keys of the map
		System.out.println("Keys:" + emp.keySet());
		
		//Access the values of map
		System.out.println("Values:" + emp.values());
		
		//access the entries of map
		System.out.println("Entries:"+ emp.entrySet());
		
		//remove the element from the map
		int value = emp.remove("Yash");
		System.out.println("Removed element:" + value);

	}

}
