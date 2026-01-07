package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsOfCollection {

	public static void main(String[] args) {
	
		
		Vector<String> v=new Vector<String>();
		v.add("SDFGH");
		v.add("zxc");
		v.add("jhgf"); // this cursor is applicable only for legacy class
		
		System.out.println(v);
		
	 Enumeration<String> enumeration=v.elements();
	
	while(enumeration.hasMoreElements()) {
		
		System.out.println(enumeration.nextElement());
	}
	
	System.out.println(v);

	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(23);
	al.add(32);
	al.add(98);
	
	System.out.println(al);
	
	Iterator<Integer> i=al.iterator();
	
	while(i.hasNext()) {
		
		System.out.println(i.next());
		
		i.remove(); // here modification is applicable but by iterator method not by external modification 
	}
	
	System.out.println(al);
	
	
	LinkedList<Integer> ll=new LinkedList<Integer>();
	

	ll.add(34);
	ll.add(345);
	ll.add(23);
	ll.add(54);
	
	System.out.println(ll);
	
	ListIterator<Integer> li=ll.listIterator();
	
	while(li.hasNext()) {
		
		
		
		
		System.out.println(li.next());
		
		li.remove();
	}
	
	System.out.println(ll);
	}
}
