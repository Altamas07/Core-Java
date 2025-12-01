package com.oops;

class Employee1{
	
	Employee1(){
		
		this(10);
		
		System.out.println("NO-ARG CONSTRUCTOR ");
		
	}
	
	Employee1(int id){
		
		this(4567.876);
		
		System.out.println("INT ARG CONSTRUCTOR ");
		
	}
	
	Employee1(double salary){
		
		this("fghjkl");
		
		System.out.println("DOUBLE ARGS CONSTRUCTOR ");
		
	}
	
	Employee1(String name){
		
		System.out.println("STRING-ARG CONSTRUCTOR ");
		
	}
}
public class ConstructorChaining {
          
	public static void main(String[] args) {
		
		Employee1 employee=new Employee1();
		
		
	}
}
