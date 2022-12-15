package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService{
	
	@Override
	public boolean create(PizzaDTO pizzadto) {
	   boolean output1 =true;
	   boolean output2 =true;
	   
    if(pizzadto.getName().length() >=4 && pizzadto.getName().length()<=25) {
    	
    	System.out.println("Valid Name:"+ pizzadto.getName());
    	System.out.println(pizzadto);
    }
    else {
    	System.out.println("is not a valid name:"+ pizzadto.getName());
    	
    }
	
	if(pizzadto.getPrice()>=55 &&pizzadto.getPrice()<=5000) {
		System.out.println("Valid Price:"+ pizzadto.getPrice());
    	System.out.println(pizzadto);
	}
	else {
		System.out.println("is not a valid Price:"+ pizzadto.getPrice());
	}
	if(pizzadto.getCompany().length()>=4 &&pizzadto.getCompany().length()<=25) {
		System.out.println("Valid Company:"+ pizzadto.getCompany());
    	System.out.println(pizzadto);
	}
	else {
		System.out.println("is not a valid Company:"+ pizzadto.getCompany());
	}
	if(pizzadto.getSize()==PizzaSize.SMALL||pizzadto.getSize()==PizzaSize.MEDIUM||pizzadto.getSize()==PizzaSize.LARGE) {
		System.out.println("Valid Size:"+ pizzadto.getSize());
    	System.out.println(pizzadto);
	}
	else {
		System.out.println("is not a valid Size:"+ pizzadto.getSize());
	}
	if(pizzadto.isChees()==true) {
		System.out.println("Having chees in Pizza:"+pizzadto.isChees());
		System.out.println(pizzadto);
	}
	else {
		System.out.println("chees is not added to the pizza");
	}
	if(pizzadto.getFlavour().length()>=4 &&pizzadto.getFlavour().length()<=25) {
		System.out.println("Valid Flavour:"+ pizzadto.getFlavour());
    	System.out.println(pizzadto);
	}
	else {
		System.out.println("is not a valid Company:"+ pizzadto.getFlavour());
	}
	if(pizzadto.getType()=="NonVeg"||pizzadto.getType()=="Normal") {
		System.out.println("Valid Type:"+ pizzadto.getType());
    	System.out.println(pizzadto);
    	
	}
	else {
		System.out.println("is not a valid Type:"+ pizzadto.getType());
		
	}
	if(output1 && output2==true) {
		return true;
	}
	else {
		System.out.println("Any condition not true check it");
	}
	return false;
		
	}	
}
	
