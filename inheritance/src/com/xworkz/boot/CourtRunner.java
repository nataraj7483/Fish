package com.xworkz.boot;

import com.xworkz.things.*;

public class CourtRunner {

	public static void main(String[] args) {
	
		SupremeCourt ref=new SupremeCourt();
		System.out.println(ref.name);
		System.out.println(ref.noOfStaff);
		System.out.println(ref.area);
		System.out.println(ref.location);
		
		
		Court court=new SupremeCourt();
		System.out.println(court.name);
		System.out.println(court.noOfStaff);
		SupremeCourt court2=(SupremeCourt)court;   
		System.out.println(court2.area);
		System.out.println(court2.location);
	
		
		
		Court court3=new HighCourt();
		System.out.println(court3.name);
		System.out.println(court3.noOfStaff);
		HighCourt court4=(HighCourt)court3;   
		System.out.println(court4.judgeName);
		System.out.println(court4.state);
		
		
		Court court5=new DistrictCourt();
		System.out.println(court5.name);
		System.out.println(court5.noOfStaff);
		DistrictCourt court6=(DistrictCourt)court5; 
		System.out.println(court6.totalCases);
		System.out.println(court6.advocateName);
		

		

	}

}
