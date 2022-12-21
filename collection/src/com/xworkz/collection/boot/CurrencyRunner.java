package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

public class CurrencyRunner {

	public static void main(String[] args) {
		
		String currency1 ="Afghani";
		String currency2 = "Lek";
		String currency3 = "Dinar";
		String currency4 = "Peso";
		String currency5 = "Dollar";
		String currency6 ="Euro";
		String currency7 = "Real";
		String currency8 = "Ringgit";
		String currency9 = "Leva";
		String currency10 = "New Riel";
		String currency11 = "Canada Dollar";
		String currency12 = "Yuan Renminbi";
		String currency13 = "Peso";
		String currency14 = "Franc";
		String currency15 = "Kuna";
		String currency16 = "Cyprus Euro";
		String currency17 = "Koruna";
		String currency18 = "Krone";
		String currency19 = "Pound";
		String currency20 = "Kroon";
		String currency21 = "Birr";
		String currency22 = "Fiji Dollar";
		String currency23 = "Finland Euro";
		String currency24 = "France Euro";
		String currency25 = "Mangolian Tughrik";
		String currency26 = "Uzbekistani Som";
		
		 Collection<String> currency = new LinkedList();	
		 
		 currency.add(currency1);
		 currency.add(currency2);
		 currency.add(currency3);
		 currency.add(currency4);
		 currency.add(currency5);
		 currency.add(currency6);
		 currency.add(currency7);
		 currency.add(currency8);
		 currency.add(currency9);
		 currency.add(currency10);
		 currency.add(currency11);
		 currency.add(currency12);
		 currency.add(currency13);
		 currency.add(currency14);
		 currency.add(currency15);
		 currency.add(currency16);
		 currency.add(currency17);
		 currency.add(currency18);
		 currency.add(currency19);
		 currency.add(currency20);
		 currency.add(currency21);
		 currency.add(currency22);
		 currency.add(currency23);
		 currency.add(currency24);
		 currency.add(currency25);

		 
		 System.out.println(currency.size());
			
		 currency.clear();
		 System.out.println("After clear..");
			
		System.out.println(currency.size());


	}

}
