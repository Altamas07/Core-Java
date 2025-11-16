package com.basic;
import java.util.Scanner;
public class NumberSwapping4 {
	public static void main(String[] args) {
	
   Scanner sc=new Scanner(System.in);
     System.out.println("Enter your first number");
     double num1=sc.nextDouble();
     System.out.println("Enter your second number");
     double num2=sc.nextDouble();
     System.out.println(num1+" "+num2);
     num1=num1+num2;
     num2=num1-num2;
     num1=num1-num2;
     System.out.println(num1+" "+num2);
     sc.close();
}
}
