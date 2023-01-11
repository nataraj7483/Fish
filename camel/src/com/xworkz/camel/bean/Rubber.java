package com.xworkz.camel.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	
	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberType")
	private String type;
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	@Autowired
	@Qualifier("size")
	private int size;
	@Autowired
	@Qualifier("rubberPrice")
	private double price;
	@Autowired
	@Qualifier("shape")
	private String shape;
	@Autowired
	@Qualifier("stolen")
	private boolean stolen;

	@Override
	public String toString() {
		return "Rubber [rubber=" + name + ", type=" + type + ", color=" + color + ", size=" + size + ", price=" + price
				+ ", shape=" + shape + ", stolen=" + stolen + "]";
	}

}
