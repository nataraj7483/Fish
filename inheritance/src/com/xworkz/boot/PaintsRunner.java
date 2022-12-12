package com.xworkz.boot;

import com.xworkz.things.equales.Paints;

public class PaintsRunner {

	public static void main(String[] args) {

		
		Paints paint=new Paints("Indigo","Emulsion paint","Berger Paint","Red","Latex",350,10,true,2022-12-1,2023-12-1);
	    System.out.println(paint);
	    
	    Paints paint1=new Paints("Nippon paint","Acrylic paint","Dulux","White","Vitreous paint",350,10,true,2022-7-8,2023-3-6);
	    System.out.println(paint1);
	  //  paint=paint1;
	    
	    boolean abcd=paint.equals(paint1);
	    System.out.println(abcd);
	
	
	}

}
