package org.sahil.CollectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

class TreeSetComparatorDemo {
	
	public static void main(String[] args) {
		
	TreeSet t = new TreeSet(new myComparator());
	t.add(10);
	t.add(0);
	t.add(15);
	t.add(5);
	t.add(20);
	t.add(20);
	System.out.println(t);
 }
}

class myComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		
		return i1.compareTo(i2);  
		//0 will be compared with 10 bcz as we know 0<10 It will returns a - value to the TreeSet object
		//and - means it sud come before the elemnt which is already inserted i.e 10
		
		//return -i1.compareTo(i2);//JVM will get + VALUE  in this case and + means after.		
		//return i2.compareTo(i1);
		//return -i2.compareTo(i1);
		
		//return +1878; after
		//return -12; before
		//return 0; 0 means duplicate object must be there so it will not add
	}
}