package com.practiceQuestion2;

public class ConsonantVowelCounting {
        public static void main(String[] args) {
			
        	String str="lkjhgfdsaqwertyuioplmnbvcxdt";
        	
        	int vowel=0,consonant=0;
        	for(int i=0;i<str.length();i++) {
        		
        		char ch=str.charAt(i);
        		if(ch>='a'&&ch<='z') {
        			
        			if(ch=='a'||ch=='e'||ch=='e'||ch=='o'||ch=='u') {
        				
        				vowel++;
        			}
        			
        			else {
        				
        				consonant++;
        			}
        		}
        		
        	
        	}
        	System.out.println("Available vowel in the string is ::"+vowel);
    		System.out.println("Available consonant in the string is ::"+consonant);
    		
		}
}
