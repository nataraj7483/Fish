package com.xworkz.things.coding;

public class Remote {
	
public Tv tv;
	
	public void useTv(Tv tv)
	{
		System.out.println(tv);
		System.out.println(tv.ambassador);
		System.out.println(tv.access);
		System.out.println("TV Brand :"+tv.getBrand());
		tv.setBrand("APL");
		
		System.out.println("after modifing :"+tv.getBrand());
		
	}

}
