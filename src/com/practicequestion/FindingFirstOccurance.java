package com.practicequestion;

import java.util.Scanner;

public class FindingFirstOccurance {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your string to find first occurance:");
	String str=sc.nextLine();
	  for(int i=0;i<str.length();i++) {
		  char ch=str.charAt(i);
		  if(str.indexOf(ch)==str.lastIndexOf(ch)) {
			  
			  System.out.println(ch);
			  break;
		  }
	  }
	  
	
			
			sc.close();
}
}
