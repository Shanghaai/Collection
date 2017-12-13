package org.sahil.CollectionFramework;
import java.util.ArrayList;

public class Arraylist 
{
	public static void main(String[] args) 
	{
		// now this arrylist will only take values or object
    	//  related to string not digit
    	ArrayList<String> i = new ArrayList<String>();
    	
    	ArrayList l = new ArrayList();
    	l.add("sahilshanghai@gmail.com");
    	System.out.println(l.size());
    	System.out.println(l);
    	System.out.println("------------------------------------");
    	
	/*i.add(20);
	i.add(21); for these value you need to create a Collection object of type ArrayList<int> of type int
	i.add(22);
	*/
    	
	
	i.add("abc");
	System.out.println(i);
	
	i.remove(0);
	System.out.println("now see:"+i);
	
	i.add(0,"xyz");
	i.add(1,"MMM");
	i.add("3");
	i.add("@");
	i.add("$");
	i.set(0, "sahil");
	System.out.println(i);
	}	
}
