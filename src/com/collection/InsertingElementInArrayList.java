package com.collection;

import java.util.ArrayList;

public class InsertingElementInArrayList {
           
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		arrayList.add(32);
		arrayList.add(34);
		arrayList.add(37);
		arrayList.add(52);
		arrayList.add(72);
		
		System.out.println("Normal Arraylist :");
		
		System.out.println(arrayList);
		
		arrayList.add(3, 45);
		arrayList.add(2, 45);
		arrayList.add(1, 45);
		arrayList.add(0, 45);
		arrayList.add(4, 45);
		
		System.out.println("After  Inserting ::");
		
		System.out.println(arrayList);
		
		
		
	}
}
