package com.xworkz.boot;

import com.xworkz.things.BuffetCatering;
import com.xworkz.things.Catering;

public class BuffetCateringRunner {
	
	public static void main(String[] args) {
		Catering catering=new BuffetCatering("EatFit","Pratik","Bangalore");
		System.out.println("Catering name is: "+catering.cateringName);
		System.out.println("Catering owner name is: "+catering.cateringOwner);
		System.out.println("Catering location is: "+catering.cateringLocation);
		
		
        Object obj=new BuffetCatering();
		if(obj instanceof BuffetCatering) {
			BuffetCatering buffetcatering=(BuffetCatering)obj;
			
			System.out.println(buffetcatering.cateringName);
			System.out.println(buffetcatering.cateringOwner);
			System.out.println(buffetcatering.cateringLocation);
		}
		else {
			System.out.println("Object is not catering");
		}
	}


}
