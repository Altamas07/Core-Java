package com.generics;

class Bound<T extends Number>{ // here i can take only Those types which are extending Number class
	
	T data;
	
	void set(T data ) {
		
		this.data=data;
		
	}
	
	T get() {
		return data;
		
	}
}
public class BoundedGenerics {

	public static void main(String[] args) {
		
		Bound<Integer> b=new Bound<>();
		b.set(10);
		
		System.out.println(b.get());
		
		//Bound<String> b1=new Bound<>(); here i can not add string 
	}
}
