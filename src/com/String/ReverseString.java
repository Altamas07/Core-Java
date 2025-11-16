package com.string;

public class ReverseString {
	
	
	public static void main(String[] args) {
		String string="Altmash khan ";
		
		for(int i=string.length()-1;i>=0;i--) {
			
		char ch=string.charAt(i);
		
		System.out.println(ch);
	}

}
}