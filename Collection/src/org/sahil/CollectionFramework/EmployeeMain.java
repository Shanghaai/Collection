package org.sahil.CollectionFramework;
import java.io.*;

public class EmployeeMain 
{
	public static void main(String[] args) throws Exception 
	{ 
		int x;
	
		//to read the data from keyboared
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   Employee e1[] = new Employee[5];
	   for(int i =0; i<2; i++)
	   {
		   System.out.println("Enter id:");
		   int id  = Integer.parseInt(br.readLine());
		   
		   System.out.println("Enter name:");
		   String name = br.readLine();
		   
		 //sending data to objects for storing purpose
		   e1[i] = new Employee(id, name, 55, 85);
	   }
	   
	   //now to display the whole data from the Array
	   System.out.println("All Employee's data is :");
	   
	   for(int p=0; p<e1.length;p++)
	   {
		   //using Employee Class in two programs
		   e1[p].displayData();
	   }
	}
}
