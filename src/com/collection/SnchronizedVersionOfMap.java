package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SnchronizedVersionOfMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		Map<Integer, String> m=Collections.synchronizedMap(hm);
		m.put(34, "Asdfghjkl");
		
	}
}
