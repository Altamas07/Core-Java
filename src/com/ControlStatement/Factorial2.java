package com.ControlStatement;
import java.util.Scanner;
public class Factorial2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	int num=sc.nextInt();
	int res=1,i;
	for(i=1;i<=num;i++) {
		res=res*i;
	}
		System.out.println(res);
	}
}


