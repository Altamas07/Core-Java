package com.practicequestionbasicstoadvance;

public class Practice {
	
	
	int  sum(int a) {
		
		System.out.println(a);
		
		return 0;
		
		
	} 
	int sum(Character c,int b) {  
		
		System.out.println(c+" "+b);
		
		return 0;
	}
    public static void main(String[] args) {
		
    	Practice practice=new Practice();
   	practice.sum(23);
    	
      	practice.sum('6', 65);
	}
}
