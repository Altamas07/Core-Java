package com.array;

import java.util.Scanner;

public class UpdationOfArray {
public static void main(String[] args) {
	int[] arr= {23,45,66,77,45,88,87,56};
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your index where you want to insert the element: ");
	 
	 int posindex=sc.nextInt();
	 System.out.println("Enter your element at which index you want to insert :");
	 int element=sc.nextInt();
	 arr[posindex]=element;
	 for(int no:arr) {
		 
		 System.out.println(no);
	 }
	 sc.close();
}
}
