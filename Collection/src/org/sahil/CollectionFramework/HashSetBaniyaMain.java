package org.sahil.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class HashSetBaniyaMain
{
	public static void main(String[] args) {
		
		HashSetBaniya e1  =new HashSetBaniya("A");
		HashSetBaniya e2  =new HashSetBaniya("C");
		HashSetBaniya e3  =new HashSetBaniya("Z");
		HashSetBaniya e4  =new HashSetBaniya("R");
		HashSetBaniya e5  =new HashSetBaniya("A");
		HashSetBaniya e6  =new HashSetBaniya("B");		
		
		HashSet hs  = new HashSet();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);

	Iterator itr = hs.iterator();
		
	while (itr.hasNext()) {
		HashSetBaniya object = (HashSetBaniya) itr.next();
		System.out.println(object.name +" HashCode is :"+object.hashCode());
	}
	
  }
	
}