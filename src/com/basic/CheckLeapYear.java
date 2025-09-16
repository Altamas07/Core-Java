package com.basic;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year to check :");
		int year=sc.nextInt();
		if((year%400==0)||(year%4==0&&year%100!=0)) {
			System.out.println("The year you entered  is leapyear :");
		}
		else {
			System.out.println("not a leapyear");
		}
	}

}
