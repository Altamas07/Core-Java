package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharacterClasses {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("\\s");//here this predefined class will check space 
	//	Pattern p=Pattern.compile("\\S"); here it will check except space characters 
	//	Pattern p=Pattern.compile("\\w"); here it will check all words like alpha numerical
	//	Pattern p=Pattern.compile("\\W"); here it will check except words 
	//	Pattern p=Pattern.compile("\\d"); here it will check all digit 0-9
	//	Pattern p=Pattern.compile("\\D"); here it will check except digits 
	//	Pattern p=Pattern.compile(".");   here it will check all characters 
		
		
		
		Matcher m=p.matcher("ab 7#@9kz");
		
		while(m.find()) {
			
			System.out.println(m.start()+"..."+m.group());
		}
	}
}
