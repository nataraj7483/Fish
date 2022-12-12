package com.xworkz.exception.type;

import com.xworkz.exception.rules.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule {
	
	public JavaTrainee(String name,int age,String location,long mobileNo,String state) {
		super(name,age,location,mobileNo,state);
	}
	
	@Override
	public boolean upLoadedTask() {
		System.out.println("Task Uploaded");
		return true;
	}
	
	@Override
	public boolean completedProgram() {
		System.out.println("Completed Program");
		return false;
	}
	
	public void training() {
		System.out.println("running java training");
	}
	
	public void executeProgram() {
		System.out.println("running execute program mehod");
	}

}
