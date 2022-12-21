package com.xworkz.collection.boot;

import java.util.TreeSet;

public class BikeRunner {

	public static void main(String[] args) {

		String bike1="Pulsar";
		String bike2="KTM";
		String bike3="Yamaha";
		String bike4="Pashion";
		String bike5="Apachi";
		String bike6="TVS Ntorq";
		String bike7="Suzuki";
		String bike8="Royal Enfield";
		String bike9="Tvs jupitor";
		String bike10="Honda Dio";
		String bike11="Active Honda";
		String bike12="Hero Honda Splender Plus";
		String bike13="BMW";
		String bike14="Kawasaki Ninja";
		String bike15="Ninja ZX";
		String bike16="Bajaj Platina";
		String bike17="DIO";
		String bike18="Pulsar 220";
		
		
		TreeSet<String> collections = new TreeSet();
        
        collections.add(bike1); 
        collections.add(bike2); 
        collections.add(bike3);
        collections.add(bike4); 
        collections.add(bike5);
        collections.add(bike6); 
        collections.add(bike7);
        collections.add(bike8); 
        collections.add(bike9);
        collections.add(bike10); 
        collections.add(bike11);
        collections.add(bike12); 
        collections.add(bike13);
        collections.add(bike14); 
        collections.add(bike15);
        collections.add(bike16); 
        collections.add(bike17);
        collections.add(bike18); 
       
        System.out.println(collections.size());
		
        collections.clear();
		System.out.println("After clear..");
		
		System.out.println(collections.size());
                
	}

}
