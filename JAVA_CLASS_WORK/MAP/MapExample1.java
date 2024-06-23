package com.mapexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		map.put("Teamlead", "Yash");
		map.put("Clerk", "sahil");
		map.put("ceo", "Sagar");
		map.put("MAnager", "Prathamesh");
		map.put("Admin", "Atharva");
		
		System.out.println(map.get("founder"));
		
		Set <String> designation =map.keySet();
		for(String key:designation)
		{
			System.out.println(map.get(key));
		}
		
		for(String key :designation)
		{
			System.out.println(key+ " " +map.get(key));
		}
		
		

	}

}
