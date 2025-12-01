package com.oops;

public class ConstructorOverloading {

	ConstructorOverloading(){
		
		this(10);
		
		System.out.println("No arg constructor ");
	}
	
	ConstructorOverloading(int i){
		
		this(45.6);
		
		System.out.println("Int argument constructor ");
	}
	
	ConstructorOverloading(double d){
		
		
		System.out.println("Double argument constructor ");
		
		
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading constructorOverloading=new ConstructorOverloading();
		
		System.out.println(" ");
		

		ConstructorOverloading constructorOverloading1=new ConstructorOverloading(23);
		
		
		System.out.println("  ");

		ConstructorOverloading constructorOverloading3=new ConstructorOverloading(23.5);
		
System.out.println("  ");

		ConstructorOverloading constructorOverloading4=new ConstructorOverloading('a');
		
		
		System.out.println("  ");
		
		

		ConstructorOverloading constructorOverloading5=new ConstructorOverloading(10l);
		// here long is automatically converted to double type because constructor overloading
		//supports automatic type casting 
	}
	
	
}
