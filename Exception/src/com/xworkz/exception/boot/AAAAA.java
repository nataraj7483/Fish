package com.xworkz.exception.boot;

public class AAAAA {
	
	public static void main(String[] args) {
	try {	
		System.out.println("start");
		//null pointer
		String a=null;
		System.out.println(a.toLowerCase()); 
		 
		
		
	}
	catch (NullPointerException e) {
		System.out.println("running catch");
	}
		
		System.out.println("end");
	}

}
