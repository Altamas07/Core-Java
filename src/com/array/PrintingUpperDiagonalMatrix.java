package com.array;

public class PrintingUpperDiagonalMatrix {
       public static void main(String[] args) {
		
    	   int[][] arr= {{67,34,3},{34,45,34},{34,54,23}};
    	   
    	   int rows=arr.length;
    	   
    	   int cols=arr[0].length;
    	   
    	   if(rows!=cols) {
    		   
    		   System.out.println("Matrix should be square ");
    	   }
    	   else {
    		   System.out.println("Upper triangle matrix::");
    	   }
    	   
    	   for(int i=0;i<rows;i++) {
    		   
    		   for(int j=0;j<cols;j++) {
    			   
    			   if(i>j) {
    				   
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
