package com.basic;

import java.util.Scanner;

public class AverageUsingScanner {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your first number :");
	double num1=sc.nextDouble();
	System.out.println("Enter your second number :");
	double num2=sc.nextDouble();
	System.out.println("Enter your third number :");
	double num3=sc.nextDouble();
	   
	double average=(num1+num2+num3)/3;
	System.out.println(average);
	sc.close();
}
}
