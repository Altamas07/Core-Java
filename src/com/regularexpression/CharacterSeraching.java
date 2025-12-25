package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterSeraching {

	
	public static void main(String[] args) {
		
		//Pattern p= Pattern.compile("[abc]"); here it will check either a or b or c 
		//Pattern p= Pattern.compile("[^abc]");  here it will check except a b c 
		//Pattern p= Pattern.compile("[a-zA-Z0-9]");here it will check alpha numerical 
	//	Pattern p= Pattern.compile("[^a-zA-Z0-9]"); here it will check except alpha numerical
	//	Pattern p= Pattern.compile("[0-9]"); here it will check 0 to 9 
	Pattern p= Pattern.compile("[a-z]"); //here it will check a to z alphabet 
		
		
		
		Matcher m=p.matcher("a@#b9c0kz");
		
		while(m.find()) {
			
			System.out.println(m.start()+"...." + m.group());
		}
	}
}
