package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftWareCompanyNamesRunner {

	public static void main(String[] args) {

		String company1="Microsoft";
		String company2="Oracle";
		String company3="Ibm";
		String company4="Salesforce";
		String company5="Sap";
		String company6="Autodesk";
		String company7="Intuit";
		String company8="Splunk";
		String company9="VMware";
		String company10="Sage Solutions";
		String company11="Dell";
		String company12="Twilio";
		String company13="Adp";
		String company14="Atlassian";
		String company15="Citrix System";
		String company16="BMC Software";
		String company17="Symantec";
		String company18="Clockers software Development";
		String company19="Bridger data Solutions";
		String company20="Alfa Financial Software";
		
		Collection<String> company = new ArrayList<String>();
		
		company.add(company1);
		company.add(company2);
		company.add(company3);
		company.add(company4);
		company.add(company5);
		company.add(company6);
		company.add(company7);
		company.add(company8);
		company.add(company9);
		company.add(company10);
		company.add(company11);
		company.add(company12);
		company.add(company13);
		company.add(company14);
		company.add(company15);
		company.add(company16);
		company.add(company17);
		company.add(company18);
		company.add(company19);
		company.add(company20);
		
		System.out.println(company.size());
		
		for(String elements :company) {
			System.out.println(elements);
		}
		
		Iterator<String> itr =company.iterator();
		
		while(itr.hasNext()) {
			String elements =itr.next();
			System.out.println(elements);
		}
	}

}
