package com.xworkz.movies.boot;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountryRunner {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<String, String>();
		map.put("India", "NarendraModi");
		map.put("Bangladesh", "Sheikh Hasina");
		map.put("Antigua and Barbuda", "Gaston Browne");
		map.put("Namibia", "Saara Kuugongelwa");
		map.put("Canada", "Justin Trudeau");
		map.put("Mongolia", "Oyun-Erdene");
		map.put("Tanzania", "Kassim Majaliwa");
		map.put("Jamaic", "Andrew Holness");
		map.put("Russia", "Mishustin");
		map.put("Singapore", "Loong");
		map.put("Sri Lanka", "Gunawardena");
		map.put("Rwanda", "Edourd Ngirente");
		map.put("Thailand", "Chan-o-cha");
		map.put("Uganda", "Nabbanja");
		map.put("New Zealand", "Jacinda Ardern");
		map.put("Cameroon", "Joseph Ngute");
		map.put("Solomon Islands", "Manasseh Sogavare");
		map.put("Guyana", "Mark Phillips");
		
		map.keySet().stream().sorted((a1 , a2) -> a1.compareTo(a2)).forEach((e) -> System.out.println(e));
		map.entrySet().forEach(e -> System.out.println(e.getKey() +""+e.getValue()));
		
		List<String> list = map.values().stream().collect(Collectors.toList());
		list.stream().filter(e -> e.length() >=10).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		
		for(String string : list) {
			if(string.length()>10) {
				string.replaceAll("/s", "update");
			}
		}
		
	}

}
