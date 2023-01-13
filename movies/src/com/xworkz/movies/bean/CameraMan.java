package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	
	@Autowired
	private Camera camera;

	public CameraMan() {
		super();
	}
	public void display() {
		System.out.println("Displays CameraMan...");
		System.out.println("CameraMan hash code is:"+ camera.hashCode());
	}

}
