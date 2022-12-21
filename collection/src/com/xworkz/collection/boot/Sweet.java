package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {
		
		String sweet1="Kaju Katli";
		String sweet2="Barfi";
		String sweet3="Imarti";
		String sweet4="Rasgulla";
		String sweet5="Rasmalai";
		String sweet6="Soan Papdi";
		String sweet7="Modak";
		String sweet8="Rabri";
		String sweet9="Besen Laddu";
		String sweet10="Boondi";
		String sweet11="Kalakand";
		String sweet12="Nankhatai";
		String sweet13="Malai Khaja";
		
		Collection<String> collection=new TreeSet();
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println("After clear..");
		
		System.out.println(collection.size());
		
		
	}

	

}
