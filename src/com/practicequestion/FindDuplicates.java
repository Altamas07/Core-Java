package com.practicequestion;

import java.util.Scanner;

public class FindDuplicates {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your string to remove duplicates:");
	 String str=sc.nextLine();
	 
	 for(int i=0;i<str.length();i++) {
		 char ch=str.charAt(i);
		 if(str.indexOf(ch,i+1)!=-1) {
			 if(str.indexOf(ch)==i) {
				 System.out.println(ch);
			 }
		 }
	 }
	 sc.close();
}
}
