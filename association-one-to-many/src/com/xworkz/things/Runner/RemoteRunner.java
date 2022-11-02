package com.xworkz.things.Runner;

import com.xworkz.things.coding.Remote;
import com.xworkz.things.coding.Tv;

public class RemoteRunner {

	public static void main(String[] args) {
		
		Remote remote = new Remote();
		Tv tv = new Tv(34, "samsung", 50.9, 30.9, "ravi", "india", 20, 50, "black", true, true, "Remote");
		
		remote.useTv(tv);

		tv.showOff();

	}

}
