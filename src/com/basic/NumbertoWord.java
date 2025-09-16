package com.basic;
import java.util.Scanner;
public class NumbertoWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number to convert into words:");
	int num=sc.nextInt();
	int rev = 0;
	while(num>0) {
		
		rev= rev *10+ num%10;
		num=num/10;
		
	}
	while(rev>0) {
		int digit=rev%10;
		switch(digit) {
		case 0:
			System.out.print("Zero");
			break;
		case 1:
			System.out.print("One");
			break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("Six");
				break;
			case 7:
				System.out.print("Seven");
				break;
			case 8:
				System.out.print("Eight");
				break;
			case 9:
				System.out.print("Nine");
				break;
		}
		rev=rev/10;
	}
}
}
