package com.controlStatement;

public class SwitchCase {
         
	public static void main(String[] args) {
		
		int x=10;
		int y=76;
		
		switch(x+1) {
		
		case 10:
			
			System.out.println(10);
			break;
			
		case 111:
			
			System.out.println(12);
			
			break;
		case 10+20+30:
			
			System.out.println(60);
		    
		break;
		
		default :
			
			System.out.println("invalid ");
		}
	}
}
