package com.practicequestionbasicstoadvance;

public class MainMethodOverloading {
	
	public static void main(String[] args) {  // here is no compile time and run time error because parameter is different 
		                                     // no  matter method name is same jvm will automatically call the string type
		                                    //argument method as standard main methodif there is any reference calling to 
		                                    // the next method so it would be called 
		System.out.println("String[]");
	}
	
	public static void main(int[] args) {
		
		System.out.println("int[]");
		
	}

}
