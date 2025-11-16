package com.array;

public class SubtractToMatrices {
   public static void main(String[] args) {
	  
	   
	   int[][] arr= {{23,44,32},{43,56,43}};
	   int[][] ard= {{23,54,67},{43,45,32}};
	   
	   int[][] subtract=new int[2][3];
	   
	   for(int i=0;i<2;i++) {
		   
		   for(int j=0;j<3;j++) {
			   
			   subtract[i][j]=arr[i][j]-ard[i][j];
			   
			   System.out.print(subtract[i][j]+" ");
		   }
		   System.out.println();
	   }
}
}
