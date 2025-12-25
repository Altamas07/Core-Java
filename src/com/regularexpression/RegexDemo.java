package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		int count=0;
		
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbabababaa");
		
		while(m.find()) {
			
			count++;
			System.out.println(m.start());
		}
		System.out.println("The total occurence of pattern is ::" + count );
	}
}
