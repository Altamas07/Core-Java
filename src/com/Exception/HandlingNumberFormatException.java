package com.exception;

public class HandlingNumberFormatException {

	public static void main(String[] args){
		
		try {
		int i=Integer.parseInt("ten");
		System.out.println(i);
		}
		catch (NumberFormatException e){
			
			System.out.println("Invalid type ");
		
	}
}
}