package com.xworkz.things.Runner;

import com.xworkz.things.coding.Car;
import com.xworkz.things.coding.JaguarCar;


public class JaguarCarRunner {

	public static void main(String[] args) {
	
		JaguarCar jaguarCar=new JaguarCar();
		Car car=new Car(2,10,"Jaguar Land Rover","Rani",5,40,897890876L,150,50);

		jaguarCar.useCar(car);
		
		car.showOff();


	}

}
