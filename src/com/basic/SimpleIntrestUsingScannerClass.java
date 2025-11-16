package com.basic;
import java.util.Scanner;
public class SimpleIntrestUsingScannerClass {

	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter your principal amount    :");
	float p=sc.nextFloat();
	
	
	System.out.println("Enter your time  :");
	float t=sc.nextFloat();
	 
	
	System.out.println("Enter your rate of intrest   :");
	float r=sc.nextFloat();
	
	
      float sI=(p*t*r)/100;
      System.out.println(sI);
      sc.close();
}
}