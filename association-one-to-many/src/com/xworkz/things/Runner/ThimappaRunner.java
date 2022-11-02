package com.xworkz.things.Runner;

import com.xworkz.things.coding.Thimappa;
import com.xworkz.things.coding.Tirupathi;

public class ThimappaRunner {

	public static void main(String[] args) {
		
		Thimappa thimappa=new Thimappa();
		Tirupathi tirupathi=new Tirupathi(20,100,"RudraPrathpa","Rajamarthanda",15,20,"GovindaSwamy",15,10);

		thimappa.useTirupathi(tirupathi);
		
		tirupathi.showOff();


	}

}
