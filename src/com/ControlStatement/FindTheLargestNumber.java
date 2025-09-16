package com.ControlStatement;

public class FindTheLargestNumber {
	public static void main(String[] args) {
		int num1=45;
		int num=54;
		int num3=65;
		if(num1>num) {
			if(num1>num3) {
				System.out.println("The largest number among three is:" +num1);
			}
		}
		if(num>num1) {
			if(num>num3) {
				System.out.println("The largest number among three is:"+num);
			}
		}
		if(num3>num1) {
			if(num3>num) {
				System.out.println("The largest number among three is:"+num3);
			}
		}
	}

}
