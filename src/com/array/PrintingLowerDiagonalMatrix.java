package com.array;

public class PrintingLowerDiagonalMatrix {
      public static void main(String[] args) {
		
    	  int[][] arr= {{12,34,23},{23,64,65},{65,76,76}};
    	  
    	  
    	  int rows=arr.length;
    	  int cols=arr[0].length;
    	  
    	  for(int i=0;i<rows;i++) {
    		  
    		  for(int j=0;j<cols;j++) {
    			  
    			  if(i<j) {
    				  
    				  System.out.print(0+" ");
    			  }
    			  else {
    				  
    				  System.out.print(arr[i][j]+" ");
    			  }
    			  
    	}
    		  System.out.println();
    	  }
    	  
	}
}
