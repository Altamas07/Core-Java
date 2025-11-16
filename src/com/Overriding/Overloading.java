package com.overriding;
     class Sum{
    	 int add(int a , int b) {
    		 return a+b;
    		 
    	 }
    	 int add(int a ,int b , int c ) {
    		 return a+b+c;
    	 }
    	 int add(int a , int b , int c , int d ) {
    		 return a+b+c+d;
    	 }
     }
public class Overloading {
	public static void main(String[] args) {
		Sum sum= new Sum();
		System.out.println(sum.add(10, 20));
		System.out.println(sum.add(10, 20, 30));
		System.out.println(sum.add(10, 20, 30, 40));
	}

}
