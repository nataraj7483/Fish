package com.xworkz.exception.boot;

public class RWWW {
	
	public static void main(String[] args) {
		
			System.exit(0);
			System.out.println("start");
			
			
			try {
				Class.forName("com.xworkz.exception.boot.RWWW");
			} catch (ClassNotFoundException e) {
				System.out.println("hgvhhghgg");
				e.printStackTrace();
			}
		Object obj="gfvgf";
		//casting
		Integer it=(Integer)obj;// class cast exception
		
		System.out.println("aftrr exception");
		
		
		
			
			System.out.println("benki");
			System.out.println("bhavya");
			System.out.println("s");
			
			
			
	
		System.out.println("end");
		
		
		
	}

}
