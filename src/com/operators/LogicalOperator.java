package com.operators;

public class LogicalOperator {

	   public static void main(String[] args) {
		
		   int a=10;
		   
		   int b=16;
		   if(++a<10 && b>15) {
			   
			   System.out.println("hii");
			   ++a;
		   }
		   else {
			   
			   ++b;
			   System.out.println("helo");
			   System.out.println(b);
		   }
	}
}
