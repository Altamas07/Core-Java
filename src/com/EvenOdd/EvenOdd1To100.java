package com.evenOdd;

public class EvenOdd1To100 {
	public static void main(String[] args) {
		System.out.println("Even numbers between 1to100");
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(" "+i); 
				
			}
		}
		System.out.println("\n\n Odd numbers between 1to100");
		for(int i=1; i<=100;i++) {
	if(i%2!=0) {
		System.out.print(" "+i);
	}
		}
	}
}