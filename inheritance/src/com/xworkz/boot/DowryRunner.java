package com.xworkz.boot;

import com.xworkz.things.Dowry;
import com.xworkz.things.DowryAmount;

public class DowryRunner {

	public static void main(String[] args) {
		
		Dowry dowry=new DowryAmount("abc",1000000,"xyz");
		System.out.println("dowry receiver is is: "+dowry.receiver);
		System.out.println("dowry amount is: "+dowry.price);
		System.out.println("dowry donor   is: "+dowry.donor);
		
		
		Dowry dowry1=new DowryAmount();
		
    	if(dowry instanceof Dowry) {
		Dowry dowry2=(Dowry)dowry1;
		System.out.println(dowry2.receiver);
		System.out.println(dowry2.price);
		System.out.println(dowry2.donor);
		
	}
    	else {
    		System.out.println("Object is not created");
    	}
	}

	}


