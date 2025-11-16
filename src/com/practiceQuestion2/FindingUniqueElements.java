package com.practiceQuestion2;

import java.util.HashSet;
import java.util.Set;

public class FindingUniqueElements {
           public static void main(String[] args) {
			
        	   int []arr= {34,5,43,53,43,2,2,3};
        	   
        	   Set<Integer> sr=new HashSet<Integer>();
        	   
        	   for(int num:arr) {
        		   
        		   sr.add(num);
        	   }
        	   System.out.println(sr);
		}
}
