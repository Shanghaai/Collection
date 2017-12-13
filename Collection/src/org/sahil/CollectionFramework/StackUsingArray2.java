package org.sahil.CollectionFramework;


public class StackUsingArray2 {
private int top ; 
private int MAX_SIZE ;
private int a[]; 

public StackUsingArray2 (int s)
{
MAX_SIZE = s ;
a = new int[s];
top = -1 ; 
}

public void push(int j)
{
	if(top==MAX_SIZE-1)
		return;
	else
	a[++top]= j ; 
}

public int pop()
{
return a[top--]; 
}
public boolean isEmpty(StackUsingArray2 s)
{
	return (top==-1); 
}


void print()
{
	 for(int i=0 ; i<=top ; i++)
	   {
		   System.out.print("\n"+a[i]);
	   }
}

public static void main(String arg[])
{
	StackUsingArray2 s = new StackUsingArray2(5);
    System.out.println(s.isEmpty(s));
    s.push(2);
    s.push(5);
    s.push(10);
    s.print();
    s.pop();
    s.push(12);
    System.out.println();
    s.print();
    
  }
}