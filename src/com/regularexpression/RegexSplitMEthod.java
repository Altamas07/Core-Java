package com.regularexpression;


import java.util.regex.Pattern;

public class RegexSplitMEthod {
 public static void main(String[] args) {
	
	
	//  Pattern p=Pattern.compile("\s");
	// String[] s=p.split("Java Programming Language ");
	 
	 Pattern p=Pattern.compile("\\."); // if here i don't take \\ then we will not get any output or [.] 
	 // is good we will get the output 
	 
	 String[] s=p.split("www.java.com");
	 
	 for(String s1:s) {
		 
		 System.out.println(s1);
	 }
	 
	 
}
}
