package com.generics;

class Test1<T>{
	
	T data;
	
	Test1(T data){
		
		this.data=data;
		
	}
	
	void show() {	
		System.out.println(data.getClass().getName());
	}
	
	
}
public class GenericClassConstructor {

	public static void main(String[] args) {
		
		Test1<Integer> t=new Test1<Integer>(10);
		t.show();
		Test1<Double> t1=new Test1<Double>(10.0);
		t1.show();
		
	}
}
