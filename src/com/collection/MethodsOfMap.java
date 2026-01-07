package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MethodsOfMap {

	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(67, "hjsggdqdkl");
		m.put(69, "hjkkgsdidqjl");
		m.put(97, "hjkgbagll");
		m.put(27, "hjklrwhssg");
		m.put(87, "hkltyejan");
		
		System.out.println(m);
		
		Map<Integer, String> m1=new HashMap<Integer, String>();
		System.out.println("Before adding all elements of m in m1" );
		
		System.out.println(m1);
		m1.putAll(m);
		
		System.out.println("After adding all element of m into m1 :");
		System.out.println(m1);
		
		
		
		
		System.out.println(m.get(97)); // returns the value of thet key
		
		System.out.println(m.remove(97)); // removes the key value pair and returns the value 
		
		System.out.println(m1.size()); // returns the total entryset of map
		
		m.clear(); // delete all entries of of thet object 
		System.out.println(m);
		
		Set<Integer> keys=m1.keySet(); // returns group of keys for that object 
		
		System.out.println(keys);
		
		System.out.println(m1.values());// returns group of values 
		
		
		Set<Map.Entry<Integer,String>> entries=m1.entrySet();
		
		for(Map.Entry<Integer, String> e:entries ) {
			
			System.out.println("Key::"+e.getKey()+" value:: "+e.getValue());
		}
		
		
		
	}
}
