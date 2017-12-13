package org.sahil.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args) 
	{
		//Interface : Set
		//Implementation classes : HashSet, LinkeddHashSet, TreeSet
		//TreeSet always follow alphabetical order
		
		Set<String> set = new TreeSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three"); //doesn't alllow to add duplicate
		set.add("Four");
		set.add("Five");
		System.out.println("Insertion Order :"+set);
		System.out.println("boby is there or not : "+set.contains("boby"));
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) 
		{
			String name = (String) iterator.next();
			System.out.println(name);
		}
	}
}
