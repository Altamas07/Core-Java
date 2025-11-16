package com.practiceQuestion2;

public class FindingDuplicatesInArray {
     public static void main(String[] args) {
		
    	 int[] arr= {65,45,32,63,65,45};
    	 
    	 for(int i=0;i<arr.length;i++) {
    		 
    		 for(int j=i+1;j<arr.length;j++) {
    			 
    			 if(arr[i]==arr[j]) {
    				 
    				 System.out.println(arr[j]);
    			 }
    		 }
    	 }
	}
}
