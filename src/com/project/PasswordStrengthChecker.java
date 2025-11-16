package com.project;

	import java.util.Scanner;

	public class PasswordStrengthChecker {
	public static void main(String[] args) {
		   
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your password to check strength:");
		String str=sc.next();
		boolean hasLetter=false;
		boolean hasDigit=false;
		boolean hasSpecialChar=false;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isLetter(ch)) {
				
				hasLetter=true;
			}
				else if(Character.isDigit(ch)){
				hasDigit=true;
				
				}
				else {
					hasSpecialChar=true;
				}
			
		}
		
		if(str.length()<6) {
			
			System.out.println("weak password");
		}
		else if(hasDigit && hasLetter && str.length() >=8 && hasSpecialChar){
			
			System.out.println("strong password:");
			
		}
		else {
			System.out.println("medium password:");
		}
		sc.close();
	}
	}


