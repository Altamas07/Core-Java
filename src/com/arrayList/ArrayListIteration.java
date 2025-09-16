package com.arrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIteration {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Guava");
		list.add("Mangoe");
		list.add("PineApple");
		list.add("Grapes");
		System.out.println("The list of Fruits is :"+ list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(String fruit:list) {
			System.out.println(fruit);
		}
		System.out.println();
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println( itr.next());
		}
	}

}
      
