package com.array;

import java.util.Arrays;
import java.util.Collections;

public class FindingThirdSmallest {
     public static void main(String[] args) {
		Integer[] arr= {33,535,35,3,646};
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		int n=arr.length;
		
		System.out.println(arr[n-3]);
	}
}
