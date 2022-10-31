package com.has.coding.code;

import com.has.coding.constant.MangoColor;

public class Tree {
	public double height;
	public String type;
	public Mango mango=new Mango("Mango", 38.9, 100, true,MangoColor.RED);
	public void set(double height,String type)
	{
		this.height=height;
		this.type=type;
		
	}
	
	public void show()
	{
		System.out.println(this.height);
		System.out.println(this.type);
		if(mango!=null)
		{
			
	     mango.display();
		}
		else 
		{
			System.out.println("exit");
			
		}
	}
	

}
