package com.xworkz.exception.boot;

public class DDD {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("started");
		//airtematic exception
		int a,b,c;
		a=10;
		b=0;
		c=a/b;
		System.out.println(c);
		
	}
		catch (ArithmeticException e) {
			System.out.println("running catch");
		}
		System.out.println("endeds");
			
	}
	

}
