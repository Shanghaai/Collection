package org.sahil.CollectionFramework;
import java.util.*;

import java.io.*;

public class StackExample 
{
	public static void main(String[] args) throws Exception
     {
		int choice = 0;
       Stack<Integer> st = new Stack<Integer>();
	   //to read the data from keyBoared
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   //display the menu as long as user choice is <4
	   System.out.println("Stack Opration");
	   System.out.println("\nPress 1 for push operation");
	   System.out.println("Press 2 for pop operation");
	   System.out.println("Press 3 for searching in the stack");
	   System.out.println("4 for exit");
	   System.out.println("your choice please :");
	   while(choice<4)
	   {   
		   choice = Integer.parseInt(br.readLine());
		   
		   //perform a task depending on the user choice
		   switch(choice)
		   {
		   case 1: System.out.println("Enter element for push operation");  
		   		   int element = Integer.parseInt(br.readLine());
		           st.push(element);  
		           break;
		           
		   case 2: System.out.println("Enter Element for pop operation");
		   		   Integer x = st.pop();
		   		   System.out.println("popped element :"+x);
		   		   break;
		   case 3: System.out.println("which element ?");
		   			int x1  = Integer.parseInt(br.readLine());
		   		    int position = st.search(x1);
		   		   if(position ==-1)
		   		       System.out.println("Element not found");
		   		   else
		   			   System.out.println("Position : "+position);
		   		   break;
		   case 4: System.out.println("Exiting done .. and elements are...");
		           System.out.println("Stack Elements :"+st);
		  // 	default: return; //comes out if user choice is invalid
		   }
	   }
     }	
}
