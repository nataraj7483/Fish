package com.xworkz.pizza.service;



import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService{

	private HelmetRepository helmetRepository;
	
	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository=helmetRepository;
	}
	      
	@Override
	public boolean ValidDateAndSave(HelmetDTO dto) {
		
		System.out.println("Running Validate and Save:"+ dto);
		String brand=dto.getBrand();
		HelmetType type=dto.getType();
		Double price=dto.getPrice();
		Color color=dto.getColor();
		boolean validBrand=false;
		boolean validColor=false;
		boolean validType=false;
		boolean validPrice=false;
		
		if(brand!=null && brand.length()>=4 && brand.length()<20) {
			System.out.println("Valid Helmet Brand:"+ brand);
			validBrand=true;
		}
		else {
			System.err.println("Invalid Helmet Brand:"+ brand);
		}
		if(color!=null) {
			System.out.println("Valid Helmet Color:"+ color);
			validColor=true;
		}
		else {
			System.err.println("Invalid Helmet Color:"+ color);
		}
		if(type!=null) {
			System.out.println("Valid Helmet Type:"+ type);
			validType=true;
		}
		else {
			System.err.println("Invalid Helmet Type:"+ type);
		}
		if(price!=null && price>=500 && price<20000) {
			System.out.println("Valid Helmet Price:"+ price);
			validPrice=true;
		}
		else {
			System.err.println("Invalid Helmet Price:"+ price);
		}
		if(validBrand && validType && validColor && validPrice) {
			System.out.println("HelmetDTO is valid, can save using repository");
			boolean saved=this.helmetRepository.save(dto);
			System.out.println("HelmetDTO is saved:"+ saved);
			return saved;
		}
		
		return false;
	}

}
