package com.array;

import java.util.Scanner;

public class DeletionOfArray2 {
     public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int[] arr= {87,45,34,23,78,97,54};
		  System.out.println("Enter your index to delete the array :");
		  int posindex=sc.nextInt();
		  
		  int j=0;
		int[]  newArr= new int[arr.length-1];
		  for(int i=0;i<arr.length;i++) {
			  
			 
			  if(i==posindex) {
				  continue;
			  }
			  
			  newArr[j]=arr[i];
			  j++;
		  }
		  
		  for(int no:newArr) {
			  System.out.println(no);
		  }
		  sc.close();
		  
	}
}
