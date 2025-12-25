package com.javalangpackage;

// object class contains 11 methods total 

// object class is parent class of all java class because the method it have
// is important for all classes in java 


public class ToStringMethod {

	int rollNo;
	String name;
	
	
	ToStringMethod(int rollNo,String name){
		
		this.rollNo=rollNo;
		this.name=name;
		
	}
	
	@Override
	public String toString() { // but after overriding of toString() method we will not get 
		//any hexadecimal form of hash code we will get the value we are passing 
		
		return name+""+rollNo;
	}
	public static void main(String[] args) {
		
		ToStringMethod ts=new ToStringMethod(45, "Altamsh khan");
		ToStringMethod ts1=new ToStringMethod(56, "Khan");
		
		System.out.println(ts);// If i don't override toString() method then we will get  hexadecimal form of hashcode because here oject class
		// toString method is executing 
		System.out.println(ts1);
		
	}
}
