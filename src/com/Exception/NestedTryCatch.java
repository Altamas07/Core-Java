package com.Exception;

import java.util.Scanner;

public class NestedTryCatch {
	public static void main(String[] args) {
		int marks[]= {43,56,45,32,76,889,55,900};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your index to  find the array: ");
		int ind=sc.nextInt();
		System.out.println("Enter your number to divide the array:");
		int num=sc.nextInt();
		try {
			System.out.println("The index you entered at this point the available  array is :"+marks[ind]);
			try {
				System.out.println("the value of array/number is : " +marks[ind]/num);
				
			}
			catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero ");
			}
		}
		
		catch(IndexOutOfBoundsException e) {
				System.out.println("the array available at the index cannot found: " );
			}
		
		

		
	finally {
		System.out.println(" thanks ");
		
	}
}

}