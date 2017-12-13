package org.sahil.CollectionFramework;

public class HashSetBaniya {

	String name;
	HashSetBaniya(String name)
	{
		this.name = name;
	}

	@Override
	public int hashCode() {
		int count = 0;
		return count++;
	}
	
	@Override
	public boolean equals(Object obj) {
		int count=0;
		if(this.name.equals(name))
		{
			System.out.println("duplicates are found by equals method");
			count++;
			System.out.println("count is :"+count);
			return true;
		}
		return false;
		
	}
	
	
	/*
	public String toString()
	{
		return "...hey i am OBJECT saying hi to you";
	}*/
}
