package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiresInRegex {

	public static void main(String[] args) {
		
		//Pattern p=Pattern.compile("a");// here it will return single a where found 
		
		//Pattern p=Pattern.compile("a+");// here it will return more than single a where found 
		
		//Pattern p=Pattern.compile("a*");// here it will return any number of  a where found including zero 
		
		Pattern p=Pattern.compile("a?");// here it will return at most single  a where found including zero
		
		Matcher m=p.matcher("abaabaaab");
		
		while(m.find()) {
			
			System.out.println(m.start()+" .. "+m.group());
		}
	}
}
