package com.arrayList;


import java.util.ArrayList;

public class IntegerPrinting {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(87);
		arr.add(76);
		arr.add(88);
		arr.add(65);
		System.out.println(arr);
		
		for(int ch:arr) {
			
			System.out.println(ch);
		}
	}

}
