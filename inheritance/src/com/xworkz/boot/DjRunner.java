package com.xworkz.boot;

import com.xworkz.things.Dj;
import com.xworkz.things.DjParty;

public class DjRunner {

	public static void main(String[] args) {
	
		Dj dj=new DjParty("disco","hundred",654793L);
		System.out.println("dj name is: "+dj.djName);
		System.out.println("no of djs are: "+dj.noOfDjs);
		System.out.println("dj price  is: "+dj.price);
		
		Object obj=new DjParty();
		if(obj instanceof Dj) {
			Dj dj1=(Dj)obj;
			System.out.println(dj1.djName);
			System.out.println(dj1.noOfDjs);
			System.out.println(dj1.price);
			
		}
		
		
	}

	}


