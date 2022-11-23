package com.xworkz.boot;

import com.xworkz.things.equales.God;
import com.xworkz.things.equales.WaterBattle;

public class GodRunner {

	public static void main(String[] args) {

		God god=new God("Hanuman","orange",2,true,"hosadurga","karnataka","Shashi",8736786,87767,2);
		System.out.println(god);
		
		God god1=new God("Muneshwara","Black",4,true,"koramangala","karnataka","raj",687676767,87675,3);
		System.out.println(god1);
		
		boolean abcd=god.equals(god1);
	    System.out.println(abcd);

	}

}
