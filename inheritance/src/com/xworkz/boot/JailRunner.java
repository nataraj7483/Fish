package com.xworkz.boot;

import com.xworkz.things.*;

public class JailRunner {

	public static void main(String[] args) {
		
		Jail jail=new Jail();
		System.out.println(jail.location);
		System.out.println(jail.name);
		CentralJail centraljail=(CentralJail)jail;
		System.out.println(centraljail.jailerName);
		System.out.println(centraljail.address);
		
		Jail jail2=new SubJail();
		System.out.println(jail2.location);
		System.out.println(jail2.name);
		SubJail jail3=(SubJail)jail2;
		System.out.println(jail3.totalSubJails);
		System.out.println(jail3.location);
		
		Jail jail4=new BellaryJail();
		System.out.println(jail4.location);
		System.out.println(jail4.name);
		BellaryJail jail5=(BellaryJail)jail4;
		System.out.println(jail5.jailCode);
		System.out.println(jail5.kaidiNo);

	}

}
