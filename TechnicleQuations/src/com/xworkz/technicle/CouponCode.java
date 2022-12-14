package com.xworkz.technicle;

import java.util.Scanner;

public class CouponCode {

	public static void main(String[] args) {
	 
		    
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter Coupon Code : ");
		        String couponCode = scan.next();

		        if(couponCode.length() == 9)
		        {
		            System.out.println("Coupon Code is Valid");
		        }
		        else
		        {
		            System.out.println("Coupon Code is Invalid");
		        }
		    }
		

	}

}
