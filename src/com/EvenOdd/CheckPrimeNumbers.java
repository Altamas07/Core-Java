package com.EvenOdd;
import java.util.Scanner;
public class CheckPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		boolean prime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				 prime=false;
			}
						
		}
		if(prime) {
			System.out.println("This number is prime");
		}
		else {
			System.out.println("This number is not a prime number");
		}
	}

}
