package com.controlStatement;
import java.util.Scanner;
public class RverseNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in );
		System.out.println("Enter your number");
		int num=sc.nextInt();
		int sum=0;
		int r;
		
		while(num>0) {
			r=(num%10);
			sum=(sum*10)+r;
			num=num/10;
		}
		
		System.out.println(sum);
		sc.close();
	}

}
