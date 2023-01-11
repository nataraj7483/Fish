package com.xworkz.camel.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.camel.bean.HardwareShop;
import com.xworkz.camel.bean.Pencil;
import com.xworkz.camel.bean.Rubber;
import com.xworkz.camel.bean.Software;
import com.xworkz.camel.bean.SoftwareEngineer;

@Configuration
@ComponentScan("com.xworkz.camel")
public class HardwareConfiguration {
	
	@Bean
	public HardwareShop hardware()
	{
		HardwareShop ref=new HardwareShop();
		return ref;
	}
	@Bean
	public int id() {
		return 4;
	}
	@Bean
	public String name() {

		return "Thiru Hardware";
	}
	@Bean
	public String ownerName() {

		return "Thiru";
	}
	@Bean
	public String gstNo() {

		return "23nj23344243";
	}
	@Bean
	public String address() {

		return "Hosadurga";
	}
	
	@Bean
	public SoftwareEngineer engineer()
	{
		SoftwareEngineer ref=new SoftwareEngineer();
		
		return ref;
	}
	
	@Bean
	public String softwareName() {

		return "Microsoft";
	}
	@Bean
	public double version() {

		return 2.0;
	}
	@Bean
	public String developer() {

		return "Nataraj";
	}
	@Bean
	public LocalDate date() {

		return LocalDate.of(2023, 01, 12);
	}
	@Bean
	public boolean free() {

		return true;
	}
	@Bean
	public Software software()
	{
		Software ref=new Software();
		
		return ref;
	}
	@Bean
	public String engineerName() {

		return "Raj";
	}
	@Bean
	public int Salary() {

		return 20000;
	}
	@Bean
	public String companyName() {

		return "InfoTech";
	}
	@Bean
	public double experience() {

		return 0;
	}
	
	@Bean
	public Pencil pencil()
	{
		Pencil ref=new Pencil();
		
		return ref;
	}
	@Bean
	public String pencilName() {

		return "NTRJ";
	}
	@Bean
	public String pencilType() {

		return "Wood-pencil";
	}
	@Bean
	public double price() {

		return 16.0;
	}
	@Bean
	public String colour() {

		return "black";
	}
	@Bean
	public boolean sharp() {

		return true;
	}
	@Bean
	public boolean stolen() {

		return false;
	}
	@Bean
	public Rubber rubber()
	{
		Rubber ref=new Rubber();
		
		return ref;
	}
	
	@Bean
	public String rubberName() {

		return "NTRJ";
	}
	@Bean
	public String rubberType() {

		return "Vinyl eraser";
	}
	@Bean
	public double rubberPrice() {

		return 10.0;
	}
	@Bean
	public String rubberColor() {

		return "Red";
	}
	
	
	@Bean
	public String shape() {

		return "Round";
	}
	@Bean
	public boolean rubberStolen() {

		return true;
	}
	@Bean
	public char size() {

		return 'S';
	}

	

}
