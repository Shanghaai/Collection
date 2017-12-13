package org.sahil.CollectionFramework;

import java.io.*;

import java.util.*;

class QueueUsingStack 
{
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public void enqueue(int value) 
	{
		s1.push(value);
	}

	public int dequeue() 
	{
		if(s2.isEmpty()) 
		{
			if(s1.isEmpty())
				return -1;
			else
			while(!s1.isEmpty()) 
			{

				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	public static void main (String[] args) 
	{
		QueueUsingStack qs = new QueueUsingStack();

		qs.enqueue(1);
		qs.enqueue(2);
		qs.enqueue(3);

		System.out.println(qs.dequeue());
		qs.enqueue(4);
		qs.enqueue(5);
		
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		qs.enqueue(6);
		System.out.println(qs.dequeue());
	  }
}