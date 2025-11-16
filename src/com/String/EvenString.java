package com.string;

public class EvenString {
public static void main(String[] args) {
	  String str="He is a good boy";
	  
	  String[] ch=str.split(" ");
	  
	  
	  for(String a:ch) {
		  
		  if(a.length()%2==0) {
			  
			  System.out.println(a);
			  
			  
		  }
	  }
} 

}
