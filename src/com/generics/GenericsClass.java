package com.generics;

class Test<T>{
	
	T data;
	
	void set(T data) {
		
		this.data=data;
		
	}
	
	T get() {
		return data;
		
	}
}
public class GenericsClass {

	public static void main(String[] args) {
		
		Test<Integer>  t=new Test<>();
		t.set(10);
		System.out.println(t.get());
		Test<Double>  t1=new Test<>();
		t1.set(45.0);
		System.out.println(t1.get());
	}
	
}
