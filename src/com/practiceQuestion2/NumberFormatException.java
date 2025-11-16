package com.practiceQuestion2;

public class NumberFormatException {
     public static void main(String[] args) {
		
    	 String str="123sdfg";
    	 
    	 try {
    		 
    		 int num=Integer.parseInt(str);
    		 System.out.println("converted "+num);
    		 
    	 }
    	 
    	 catch (Exception e) {
			System.out.println("error cannot convert from string " + str + " to int");
    		 System.out.println(e.getMessage());
		}
	}
}
