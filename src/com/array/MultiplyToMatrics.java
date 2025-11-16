package com.array;

public class MultiplyToMatrics {
     public static void main(String[] args) {
		
    	   int[][] arr= {{23,43,54},{23,445,545} };
    	   
    	   int[][] ard= {{23,34,54},{33,22,34}};
    	   
    	   int[][] multiply=new int[2][3];
    	   
    	   
    	   for(int i=0;i<2;i++) {
    		   for(int j=0;j<3;j++) {
    			   
    			   multiply[i][j]=arr[i][j]*ard[i][j];
    			   
    			   System.out.print(multiply[i][j]+" ");
    		   }
    		   System.out.println();
    	   }
	}
}
