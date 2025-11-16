package com.array;

public class SumOfMatrix {
     public static void main(String[] args) {
		
    	 int[][] arr= {{23,45,34},{34,56,45}};
    	 int[][] ard= {{65,87,67},{87,78,56}};
    	 
    	 int[][] sum=new int[2][3];
    	 
    	 for(int i=0;i<2;i++) {
    		 
    		 for(int j=0;j<3;j++) {
    			 
    			 sum[i][j]=arr[i][j]+ard[i][j];
    		 
    	  	 System.out.print(sum[i][j]+" ");
    	 }
    		 System.out.println();
    	 }
	}
}
