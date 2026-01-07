package com.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class ConstructorsOfTreeMap {

	public static void main(String[] args) {
		 TreeMap<Integer, Integer> tm=new TreeMap<Integer, Integer>();
		 
		 // creates a default tree map with natural sorting order 
		 
		 TreeMap<Integer, Integer> tm1=new TreeMap<Integer, Integer>();//Comparator);
		 
		 // creates a  tree map with customized  sorting order 
		 
		 TreeMap<Integer, Integer> tm2=new TreeMap<Integer, Integer>(tm);
		 
		 // creates a tree map with copying all elemnts of tm 
		 
	}
}
