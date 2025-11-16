package com.string;

public class SwappingTwoString {
	  public static void main(String[] args) {
		String a="Altamash ";
		String b="Saad";
		System.out.println("before swapping :"+ a);

          System.out.println("before swapping :"+b);
          
          a=a+b;
          
          b=a.substring(0,a.length()-b.length());
          
          a=a.substring(b.length());
          
          System.out.println("After swapping:" +a);
		System.out.println("After Swapping:"+b);
}
}