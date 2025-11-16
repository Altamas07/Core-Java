package com.practicequestion;

import java.util.Scanner;

public class FindingWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your string to find words: ");
	String str=sc.nextLine();
	String[] string=str.trim().split("\\s+");
	int count =string.length;
	System.out.println(count);
	sc.close();
}
}