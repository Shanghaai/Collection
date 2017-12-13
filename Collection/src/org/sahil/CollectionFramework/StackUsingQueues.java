package org.sahil.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueues
{
	    Queue<Integer> q1;
	    Queue<Integer> q2;
	    
	    StackUsingQueues()
	    {
	        q1 = new LinkedList<Integer>();
	        q2 = new LinkedList<Integer>();
	    }
	    
	    public void push(int i)
	    {
	        if(q1.size()==0)
	            q1.add(i);
	        else{
	            int l = q1.size();
	            for(int j=0 ; j<l ; j++)
	                q2.add(q1.remove());
	            q1.add(i);
	            for(int k=0 ; k<l ; k++)
	                q1.add(q2.remove());
	        }
	    }
	    
	    public int pop()
	    {
	        if(q1.size()==0)
	            throw new NoSuchElementException("Underflow Exception");
	        return q1.remove();
	    }
	    
	    public int peek(){
	        if(q1.size()==0)
	            throw new NoSuchElementException("Underflow Exception");
	        return q1.peek();
	    }
	    
	    public int getSize(){
	        return q1.size();
	    }
	    
	    public void display(){
	        System.out.print("\nStack = ");
	        int l = getSize();
	        if (l == 0)
	            System.out.print("Empty\n");
	        else
	        {
	            Iterator it = q1.iterator();
	            while (it.hasNext())
	                System.out.print(it.next()+" ");
	            System.out.println();
	        }
	    }
	    
	    public static void main(String[] args){
	        StackUsingQueues stack = new StackUsingQueues();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.push(4);
	        stack.push(5);
	        stack.push(6);
	        stack.push(7);
	        stack.pop();
	        System.out.println("\nPeek-Element : "+stack.peek());
	        stack.display();
	    }
}
