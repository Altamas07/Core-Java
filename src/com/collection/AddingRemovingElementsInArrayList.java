package com.collection;

import java.util.ArrayList;

public class AddingRemovingElementsInArrayList {
            
	public static void main(String[] args) {
		
		ArrayList<String>arrayList=new ArrayList<>();
		
		arrayList.add("ALtamash khan");
		arrayList.add("aLtamash khan");
		arrayList.add("aaLtamash khan");
		arrayList.add("AALtamash khan");
		arrayList.add(" khan");
		arrayList.add("ad khan");
		arrayList.add(" khan");
		arrayList.add("efb khan");
		arrayList.add("rhmf khan");
		arrayList.add(" fgkjvkhan");
		arrayList.add("zxghj khan");
		arrayList.add("xfghgn khan");
		
		System.out.println(arrayList);
		
		arrayList.remove(3);
		
		arrayList.set(2, "kjhgfds");
		
		System.out.println("Updated ArrayList ");
		
		System.out.println(arrayList);
	}
}
