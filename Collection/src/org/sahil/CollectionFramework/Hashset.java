package org.sahil.CollectionFramework;
import java.util.*;

public class Hashset
{
	public static void main(String[] args) 
    {
    	HashSet hs = new HashSet();
	
	    //to store the elements in hashset
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(1);
		hs.add("A");
		hs.add("A");
		
    	
		//for iteration we should use Iterator interface or listIterator or for-each loop
		//change the hashSet into  iterator interface
		Iterator  n= hs.iterator();
		while(n.hasNext()) //hasNext will provide the elements present in hs 
		{
			  Object  m  = (Object)n.next();//next returns elements or objects
			  System.out.println(m); //hashSet never consider order
		}
    }
}