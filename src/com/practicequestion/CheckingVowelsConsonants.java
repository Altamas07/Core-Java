package com.practicequestion;

public class CheckingVowelsConsonants {
public static void main(String[] args) {
	  String str="hello brother";
	 str= str.toLowerCase();
	   
	  int vowel=0,consonant=0;
	  for(int i=0;i<str.length();i++) {
		  
		  char ch=str.charAt(i);
		  
		  
		  if(ch>='a'&&ch<='z') {
			  
			  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  ) {
				  
				  vowel++;
			  }
			  else {
				  
				  consonant++;
			  }
		  }
		
		  
	  }
	  System.out.println(" Vowel in string is :"+vowel); 
	  System.out.println("Consonant in string is"+consonant); 
	  
}
}
