package com.xworkz.technicle;

public class ChangeCases {

	public static void main(String[] args) {
		
		String string="Great Power";    
        StringBuffer newString=new StringBuffer(string);    
            
        for(int i = 0; i < string.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(string.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
            	newString.setCharAt(i, Character.toUpperCase(string.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(string.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
            	newString.setCharAt(i, Character.toLowerCase(string.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newString);    

	}

}
