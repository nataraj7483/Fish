package com.xworkz.technicle;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		

		 String str="Remove white spaces";    
         
	        //Removes the white spaces using regex    
	        str = str.replaceAll("\\s+", "");    
	            
	        System.out.println("String after removing all the white spaces : " + str);    
	}

}
