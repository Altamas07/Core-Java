package com.array;

import java.util.Scanner;

public class InsertionOfArray2 {
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your element to insert at which index : ");
	 
	  int element=sc.nextInt();
	  int[] arr= {78,89,90,45,67,23,87};
	  int posindex=3;
	  int[] newArr= new int[arr.length+1];
	  for(int i=0;i<posindex;i++) {
		  
		  newArr[i]=arr[i];
	  }
	  newArr[posindex]=element;
	  
	  for(int i=posindex;i<arr.length;i++) {
		  
		  newArr[i+1]=arr[i];
	  }
	  for(int no:newArr) {
		  
		  System.out.println(no);
	  }
	  sc.close();
}
}
