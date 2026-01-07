package com.collectionpracticequestion;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapNullAcceptance {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		
		tm.put(34, "dfghjk");

		tm.put(74, "dfghjk");
		tm.put(44, "dfghjk");
		tm.put(54, "dfghjk");
		tm.put(94, "dfghjk");
		tm.put(39, "dfghjk");
		tm.put(32, "dfghjk");
		
		
		System.out.println(tm); // natural sorting order 
		
		//tm.put(null, null); null pointer exception 
		
TreeMap<Integer, String> tm1=new TreeMap<Integer, String>();
		
       // tm1.put(null, null); // here also null pointer exception because after java 7 we can not 
                            //add null as first element also  
       // System.out.println(tm1);
		
        TreeMap<String, String> tm2=new TreeMap<String, String>(Comparator.nullsFirst(null));
        
        tm2.put(null, "null key");
        tm2.put(null, "null key 1");
        
        System.out.println(tm2);
		
        
        
	}
}
