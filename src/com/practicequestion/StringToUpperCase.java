package com.practicequestion;

import java.util.Scanner;

public class StringToUpperCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your String to change it into UpperCase and LowerCase:");
	String str=sc.nextLine();
	
	
	System.out.println(str.toUpperCase() +" \n"+ (str.toLowerCase()));
	sc.close();
}
}
