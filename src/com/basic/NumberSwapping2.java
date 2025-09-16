package com.basic;

public class NumberSwapping2 {
public static void main(String[] args) {
	int a=27;
	int b=34;
	int temp=a+b;
	a=temp-a;
	b=temp-b;
	System.out.println(a+" "+b);
}
}
