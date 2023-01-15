package com.xworkz.movies.boot;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MobileRunner {

	public static void main(String[] args) {

		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("OnePlus", 28989);
		map.put("iQOO", 59999);
		map.put("Apple", 6520);
		map.put("POCO", 13999);
		map.put("Xiaomi", 19999);
		map.put("Redmi", 8900);
		map.put("Vivo", 14499);
		map.put("Micromax", 3201);
		map.put("Motorola Edge", 21249);
		map.put("Infinix Zero Ultra", 32249);
		map.put("Nokia", 5000);
		
		Set<Entry<String, Integer>> set= map.entrySet();
		set.forEach(e -> System.out.println(e.getKey().toUpperCase()+ " " +e.getValue()));
		
		set.stream().filter(e ->e.getValue()>10000).forEach(e -> System.out.println(e.getKey()+ " "+e.getValue()));
		
		set.stream().filter(e ->e.getKey().length()<5).forEach(e ->System.out.println(e.getKey()+ " "+e.getValue()));
		
		set.stream().sorted((a,b)->b.getKey().compareTo(a.getKey())).forEach(e-> System.out.println(e.getKey()+ " "+e.getValue()));
	}

}
