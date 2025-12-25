package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingMobilenumber {

	public static void main(String[] args) {
		
		String mobile="7307005920";
		
		Pattern p=Pattern.compile("(\\+91|0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(mobile);
		
		if(m.matches()) {
			
			System.out.println(mobile + " is a valid number ");
		}
		
		else {
			
			System.out.println("Not a valid number ");
		}
	}
}
