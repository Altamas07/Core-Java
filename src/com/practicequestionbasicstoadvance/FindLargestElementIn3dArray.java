package com.practicequestionbasicstoadvance;

public class FindLargestElementIn3dArray {
        public static void main(String[] args) {
			
        	int [][][]arr= {{{34,65,75,34},{65,654,432,765},{54,765,34,8765}}};
        	
        	int max=arr[0][0][0];
        	
        	for(int i=0;i<arr.length;i++) {
        		
        		for(int j=0;j<arr[i].length;j++) {
        			
        			
        			for(int k=0;k<arr[i][j].length;k++) {
        				
        				if(arr[0][0][0]<arr[i][j][k]) {
        					
        					arr[0][0][0]=arr[i][j][k];
        					
        					max=arr[0][0][0];
        				}
        			}
        		}
        	}
        	System.out.println(max);
		}
}
