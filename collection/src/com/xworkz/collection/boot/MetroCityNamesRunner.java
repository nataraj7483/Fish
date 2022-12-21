package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNamesRunner {

	public static void main(String[] args) {

		String metroNames1="Nagasandra";
		String metroNames2="YashwanthPura";
		String metroNames3="Majestic";
		String metroNames4="Jalalli Cross";
		String metroNames5="Srirampura";
		
		Collection<String> metro =new ArrayList<String>();
		metro.add(metroNames1);
		metro.add(metroNames2);
		metro.add(metroNames3);
		metro.add(metroNames4);
		metro.add(metroNames5);
		
		System.out.println(metro.size());
		
		for(String elements :metro) {
			System.out.println(elements);
		}
		
		Iterator<String> itr = metro.iterator();
		
		while(itr.hasNext()) {
			String elements = itr.next();
			System.out.println(elements);
		}
	}

}
