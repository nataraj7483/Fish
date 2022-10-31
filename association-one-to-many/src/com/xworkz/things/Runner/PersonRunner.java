package com.xworkz.things.Runner;

import com.xworkz.things.coding.Address;
import com.xworkz.things.coding.Company;
import com.xworkz.things.coding.Email;
import com.xworkz.things.coding.Job;
import com.xworkz.things.coding.Location;
import com.xworkz.things.coding.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		Location location=new Location();
		location.showOff();
		
		Address address=new Address();
		address.display();
		
		Company company=new Company();
		company.display();
		
		Job job =new Job();
		job.display();
		
		Email email=new Email(1,"raj.gmail.com",7483735868L);
		Email email2=new Email(2,"cha.gmail.com",7483735838L);
		Email email3=new Email(3,"ra87.gmail.com",7483735878L);
		Email email4=new Email(4,"raj67.gmail.com",7483735898L);
		
		Email[] emails= {email,email2,email3,email4};	
		
		Person person=new Person("NTRJ");
		
		person.setEmail(emails);
		person.showOff();
		
		
		
		
		
		

	}

}
