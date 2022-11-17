package com.xworkz.technicle;

public class Jack5multiple {

	public static void main(String[] args) {
		
		int n=9879;
		int temp=n;
		int count=0;
		while(n>0) {
			//System.out.println("hello");
			System.out.println(n);
			
			n=n/10;
			count++;
		}
		//System.out.println(count);
		//double b=Math.pow(5,count);
		System.out.println(((int)Math.pow(5,count))*temp);

	}

}
