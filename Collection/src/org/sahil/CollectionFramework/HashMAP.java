package org.sahil.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMAP {
	
	public static void main(String[] args) {
		
		System.out.println("11111111111111111111111111");
		HashMap map = new HashMap();
		map.put("A", 125);
		map.put("b", 125);
		map.put("c", 125);
		map.put("d", 125);
		
		System.out.println("Size of the Map Object  : "+map.size());
		
		System.out.println("2222222222222222222222222222222");
		HashMap m2  = new HashMap();
		String s1  = "sahil";
		String s2  = new String("sahil");
		m2.put(s1, "USA");
		m2.put(s2, "India");
		
		System.out.println(m2);
		
		
		//1.Iterator<String> itr = m.entrySet().iterator();
		//2. Map.Entry<String, Object> entry =   (Entry<String, Object>) m.entrySet();
		  //entry.getKey();
		  //entry.getValue();
		System.out.println(" ***** 3rd way to iterate in the map ");
		for (Object key : map.keySet()) {
			
			Object value = map.get(key);
			System.out.println(value);
		}
		
	}

}
