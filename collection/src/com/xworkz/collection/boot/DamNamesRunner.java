package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamNamesRunner {

	public static void main(String[] args) {

		String karnatakaDamName1="Vani Vilasa Sagara";
		String karnatakaDamName2="Almatti Dam";
		String karnatakaDamName3="Basava Sagara Dam";
		String karnatakaDamName4="Raja Lakshmangowda";
		String karnatakaDamName5="Renuka Sagar";
		String karnatakaDamName6="Upper Tunga";
		String karnatakaDamName7="Badra Dam";
		String karnatakaDamName8="Tungabadra Dam";
		String karnatakaDamName9="Hemavathi Reservoir";
		String karnatakaDamName10="Kabini Reservoir";
		String karnatakaDamName11="Harangi Reservoir";
		String karnatakaDamName12="KRS";
		String karnatakaDamName13="Linganamakki Dam";
		String karnatakaDamName14="Kadra Dam";
		String karnatakaDamName15="Shanti Sagara";
		String karnatakaDamName16="Kodasalli Dam";
		
		Collection<String> karnatakaDams =new ArrayList<String>();
		
		karnatakaDams.add(karnatakaDamName16);
		karnatakaDams.add(karnatakaDamName15);
		karnatakaDams.add(karnatakaDamName14);
		karnatakaDams.add(karnatakaDamName13);
		karnatakaDams.add(karnatakaDamName12);
		karnatakaDams.add(karnatakaDamName11);
		karnatakaDams.add(karnatakaDamName10);
		karnatakaDams.add(karnatakaDamName9);
		karnatakaDams.add(karnatakaDamName8);
		karnatakaDams.add(karnatakaDamName7);
		karnatakaDams.add(karnatakaDamName6);
		karnatakaDams.add(karnatakaDamName5);
		karnatakaDams.add(karnatakaDamName4);
		karnatakaDams.add(karnatakaDamName3);
		karnatakaDams.add(karnatakaDamName2);
		karnatakaDams.add(karnatakaDamName1);
		
		System.out.println("Size of dams in Karnataka:"+karnatakaDams.size());
		
		Collection<String> tnDams = new ArrayList<String>();
		
		tnDams.add("Mettur Dam");
		tnDams.add("Lower Bhavani");
		tnDams.add("Bhakra Nangal");
		tnDams.add("Aliyar Dam");
		tnDams.add("Amaravathi");
		tnDams.add("Anaikuttam");
		tnDams.add("Barur Dam");
		tnDams.add("Berijam Dam");
		tnDams.add("Aanaimaduvu Dam");
		tnDams.add("Adavinainarkovil Dam");
		tnDams.add("Andiappanur Odai");
		tnDams.add("Avalanche Dam");
		tnDams.add("Berijam Dam");
		tnDams.add("Bungihalla Bund");
		tnDams.add("Chittar 1 Dam");
		System.out.println("Size of dams in Tamilnadu:"+tnDams.size());
		
		Collection<String> keralaDams = new ArrayList<String>();
		
		keralaDams.add("Idukki Dam");
		keralaDams.add("Mallaperiyar");
		keralaDams.add("Parambikulam");
		keralaDams.add("Malampuzha");
		keralaDams.add("Neyyar");
		keralaDams.add("Cheruthoni");
		keralaDams.add("Walayar");
		keralaDams.add("Bakra Nangal");
		keralaDams.add("Banasura Sagar");
		keralaDams.add("Idamalayar Dam");
		keralaDams.add("Pothundi Dam");
		keralaDams.add("Mangalam Dam");
		keralaDams.add("Kakki Dam");
		keralaDams.add("Sardar Sarovar Dam");
		keralaDams.add("Kakkayam Dam");
		keralaDams.add("Mattupetty Dam");
		System.out.println("Size of dams in Kerala:"+keralaDams.size());

		
		Collection<String> apDams = new ArrayList<String>();
		
		apDams.add("Nagarjuna Sagar Dam");
		apDams.add("Srisailam Dam");
		apDams.add("Polavaram");
		apDams.add("Somasila Dam");
		apDams.add("Nallamalasagar Reservoir");
		apDams.add("Jalaput Dam");
		apDams.add("Gandikota Reservoir");
		apDams.add("Kalyani Dam");
		apDams.add("Bramhasagara");
		apDams.add("Velugodu");
		apDams.add("Vykuntapuram Barrage");
		apDams.add("Chitravathi Reservoir");
		apDams.add("Mylavaram");
		apDams.add("Rajgolibanda");
		apDams.add("sanjeevaiah Sagar");
		System.out.println("Size of dams in AndraPradesh:"+apDams.size());

		
		Collection<String> maharastraDams = new ArrayList<String>();
        
		maharastraDams.add("Bhivpuri Dam");
		maharastraDams.add("Dhom Dam");
		maharastraDams.add("Koyna Dam");
		maharastraDams.add("Panshet");
		maharastraDams.add("Talaipalli");
		maharastraDams.add("Walwan Dam");
		maharastraDams.add("Warna");
		maharastraDams.add("Dhupgarh");
		maharastraDams.add("Gargoti");
		maharastraDams.add("Nira Dam");
		System.out.println("Size of dams in Maharastra:"+maharastraDams.size());

		
		Collection<String> damsInGujarat = new ArrayList<String>();
		
		damsInGujarat.add("Sarda Sarovar");
		damsInGujarat.add("Dantiwada Dam");
		damsInGujarat.add("Ukai Dam");
		damsInGujarat.add("Dharoi");
		damsInGujarat.add("Kadana");
		damsInGujarat.add("Kamleshwar");
		damsInGujarat.add("Dholidhaja");
		damsInGujarat.add("Karai");
		System.out.println("Size of dams in Gujarat:"+damsInGujarat.size());

		
		Collection<String> damsInJharkhand = new ArrayList<String>();
      
		damsInJharkhand.add("Amanat");
		damsInJharkhand.add("Anjawan");
		damsInJharkhand.add("Anraj Dam");
		damsInJharkhand.add("Baranadi");
		damsInJharkhand.add("Barhi Dam");
		damsInJharkhand.add("Basuki Dam");
		damsInJharkhand.add("Batane");
		damsInJharkhand.add("Batre");
		damsInJharkhand.add("Bhairwa");
		damsInJharkhand.add("Bucha Opa Dam");
		System.out.println("Size of dams in Jharkhand:"+damsInJharkhand.size());


		Collection<String> damsInArunachal = new ArrayList<String>();
		
		damsInArunachal.add("Ranganadi Dam");
		damsInArunachal.add("Subansiri Lower HE");
		System.out.println("Size of dams in ArunaChalPradesh:"+damsInArunachal.size());

		
		Collection<String> damsInGoa = new ArrayList<String>();
         
		damsInGoa.add("Anjuman Dam");
		damsInGoa.add("MI Dam");
		damsInGoa.add("Salaulim Dam");
		System.out.println("Size of dams in Goa:"+damsInGoa.size());

		
		Collection<String> damsInBihar = new ArrayList<String>();
		
		damsInBihar.add("Anjan Dam");
		damsInBihar.add("Amrity Dam");
		damsInBihar.add("Badua Dam");
		damsInBihar.add("Barnar");
		damsInBihar.add("Baskund");
		damsInBihar.add("Belharana");
		damsInBihar.add("bilasi");
		damsInBihar.add("Chandan");
		damsInBihar.add("Durgawati");
		damsInBihar.add("Jalkund");
		System.out.println("Size of dams in Bihar:"+damsInBihar.size());

		
		Collection<String> damsInUttarPradesh = new ArrayList<String>();
		
		damsInUttarPradesh.add("Adwa Dam");
		damsInUttarPradesh.add("Afzalgarh");
		damsInUttarPradesh.add("Ahraura");
		damsInUttarPradesh.add("Arjun Dam");
		damsInUttarPradesh.add("Aunjwar");
		damsInUttarPradesh.add("Bachar");
		damsInUttarPradesh.add("Baghel Khand");
		damsInUttarPradesh.add("Baghla");
		damsInUttarPradesh.add("Balui Bandh");
		damsInUttarPradesh.add("Banjari Kalan");
		System.out.println("Size of dams in Uttar Pradesh:"+damsInUttarPradesh.size());


		Collection<String> damsInManipur = new ArrayList<String>();
		
		damsInManipur.add("Khoupum Dam");
		damsInManipur.add("Khuga Dam");
		damsInManipur.add("Singda Dam");
		damsInManipur.add("Thoubal Dam");
		System.out.println("Size of dams in Manipur :"+damsInManipur.size());

		
		Collection<String> damsInNagaland = new ArrayList<String>();
		
		damsInNagaland.add("Doyang Hep Dam");
		System.out.println("Size of dams in Nagaland :"+damsInNagaland.size());


		Collection<String> damsInMizoram = new ArrayList<String>();
		damsInMizoram.add("Mizoram Dam");
		damsInMizoram.add("Kolasib Dam");
		System.out.println("Size of dams in Mizoram :"+damsInMizoram.size());

		
		Collection<String> damsInTripura = new ArrayList<String>();
		damsInTripura.add("Gumti Hydro Dam");
		System.out.println("Size of dams in Tripura :"+damsInTripura.size());

		
		Collection<String> damsInAssam = new ArrayList<String>();
		damsInAssam.add("Pagladia");
		damsInAssam.add("Khandong");
		damsInAssam.add("Umrong");
		damsInAssam.add("Subansiri Lower Dam");
		damsInAssam.add("Karbi Langpi Dam");
		System.out.println("Size of dams in Assam :"+damsInAssam.size());

		
		Collection<String> damsInSikkim = new ArrayList<String>();
		damsInSikkim.add("Rangit Dam");
		damsInSikkim.add("Rangpo Dam");
		damsInSikkim.add("Rongli dam");
		damsInSikkim.add("Teesta-V(NHPC)");
		System.out.println("Size of dams in Sikkim :"+damsInSikkim.size());

		
		Collection<String> damsInMadhyapradesh = new ArrayList<String>();
		damsInMadhyapradesh.add("Adampura");
		damsInMadhyapradesh.add("Adner Dam");
		damsInMadhyapradesh.add("Agara Agari Dam");
		damsInMadhyapradesh.add("Agara Dam");
		damsInMadhyapradesh.add("Ahirkheda");
		damsInMadhyapradesh.add("Ahmadpur");
		damsInMadhyapradesh.add("akhajhiri");
		damsInMadhyapradesh.add("Akhetpur");
		damsInMadhyapradesh.add("Amadehi");
		damsInMadhyapradesh.add("Amarapur");
		System.out.println("Size of dams in MadhyaPradesh :"+damsInMadhyapradesh.size());

		
		Collection<String> damsInRajastan = new ArrayList<String>();
		damsInRajastan.add("Abhaypur");
		damsInRajastan.add("Aklera Sagar");
		damsInRajastan.add("Alnia");
		damsInRajastan.add("Amli Kheda");
		damsInRajastan.add("Angore");
		damsInRajastan.add("Anwasa");
		damsInRajastan.add("Arwar");
		damsInRajastan.add("Atawara");
		damsInRajastan.add("Babara Dam");
		damsInRajastan.add("Badgaon");
		System.out.println("Size of dams in Rajastan :"+damsInRajastan.size());

		
		Collection<String> damsInHaryana = new ArrayList<String>();
		damsInHaryana.add("Kaushalya");
		damsInHaryana.add("Ottu Barrage");
		damsInHaryana.add("Tajewala Barrage");
		damsInHaryana.add("Hathnikund Barrage");
		damsInHaryana.add("Anagpur");
		System.out.println("Size of dams in Haryana :"+damsInHaryana.size());

		
		Collection<String> damsInUttarkhand = new ArrayList<String>();
		damsInUttarkhand.add("Baigul Dam");
		damsInUttarkhand.add("Baur Dam");
		damsInUttarkhand.add("Bhimtal");
		damsInUttarkhand.add("Dhauliganga");
		damsInUttarkhand.add("Dhora");
		damsInUttarkhand.add("Haripura");
		damsInUttarkhand.add("Ichari");
		damsInUttarkhand.add("Jamrani");
		damsInUttarkhand.add("Koteshwar");
		damsInUttarkhand.add("Lakhwar");
		System.out.println("Size of dams in Uttarkhand :"+damsInUttarkhand.size());

		
		Collection<String> damsInWestBengal = new ArrayList<String>();
		damsInWestBengal.add("Bakreshwar");
		damsInWestBengal.add("Bandhu");
		damsInWestBengal.add("Bara Mandira");
		damsInWestBengal.add("Barabhum");
		damsInWestBengal.add("Dangrajhore");
		damsInWestBengal.add("Golamarajore");
		damsInWestBengal.add("Hanumata");
		damsInWestBengal.add("Hinglow Irrigation");
		damsInWestBengal.add("Kangsabati Kumari");
		damsInWestBengal.add("Kanjan");
		System.out.println("Size of dams in West Bengal :"+damsInWestBengal.size());

        
		Collection<String> damsInMeghalaya = new ArrayList<String>();
		damsInMeghalaya.add("Khandong");
		damsInMeghalaya.add("Kyrdemkulai");
		damsInMeghalaya.add("Mawphlang");
		damsInMeghalaya.add("Myntdu-Leshka");
		damsInMeghalaya.add("Nongkhyllem");
		damsInMeghalaya.add("Umiam");
		damsInMeghalaya.add("Umtru");
		System.out.println("Size of dams in Meghalaya :"+damsInMeghalaya.size());


		Collection<String> damsInChhattisgarh = new ArrayList<String>();
		damsInChhattisgarh.add("Tandula");
		damsInChhattisgarh.add("Dudhawa");
		damsInChhattisgarh.add("Gangrel");
		damsInChhattisgarh.add("Hasdeo Bango");
		damsInChhattisgarh.add("Kherkatta Reservoir");
		damsInChhattisgarh.add("Murrum Silli");
		damsInChhattisgarh.add("Sondur");
		System.out.println("Size of dams in Chhattisgarh :"+damsInChhattisgarh.size());

		
		Collection<String> damsInHimachalPradesh = new ArrayList<String>();
		damsInHimachalPradesh.add("Baira Siul");
		damsInHimachalPradesh.add("Bassi");
		damsInHimachalPradesh.add("Bhakra");
		damsInHimachalPradesh.add("Karchham Wangtoo");
		damsInHimachalPradesh.add("Kol Dam");
		damsInHimachalPradesh.add("Largi");
		damsInHimachalPradesh.add("Nathpa Jhakri");
		damsInHimachalPradesh.add("Pandoh");
		damsInHimachalPradesh.add("Pong");
		damsInHimachalPradesh.add("Sawra Kuddu");
		System.out.println("Size of dams in Himachal Pradesh :"+damsInHimachalPradesh.size());

		
		Collection<String> damsInOdisha = new ArrayList<String>();
		damsInOdisha.add("Alubani");
		damsInOdisha.add("Aradei");
		damsInOdisha.add("Arikul");
		damsInOdisha.add("Badabandha");
		damsInOdisha.add("Badjore");
		damsInOdisha.add("Baghalati");
		damsInOdisha.add("Baghjharan");
		damsInOdisha.add("Baghua");
		damsInOdisha.add("Balaskumpa");
		damsInOdisha.add("balimela");
		System.out.println("Size of dams in Odisha :"+damsInOdisha.size());

		
		Collection<String> damsInPunjab = new ArrayList<String>();
		damsInPunjab.add("Chohal");
		damsInPunjab.add("Damsal");
		damsInPunjab.add("Dholbaha");
		damsInPunjab.add("Jainti");
		damsInPunjab.add("Janauri");
		damsInPunjab.add("Maili");
		damsInPunjab.add("Mirzapur");
		damsInPunjab.add("Patiari");
		damsInPunjab.add("Perch");
		damsInPunjab.add("ranjit Sagar");
		System.out.println("Size of dams in Punjab :"+damsInPunjab.size());

		
		Collection<String> damsInJammuKashmir = new ArrayList<String>();

		damsInJammuKashmir.add("Baglihar");
		damsInJammuKashmir.add("Dulhasti");
		damsInJammuKashmir.add("Kishenganga");
		damsInJammuKashmir.add("Nimoo Bazgo");
		damsInJammuKashmir.add("Pakal Dul");
		System.out.println("Size of dams in Jammu And Kashmir :"+damsInJammuKashmir.size());
		
		Collection<String> damsInIndia = new ArrayList<String>();
		damsInIndia.addAll(damsInArunachal);
		damsInIndia.addAll(damsInChhattisgarh);
		damsInIndia.addAll(damsInArunachal);
		damsInIndia.addAll(damsInHimachalPradesh);
		damsInIndia.addAll(damsInJammuKashmir);
		damsInIndia.addAll(damsInPunjab);
		damsInIndia.addAll(damsInOdisha);
		damsInIndia.addAll(damsInMeghalaya);
		damsInIndia.addAll(damsInWestBengal);
		damsInIndia.addAll(damsInUttarkhand);
		damsInIndia.addAll(damsInHaryana);
		damsInIndia.addAll(damsInRajastan);
		damsInIndia.addAll(damsInMadhyapradesh);
		damsInIndia.addAll(damsInSikkim);
		damsInIndia.addAll(damsInAssam);
		damsInIndia.addAll(damsInTripura);
		damsInIndia.addAll(damsInMizoram);
		damsInIndia.addAll(damsInNagaland);
		damsInIndia.addAll(damsInManipur);
		damsInIndia.addAll(damsInUttarPradesh);
		damsInIndia.addAll(damsInBihar);
		damsInIndia.addAll(damsInGoa);
		damsInIndia.addAll(damsInJharkhand);
		damsInIndia.addAll(damsInGujarat);
		damsInIndia.addAll(maharastraDams);
		damsInIndia.addAll(tnDams);
		damsInIndia.addAll(apDams);
		damsInIndia.addAll(karnatakaDams);
		
		System.out.println("damsInIndia:"+ damsInIndia.size());
		
		for(String string :damsInIndia) {
			System.out.println("elements:"+string);
		}
		
		Iterator<String> itr1 = damsInIndia.iterator();
		while(itr1.hasNext()) {
			String element =itr1.next();
			if(element.startsWith("T")) {
				System.out.println("element ends with ra:"+element);
			}
		}
		Iterator<String> itr2 = damsInIndia.iterator();

		while(itr2.hasNext()) {
			String element=itr2.next();
			if(element.endsWith("ra")) {
				System.out.println("element ends with ra:"+element);
			}
		}
		Iterator<String> itr3 = damsInIndia.iterator();
        while(itr3.hasNext()) {
        	String element =itr3.next();
        	if(element.length()>15) {
        		System.out.println("elements with more than 15 characters:"+element);
        	}
        }
		Iterator<String> itr4 = damsInIndia.iterator();
        while(itr4.hasNext()) {
        	String element = itr4.next();
        	System.out.println(element.toUpperCase());
        }
		Iterator<String> itr5 = damsInIndia.iterator();
        while(itr5.hasNext()) {
        	String element = itr5.next();
        	System.out.println(element.toLowerCase());
        	
        	 if(element.contains("P")) {
          	   System.out.println("contain P is removes:"+element);
          	   itr5.remove();
             }
        }
        Iterator<String> itr6 = damsInIndia.iterator();
        
        while(itr6.hasNext())
        {
        	String string = itr6.next();
        	int index = 0;
        	
        	StringBuffer buffering = new StringBuffer(string);
        	buffering.reverse();
        	
        	String palindrom = buffering.toString();
        	if(string.equals(palindrom))
        	{
        		index++;
        		System.out.println("found palindrome:"+buffering);
        	}

        }
	}  

}
