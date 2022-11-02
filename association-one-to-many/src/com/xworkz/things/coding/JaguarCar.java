package com.xworkz.things.coding;

public class JaguarCar {
	
public Car car;
	
	public void useCar(Car car) {
		
		System.out.println(car);
		System.out.println(car.noOfCompanny);
		System.out.println(car.noOfsecurity);
		System.out.println(car.ownerName);
		System.out.println(car.getCarName());
		car.setCarName("Jaguar");
		
		System.out.println("after modifying:"+car.getCarName());
		
		System.out.println(car.getCompanyName());
		car.setCompanyName("TATA Motors");
		
		System.out.println("after modifying:"+car.getCompanyName());
	}


}
