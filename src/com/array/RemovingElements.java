package com.array;

import java.util.HashSet;
import java.util.Set;

public class RemovingElements {
     public static void main(String[] args) {
		
    	  int[] arr= {75,34,535,33,76,53,34,75,53};
    	  
    	  Set<Integer> set=new HashSet<Integer>();
    	  
    	  for(int num:arr) {
    		  
    		  set.add(num);
    	  }
    	  System.out.println(set);
	}
}
