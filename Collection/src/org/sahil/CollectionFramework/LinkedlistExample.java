package org.sahil.CollectionFramework;
import java.io.*;
import java.util.*;

public class LinkedlistExample 
{	
public static void main(String[] args) throws IOException 
  {
	  //Generics Example i.e.(String Specific
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("America");
	ll.add("India");
	ll.add("Japan");
	ll.add("China");
	ll.add("Russia");
	
	System.out.println("Elements of LinkedList:"+ll);
	
	//now take some variables
	int choice=0, position;
	String Elements;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("\nTo add the elemnts in Linkedlist type object press 1");
	System.out.println("To remove the element press 2");
	 
	choice = Integer.parseInt(br.readLine());
	
	switch(choice)
	{
		case 1: System.out.println("Enter Element");
				String Element =br.readLine();
				ll.add(Element);
				System.out.println("Now see the total elements : "+ll);
		break;
				
		case 2: System.out.println("Type the index please");
				int ww =	br.read();
			    ll.remove(ww);
				System.out.println("Element removed successfully");
				System.out.println("After removal remaining elements are :"+ll);
		break;
	}
 }	
	
}
