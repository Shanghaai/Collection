package org.sahil.CollectionFramework;
import java.util.Stack;

public class stack2 
{
  public static void main(String[] args) 
  {
	
	Stack<String> st = new Stack<String>();
	st.add("sahil");
	st.add("is");
	st.add("living");
	st.add("in Etawah");
	System.out.println("Info about sahil is :"+st);
	
	
	
	int n = st.search("living");
	System.out.println("living place is :"+n);
	
	
	}
	
}
