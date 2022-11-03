package com.xworkz.things.Runner;

import com.xworkz.things.coding.Devastana;
import com.xworkz.things.coding.Temple;


public class DevastanaRunner {

	public static void main(String[] args) {
	
		Devastana devastana=new Devastana();
		Temple temple=new Temple(250,23,3,5,"Govindaswamy","Ramanavami",23,"Garden","Kamathhotel");

		devastana.useTemple(temple);
		
		temple.showOff();


	}

}
