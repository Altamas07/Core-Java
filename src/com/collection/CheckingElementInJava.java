package com.collection;

import java.util.ArrayList;

public class CheckingElementInJava {
         
	public static void main(String[] args) {
		
		String string="Java";
		
		ArrayList<String>arrayList=new ArrayList<>();
		
		arrayList.add("asdfghjk");
		arrayList.add("ahjk");
		arrayList.add("asdhjk");
		arrayList.add("asdfjk");
		arrayList.add("asdfk");
		arrayList.add("afghjk");
		arrayList.add("ashjk");
		arrayList.add("Java");
		
		for(String arr:arrayList) {
			
			if(arr==string) {
				
				System.out.println("Found");
			}
			
			
		}
		
	}
}
