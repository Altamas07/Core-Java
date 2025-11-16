package com.practiceQuestion2;

public class FindingLargestAndSmallest {
           public static void main(String[] args) {
			
        	   
        	   int[] arr= {76,65,454,34,56,577,54};
        	   
        	   
        	   int max=arr[0];
        	   int min=arr[0];
        	   
        	   for(int i=0;i<arr.length;i++) {
        		   
        		   if(arr[i]>max) {
        			   
        			   max=arr[i];
        		   }
        		   
        		   
        	   }
        	   System.out.println(max);
        	   
        	   for(int i=0;i<arr.length;i++) {
        		   
        		   if(arr[i]<min) {
        			   
        			   min=arr[i];
        		   }
        	   }
        	   System.out.println(min);
		}
}
