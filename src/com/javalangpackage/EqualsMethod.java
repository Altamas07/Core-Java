package com.javalangpackage;

// .equals method of object class is used to check reference 
// in some class of object class it is already overridden where it will check content  
public class EqualsMethod {

	public static void main(String[] args) {
		
		String s="Durga";
		String s1="Durga";
		
		System.out.println(s.equals(s1)); // here by default overridden we will get content checking 
		
		
		StringBuffer sb=new StringBuffer("durga");
		StringBuffer sb1=new StringBuffer("durga");
		
		System.out.println(sb.equals(sb1));// here .equals is not overridden it will check refernce 
		
	}
}
