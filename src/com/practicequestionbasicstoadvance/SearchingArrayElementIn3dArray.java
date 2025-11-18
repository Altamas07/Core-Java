package com.practicequestionbasicstoadvance;

public class SearchingArrayElementIn3dArray {
	
    public static void main(String[] args) {
		
    	 int[][][] arr= {{{98,78,56,8},{56,9,45,56},{45,78,23,89},{45,987,98,34}}};
    	 
    	 int key=56;
    	 
    	 
    	 boolean found=false;
    	 
    	 
    	 for(int i=0;i<arr.length;i++) {
    		 
    		 for(int j=0;j<arr[i].length;j++) {
    			 
    			 for(int k=0;k<arr[i][j].length;k++) {
    				 
    				 
    				 if(key==arr[i][j][k]) {
    					 
    					 found = true ;
    					 
    					 break;
    					 
    				 }
    			 }
    		 }
    	 }
    	 
    	 if (found) {
    		 
    		 System.out.println("Element found ::");
    	 }
    	 
    	 else {
    		 
    		 System.out.println("Element not found ::");
    	 }
	}
}
