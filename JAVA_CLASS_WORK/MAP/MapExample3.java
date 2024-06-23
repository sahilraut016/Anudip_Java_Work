package com.mapexamples;

import java.util.Map;
import java.util.TreeMap;

public class MapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> treemap= new TreeMap<>();
		
		//Adding elements to the map
		treemap.put("Atharva", 1);
		treemap.put("Sahil", 2);
		treemap.put("Sagar", 3);
		treemap.put("Prathamesh",4);
		treemap.put("Yash", 5);
		System.out.println("Map:" +treemap);
		
		// Getting values from a treemap
		int valueAtharva = treemap.get("Atharva");
		System.out.println("Value of A:  " + valueAtharva);
		
		//removing elements from the tree map
		treemap.remove("Sagar");
		
		// iterating over the elements of the tree map
		 for (String key : treemap.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + treemap.get(key));
	        }

	}

}
