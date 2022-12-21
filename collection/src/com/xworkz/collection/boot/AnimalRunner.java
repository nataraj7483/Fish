package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {

		String animal1="Slender Lorises";
		String animal2="Tiger";
		String animal3="Lion";
		String animal4="Cheeta";
		String animal5="Elephant";
		String animal6="Bear";
		String animal7="Deer";
		String animal8="Fox";
		String animal9="Rabbit";
		String animal10="Hippopotamus";
		
		Collection<String> animals= new ArrayList<String>();
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		animals.add(animal7);
		animals.add(animal8);
		animals.add(animal9);
		animals.add(animal10);
		
		System.out.println(animals.size());
		
		for(String elements:animals) {
			System.out.println(elements);
		}
		Iterator<String> itr=animals.iterator();
		while(itr.hasNext()) {
			
			String elements=itr.next();
			System.out.println(elements);
		}
		
	}

}
