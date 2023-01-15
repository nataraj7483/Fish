package com.xworkz.movies.boot;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CricketRunner {

	public static void main(String[] args) {

		Map<String , Integer> map=new HashMap<String, Integer>();
		map.put("KC Sangakara", 28016);
		map.put("Sachin Tendulkkar", 34357);
		map.put("Virat Kohli", 24715);
		map.put("Gowtham Gambhir", 9999);
		map.put("Bairstow", 6789);
		Set<Entry<String, Integer>> set= map.entrySet();
		set.stream().filter(e->e.getValue()<10000).forEach(e->System.out.println(e.getKey()+"  "+e.getValue()));;

	}

}
