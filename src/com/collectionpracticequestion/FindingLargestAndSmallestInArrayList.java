package com.collectionpracticequestion;

import java.util.ArrayList;
import java.util.Collections;

public class FindingLargestAndSmallestInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(45);
		al.add(655);
		al.add(435);
		al.add(454);
		al.add(45);
		al.add(452);
		al.add(415);
		al.add(4554);
		
		int min=al.get(0);
		int max=al.get(0);
		
		for(int i=0;i<al.size();i++) {
			
			int curr=al.get(i);
			
			if(curr<min) 
				
				min=curr;
				
			if(curr>max)
			max=curr;
			
			
			
				
			
		}
		System.out.println("minimum is "+min+ " "+"\n maximmum is "+max );
		
		// 2nd way 
		System.out.println(Collections.max(al)+" "+Collections.min(al));
		
	}
}
