package com.practicequestionbasicstoadvance;

public class FindingLargestElementIn2dArray {
          public static void main(String[] args) {
			
        	  
        	  int[][] arr= {{76,7,654,34},{543,34,245,354}};
        	  
        	  int max=arr[0][0];
        	  
        	  for(int i=0;i<arr.length;i++) {
        		  
        		  for(int j=0;j<arr[i].length;j++) {
        			  
        			  if(arr[0][0]<arr[i][j]) {
        				  
        				  arr[0][0]=arr[i][j];
        				  
        				  max=arr[0][0];
        			  }
        		  }
        	  }
        	  System.out.println(max);
        	  
		}
}
