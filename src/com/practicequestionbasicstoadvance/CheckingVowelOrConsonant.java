package com.practicequestionbasicstoadvance;

public class CheckingVowelOrConsonant {
       public static void main(String[] args) {
		
    	   String a="qwertttyuiop";
    	   
    	   int consonant=0;
    	   int vowel=0;
    	   for(int i=0;i<a.length();i++) {
    		   
    		   char ch=a.charAt(i);
    		   
    	   
    	   if(ch>'a'||ch>'z') {
    		   
    		 if  (ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
    			   
    			 vowel++;
    		   }
    		 else {
    			 
    			  consonant++;
    			
    		 }
    		   
    		 
    	   }
    	   
	}
    	   System.out.println(consonant);
    		 System.out.println(vowel);
}
}