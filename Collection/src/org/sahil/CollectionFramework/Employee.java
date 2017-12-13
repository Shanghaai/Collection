package org.sahil.CollectionFramework;
import java.io.*;

public class Employee implements Comparable<Employee>
{
	String name;
	int id;
	double salary;
	int age;
	
	//to store data
	Employee(int id, String name,double Salary,int Age)
	{
		this.id = id;
		this.name = name;
		this.salary = Salary;
		this.age = Age;
	}
		
	//to display the data
	void displayData()
	{
		System.out.println("Employee Salary :"+salary+"\nEmployee id :"+id+"\nEmployee name :"+name);
	}

	@Override
	public int compareTo(Employee emp) 
	{
		if(this.salary> emp.salary)
			return 1;
		
		else if(this.salary < emp.salary)
			return -1;
		
		else
		return 0;
	}
	
	@Override
	public String toString() {
		
		return "object representation is ::";
		
	}
 }
