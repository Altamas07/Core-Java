package com.array;

import java.util.Scanner;

public class SearchingOfArray2 {
public static void main(String[] args) {
	  
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your element to check : ");
	int num=sc.nextInt();
	int[] arr= {12,34,65,76,79,39,60,45};
	
	
	boolean found=false;
	for(int i=0;i<arr.length;i++) {
		
		if(num==arr[i]) {
			
			found=true;
			System.out.println("Element found at index :"+i);
		}
	}
	if(found==false) {
		
		System.out.println("Element not found at any index :");
	}
	System.out.println("\n"+"Thanks for using this program :");
	sc.close();
}
}
