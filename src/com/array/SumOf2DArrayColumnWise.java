package com.array;

public class SumOf2DArrayColumnWise {
public static void main(String[] args) {
	  int[][] arr= {{23,4,54,23},{34,23,56,23},{34,56,76,34},{56,45,344,56}};
	  
	  
	  int row=arr.length;
	  
	  int column=arr[0].length;
	  
	  
	  for(int j=0;j<column;j++) {
		  
		  int sum=0;
		  for(int i=0;i<row;i++) {
			  
			  
			  sum+=arr[j][i];
		  }
		  
		  System.out.println("Column: "+(j+1)+"  Sum is  "+sum);
	  }
	  
}
}
