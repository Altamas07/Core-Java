package com.practicequestionbasicstoadvance;

public class Revering3dArray {
        
	public static void main(String[] args) {
		
		int[][][] arr= {{{45,54,6,34},{54,54,3,76},{76,45,53,34}}};
		
		for(int i=arr.length-1;i>=0;i--) {
			
			for(int j=arr[i].length-1;j>=0;j--) {
				
				for(int k=arr[i][j].length-1;k>=0;k--) {
					
					
					System.out.println(arr[i][j][k]);
					
					
				}
			}
			
		}
	}
}
