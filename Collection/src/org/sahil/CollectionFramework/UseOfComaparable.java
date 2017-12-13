package org.sahil.CollectionFramework;

class HDTV implements Comparable<HDTV> 
{
	private int size;
	private String brand;
 
	public HDTV(int size, String brand)
	{
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
 
	@Override
	public int compareTo(HDTV tv)
	{
 
		if (this.getSize() > tv.getSize()) //sorting with size i.e. 55 and 60
			return 1;
		
		else if (this.getSize() < tv.getSize())
			return -1;
		
		else
			return 0;
	}
}
 
public class UseOfComaparable 
{
	public static void main(String[] args) 
	{
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
		
	    System.out.println("see what compareTo will erturn when 55 copmpare to 60:"+tv1.compareTo(tv2));
	    								
		if (tv1.compareTo(tv2) > 0) //means 55 < 60 thats why it is returning -1 to us 
									//means current object i.e 55 is less than next object value
		{
			System.out.println(tv1.getBrand() + " is better.");
		} 
		else 
		{
			System.out.println(tv2.getBrand() + " is better."); //here see tv2 is Sony and tv1 which is the 1st object is (55,samsumg)
		}
	}
}