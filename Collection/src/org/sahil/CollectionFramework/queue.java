package org.sahil.CollectionFramework;
import java.util.*;

public class queue 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		int s =q.size();
		System.out.println(s);
		
		boolean b =q.contains(5);
		System.out.println(b);
		
		int x = q.peek();
		System.out.println(x);
		
	}
}