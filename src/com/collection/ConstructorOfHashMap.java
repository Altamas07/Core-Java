package com.collection;

import java.util.HashMap;

public class ConstructorOfHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		// creates default hashmap object with default capacity 16 with 0.75 load factor 
		
		
		HashMap<Integer, String> hm1=new HashMap<Integer, String>(20);
		// creates  hashmap object with 20 capacity  with 0.75 load factor 
		
		HashMap<Integer, String> hm2=new HashMap<Integer, String>(20,0.45f);
		// creates  hashmap object with 20 capacity  with 0.45 load factor 
		
		HashMap<Integer, String> hm3=new HashMap<Integer, String>(hm);
		// creates  hashmap object with copying all elements of hm into hm3
		
	}
}
