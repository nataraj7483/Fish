package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

public class CouponRunner {

	public static void main(String[] args) {
	
		String coupon1 ="Marker Earn";
		String coupon2 ="Profit Cash";
		String coupon3 ="Voucher Redeem";
		String coupon4 ="Rate Surplus";
		String coupon5 ="Coupon Hive";
		String coupon6 ="Coupon Dad";
		String coupon7 ="Invoice Teller";
		String coupon8 ="Pensions savers";
		String coupon9 ="Afford Invest";
		String coupon10 ="Lottery Balance";
		String coupon11 ="Coupon Quest";
		String coupon12 ="Card Return";
		
		
		Collection<String> coupon = new LinkedList();
		
		coupon.add(coupon1);
		coupon.add(coupon2);
		coupon.add(coupon3);
		coupon.add(coupon4);
		coupon.add(coupon5);
		coupon.add(coupon6);
		coupon.add(coupon7);
		coupon.add(coupon8);
		coupon.add(coupon9);
		coupon.add(coupon10);
		coupon.add(coupon11);
		coupon.add(coupon12);
		
        System.out.println(coupon.size());
		
        coupon.clear();
		System.out.println("After clear....");
		
		System.out.println(coupon.size());	
		 

	}

}
