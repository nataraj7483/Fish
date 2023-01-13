package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;

	public Camera() {
		System.out.println("Lens running...");
	}
	public void display() {
		System.out.println("Lens Displays..");
		System.out.println("Camera Lens hash code is:"+ lens.hashCode());
		System.out.println("Camera Battery hash code is:"+ battery.hashCode());
	}

	
}
