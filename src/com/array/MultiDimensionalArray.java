package com.array;

public class MultiDimensionalArray {
     public static void main(String[] args) {
    	 
    	 // declaration of array
	 int[][] arr;
	 
	 
	
	 // initialization of 2d array 
	 
	 arr=new int[2][3];
	 arr[0]= new int[]{6,8,7};
	 arr[1]= new int[]{6,9,6};
	
	 for(int i=0;i<2;i++) {
		 
		 for(int j=0;j<3;j++) {
			 
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
	 System.out.println("\n");
	 // Declaration and initialization of 2d array in one line 
	 
	int [][]rr= {{45,65,76,89},{4,7,6,5},{5,7,4,3},{3,5,6,7}};
	
	 for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			
			System.out.print(rr[i][j]+" ");
	}
		
		 System.out.println();
 }

}
}
