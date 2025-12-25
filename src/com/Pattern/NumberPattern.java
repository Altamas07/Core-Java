package com.pattern;

public class NumberPattern {

	public static void main(String[] args) {
		
		int num=5;
		
	/*	for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=i;j++) {  // row 1=1 , row 2=1,2  
				
				System.out.print( j);
			}
			System.out.println();
		}
	*/
		
    /*    for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=i;j++) { // same row number printing row 1=1 ,row 2=2,2
				
				System.out.print( i);
			}
			System.out.println();
		}*/
		
for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print( j);
			}
			System.out.println();
		}
	}
}
