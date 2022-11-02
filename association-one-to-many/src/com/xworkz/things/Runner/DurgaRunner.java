package com.xworkz.things.Runner;

import com.xworkz.things.coding.Durga;
import com.xworkz.things.coding.Hosadurga;

public class DurgaRunner {

	public static void main(String[] args) {
	
		Durga durga=new Durga();
		Hosadurga hosadurga=new Hosadurga(5,9,"Gulehatti","Raj",20,80,"Hindu mahaganapathi",70,1000);

		durga.useHosadurga(hosadurga);
		
		hosadurga.showOff();
	}

}
