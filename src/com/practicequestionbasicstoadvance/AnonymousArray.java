package com.practicequestionbasicstoadvance;

public class AnonymousArray {

	
	  static void sum(int[] x) {
		  
		  int total=0;
		  
		  for(int x1:x){  
			  
			  total=x1+total;
		  }
		  System.out.println(total);
	  }
	  
	  public static void main(String[] args) {
		
		  sum(new int[] {76,45,33});
		  
	}
}
