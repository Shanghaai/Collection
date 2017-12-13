package org.sahil.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
	
	public static void main(String[] args) {
		
		//Interface : Set
		//Implementation classes : HashSet, LinkeddHashSet, TreeSet
		
		Set<String> set = new HashSet<String>();
		set.add("boby");
		set.add("alice");
		set.add("alice"); //doesn't alllow to add duplicate
		set.add("vervain");
		set.remove("alice");
		System.out.println("boby is there or not : "+set.contains("boby"));
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) 
		{
			String name = (String) iterator.next();
			System.out.println(name);
		}
		
	}

}
