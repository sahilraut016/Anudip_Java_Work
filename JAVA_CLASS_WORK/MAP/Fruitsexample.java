package com.mapexamples;

import java.util.Map;
import java.util.TreeMap;

public class Fruitsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Integer> fruits = new TreeMap<>();
		
		//Adding elements in the map
		fruits.put("Mango", 100);
		fruits.put("Apple", 150);
		fruits.put("jackfruit", 200);
		fruits.put("chikuu", 250);
		fruits.put("grapes", 300);
		
		System.out.println(fruits);
		
		Map<String, Integer> morefruits = new TreeMap<String , Integer>();
		
		//Adding elements in the new map
		morefruits.put("guava", 350);
		morefruits.put("banana", 400);
		morefruits.put("watermelon", 450);
		System.out.println(morefruits);
		
		//adding the elements of morefruits into fruits
		fruits.putAll(morefruits);
		System.out.println(fruits);
		
		//get element
		System.out.println("The value of searched element :" + fruits.get("grapes"));
		
		//removing an element from the map
		fruits.remove("Mango");
		System.out.println("list after removing Mango:" + fruits);
		
		
		//clear the map
		fruits.clear();
		System.out.println(fruits);
		
		//check if map is empty
		System.out.println(fruits.isEmpty());
		
		//add a element and check if again with the isempty() function
		fruits.put("papaya", 1000);
		System.out.println(fruits.isEmpty());
		System.out.println("list after adding papaya");
		System.out.println(fruits);
	}

}
