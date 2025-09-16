package com.basic;

import java.util.Scanner;

public class CalculateThePerimeter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your length:");
		int l=sc.nextInt();
		System.out.println("Enter your breadth :");
		int b=sc.nextInt();
		int area=2*(l+b);
		System.out.println(area);
	}

}
