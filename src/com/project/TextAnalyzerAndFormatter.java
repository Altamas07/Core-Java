package com.project;



import java.util.Scanner;




public class TextAnalyzerAndFormatter {
public static void main(String[] args) {
	// to take user input .
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string :");
	String str=sc.nextLine();
	// how many words are there in the given string.
	String[] string = str.trim().split("\\s+");
	int count=string.length;
	int charcount=0,vowel=0,consonant=0;
	
	// checking character and vowels and consonants in a string. 
	String lower=str.toLowerCase();
for(int i=0;i<lower.length();i++){
	char ch=lower.charAt(i);
	if(Character.isLetter(ch)) {
		charcount++;
		if("aeiou".indexOf(ch)!=-1) {
			vowel++;
		}
		else {
			consonant++;
		}
	}
}
	StringBuilder sb=new StringBuilder(str);  //reversed string.
	String reversed =sb.reverse().toString();
	  StringBuffer unique=new StringBuffer();
	for(int j=0;j<str.length();j++) {
		
		char c=str.charAt(j);
		
		if(unique.indexOf(String.valueOf(c))==-1){  //get unique characters.
			unique.append(c);
			
		}
	}
	
	System.out.println(vowel);
	System.out.println(consonant);
	System.out.println(charcount);
	System.out.println(count);
	System.out.println(reversed);
	System.out.println(unique.toString());
	sc.close();
}
	



}
