package com.collection;

import java.util.TreeSet;

public class InsertingStringBufferIntTreeSet { 

	public static void main(String[] args) {
		
		TreeSet<StringBuffer> ts=new TreeSet<StringBuffer>();
		
		// string buffer implements comparable in jdk 11 
		
		
		ts.add(new StringBuffer("yujk"));
		ts.add(new StringBuffer("hgjk"));
		ts.add(new StringBuffer("rjk"));
		ts.add(new StringBuffer("ajk"));
		ts.add(new StringBuffer("ckeds"));
		ts.add(new StringBuffer("cjkd"));
		
		
		
		
	
		System.out.println(ts);
	}
}
