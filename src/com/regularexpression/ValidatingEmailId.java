package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingEmailId {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your email to validate ::");
		
		String email=sc.nextLine();
		
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		
		Matcher m=p.matcher(email);
		
		if(m.matches()) {
			
			System.out.println("Valid email id ");
			
		}
		
		else {
			System.out.println("Inavlid email id ");
		}
	}
}
