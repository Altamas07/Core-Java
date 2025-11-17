package com.practicequestionbasicstoadvance;

public class SearchingArrayin1dArray {
	
     public static void main(String[] args) {
		
    	 int[] arr= {54,543,32,64,23,23};
    	 
    	 boolean found=false;
    	 
    	 int key=64;
    	 
    	 for(int x:arr) {
    		 
    		 if(key==x) {
    			 
    			 found=true;
    			 
    			 break;
    		 }
    	 }
    	 
    	 if(found) {
    		 
    		 System.out.println("Element found :"+"The element is "+key);
    	 }
	}
}
