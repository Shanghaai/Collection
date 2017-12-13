package org.sahil.CollectionFramework;

import java.util.Hashtable;
import java.util.List;

public class HashtableStringDemo 
{
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		String s1 = new String("A");
		String s2 = new String("B");
		
		ht.put(s1, "abc");
		ht.put(s2, "xyz");
		System.out.println("get the object associated with s1 : "+ht.get(s1));
		System.out.println("remove method returned it's object : "+ht.remove(s1));
		
		System.out.println("===============================================");
		ht.put(s1, "abc");

		Hashtable ht1 = new Hashtable();
		
		StringBuffer sb1 = new StringBuffer("sahil-buffer1");
		StringBuffer sb2 = new StringBuffer("sahil-buffer2");
		
		ht1.put(sb1, "abc");
		ht1.put(sb2, "xyz");
		System.out.println(ht1);
		
		System.out.println("===================================================");


		Hashtable ht2 = new Hashtable();
		StringBuilder sbu1 = new StringBuilder("sahil-builder1");
		StringBuilder sbu2 = new StringBuilder("sahil-builder2");
		
		ht2.put(sbu1, "abc");
		ht2.put(sbu2, "xyz");
		System.out.println(ht2);
		
		
		
	}
}
