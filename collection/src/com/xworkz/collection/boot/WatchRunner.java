package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {

	public static void main(String[] args) {

		String watch1="Sonata";
		String watch2="HMT";
		String watch3="Fastrack";
		String watch4="Boat";
		String watch5="Apple";
		
		Collection<String> watch= new ArrayList<String>();
		
		watch.add(watch1);
		watch.add(watch2);
		watch.add(watch3);
		watch.add(watch4);
		watch.add(watch5);
		
		System.out.println(watch.size());
		
		for(String elements :watch) {
			System.out.println(elements);
		}
		Iterator<String> itr=watch.iterator();
		
		while(itr.hasNext()) {
			String elements = itr.next();
			System.out.println(elements);
		}
		
	}

}
