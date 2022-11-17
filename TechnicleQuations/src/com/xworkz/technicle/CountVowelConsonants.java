package com.xworkz.technicle;

public class CountVowelConsonants {

	public static void main(String[] args) {
	
       
		 //Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;    
            
        //Declare a string    
        String string = "This is a really simple sentence";    
            
        //Converting entire string to lower case to reduce the comparisons    
        string = string.toLowerCase();    
            
        for(int i = 0; i < string.length(); i++) {    
            //Checks whether a character is a vowel    
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(string.charAt(i) >= 'a' && string.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
    }    
	

}
