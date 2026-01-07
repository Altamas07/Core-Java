package com.enumm;

enum Beer{
	
	KF,KO,RC,FO
}
public class Enum {

	public static void main(String[] args) {
		
		
		Beer b1=Beer.FO;
		
		switch(b1) {
		
		case KF:
			
			System.out.println("kf brand ");
			break;
		case KO:
			
			System.out.println("KO brand");
			break;
		case RC:
			
			System.out.println("RC Brand");
			break;
		case FO:
			
			System.out.println("FO brand ");
			break;
		 default:
			 System.out.println("Not all are good ");
		}
	}


}
