package org.sahil.CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

import org.sahil.CollectionFramework.Employee;

public class EmployeeMainTreeSetDemo 
{
   public static void main(String[] args) 
   {
	TreeSet<Employee> ts = new TreeSet<Employee>(); // we are using  Generics here i.e. its a Employee Specific TreeSet Object
	
	ts.add(new Employee(4,"sahil",205,24));
	ts.add(new Employee(5,"wasim",204,55));
	ts.add(new Employee(6,"nseem",2020,66));
	ts.add(new Employee(7,"naagdu",20,33));
	ts.add(new Employee(8,"MOHD SALEEM",2041,27));
	ts.add(new Employee(9,"RUKHSHANA PRAVEEN",100,45));
	
	
	System.out.println("SET size :"+ts.size());
	System.out.println("Set elements are :"+ts);
	String str1 =ts.first().toString();
	byte[] b= str1.getBytes();
	System.out.println("byte of object ::::::::::::::::::"+b.toString());
	System.out.println("1st element is : "+str1);
	
	//Iteration in TreeSet to get the elements
	Iterator<Employee> i = ts.iterator();
	
	
	while(i.hasNext())
	{
		Employee e =(Employee)i.next();
		System.out.println("\nSorting Of Employee Object using TreeSet :" );
		//System.out.println(e.id);
		//System.out.println(e.name);
		//System.out.println("=======================================================================");
		//System.out.println("Employee salary after applying sorting on salary itself  :"+e.salary);
		e.displayData();
		System.out.println("=======================================================================");
	  }
	}
}
