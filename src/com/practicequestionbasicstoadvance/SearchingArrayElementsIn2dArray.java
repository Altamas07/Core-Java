package com.practicequestionbasicstoadvance;

public class SearchingArrayElementsIn2dArray {
      
	  public static void main(String[] args) {
		
		  int[][] arr= {{43,54,2,2,3,234},{43,54,23,6,54}};
		  
		  int key=87;
		  
		  boolean found=false;
		  
		  for(int i=0;i<arr.length;i++) {
			  
			  for(int j=0;j<arr[i].length;j++) {
				  
				  if(key==arr[i][j]) {
					  
					  found=true;
					  
					  break;
				  }
			  }
		  }
		  
		  if(found) {
			  
			  System.out.println("Element found :");
		  }
		  
		  else {
			  
			  System.out.println("Element Not found :");
		  }
	}
}
