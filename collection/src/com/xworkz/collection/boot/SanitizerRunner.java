package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDTO dto1 = new SanitizerDTO(1, "Dettol", 500, "pink");
		SanitizerDTO dto2 = new SanitizerDTO(2, "Sterillium", 550, "Blue");
		SanitizerDTO dto3 = new SanitizerDTO(3, "Savlon", 600, "White");
		SanitizerDTO dto4 = new SanitizerDTO(4, "Lifebuoy", 800, "Green");
		SanitizerDTO dto5 = new SanitizerDTO(5, "Godrej Protekt", 700, "Red");
		SanitizerDTO dto6 = new SanitizerDTO(6, "Multani", 900, "Yellow");
		SanitizerDTO dto7 = new SanitizerDTO(7, "Corvil", 250, "White");
		SanitizerDTO dto8 = new SanitizerDTO(8, "Trust", 540, "Yellow");
		SanitizerDTO dto9 = new SanitizerDTO(9, "DCM Shriram", 970, "Blue");
		SanitizerDTO dto10 = new SanitizerDTO(10,"Dabur", 1000, "Yellow");
		
		Collection<SanitizerDTO> collections = new ArrayList<SanitizerDTO>();
		
		collections.add(dto10);
		collections.add(dto9);
		collections.add(dto8);
		collections.add(dto7);
		collections.add(dto6);
		collections.add(dto5);
		collections.add(dto4);
		collections.add(dto3);
		collections.add(dto2);
		collections.add(dto1);	
		
		Iterator<SanitizerDTO> itr1 = collections.iterator();
		while(itr1.hasNext()) {
			SanitizerDTO element= itr1.next();
			if(element.getPrice()>500) {
				System.out.println("Sanitizer price above 500;"+ element);
			}
		}
		Iterator<SanitizerDTO> itr2 = collections.iterator();
        while(itr2.hasNext()) {
        	SanitizerDTO element = itr2.next();
        	if(element!=null) {
        		System.out.println("Element is not null:"+ element);
        	}
        }
		Iterator<SanitizerDTO> itr3 = collections.iterator();
        while(itr3.hasNext()) {
        	SanitizerDTO element = itr3.next();
        	if(element.getColor().matches("Red")) {
        		itr3.remove();
        		System.out.println("element is removed:"+ element);
        	}
        }
		Iterator<SanitizerDTO> itr4 = collections.iterator();
		while(itr4.hasNext()) {
			SanitizerDTO element = itr4.next();
			if(element.getPrice()<300) {
				System.out.println("Least price of sanitizer:"+ element);
			}
		}
		Iterator<SanitizerDTO> itr5 = collections.iterator();
		while(itr5.hasNext()) {
			SanitizerDTO element = itr5.next();
			if(element.getPrice()>700) {
				System.out.println("Maximum price of sanitizer:"+element);
			}
		}
		Iterator<SanitizerDTO> itr6 = collections.iterator();
		while(itr6.hasNext()) {
			SanitizerDTO element = itr6.next();
			if(element.getPrice()>999) {
				System.out.println("Second max price of sanitizer:"+ element);
			}
		}

	}

}
