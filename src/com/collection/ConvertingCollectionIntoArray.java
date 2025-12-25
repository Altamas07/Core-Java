package com.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ConvertingCollectionIntoArray {

	public static void main(String[] args) {
		
		Collection< Integer> i=new ArrayList<>();
		i.add(43);
		i.add(56);
		i.add(43);
		
		
		Object[] arr=i.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
