package com.string;

import java.util.Scanner;

public class  StringAllMethod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your String to check all method :");
	String str=sc.nextLine();
	System.out.println("Enter your second String to check all method :");
	String str1=sc.nextLine();
	  String str2=new String("Altamash khan");
	  String str3=new String("Altamash Khan");
	  System.out.println(str==str1);
	  System.out.println(str==str2);
	  System.out.println(str2.equals(str3));
	  System.out.println(str2.equals(str1));
	  System.out.println(str2.equalsIgnoreCase(str3));
	  System.out.println(str.toLowerCase());
	  System.out.println(str.toUpperCase());
	  System.out.println(str2.substring(0, 8));
	  System.out.println(str.length());
      System.out.println(str2.length());
      System.out.println(str.contains("a"));
      System.out.println(str2.startsWith("A"));
      System.out.println(str.indexOf("K"));
      System.out.println(str.lastIndexOf("A"));
      System.out.println(str.trim());
     System.out.println(str.replace("khan", "Khan"));
  
      sc.close();
	}
}
