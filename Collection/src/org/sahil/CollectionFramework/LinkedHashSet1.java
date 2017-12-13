package org.sahil.CollectionFramework;

import java.util.Iterator;

import java.util.*;
import java.util.Set;
import java.util.*;
import java.util.TreeSet;

public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		
		//Interface :                       Set
		//Implementation classes : HashSet, LinkedHashSet, TreeSet
		//TreeSet always follow alphabetical order
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("boby");
		set.add("alice");
		set.add("alice"); //doesn't alllow to add duplicate
		set.add("vervain");
		set.add("charlie");
		System.out.println("boby is there or not : "+set.contains("boby"));
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) 
		{
			String name = (String) iterator.next();
			System.out.println(name);
		}
		
	}

}
