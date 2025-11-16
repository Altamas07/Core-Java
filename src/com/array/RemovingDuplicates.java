package com.array;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicates {
     public static void main(String[] args) {
		 
    	 int[] arr= {23,45,54,54,53,23,67,56,46,8,56};
    	 
   Set<Integer> set=new LinkedHashSet<Integer>();
    	 
    	 for(int num:arr) {
    		 
    		 set.add(num);
    			 
    			 
    		
    	 }
    	 System.out.println(set);
	}
}
