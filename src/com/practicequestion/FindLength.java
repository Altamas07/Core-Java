package com.practicequestion;

import java.util.Scanner;

public class FindLength {
public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter your String :");
	  
	  String str=sc.nextLine();
	  char[] chars=str.toCharArray();
	  int count =0;
	  for(char ch:chars) {
		  count++;
		
		  System.out.println(ch);
	  }
	  System.out.println(count);

	  
	  sc.close();
	  }


}
