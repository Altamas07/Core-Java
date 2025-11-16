package com.practicequestionbasicstoadvance;



public class Oops {

	
 
	String name ;
	int rollno;
	int marks;
	
	void displayDetails(String name , int rollno , int marks) {
		
		this.name=name;
		this.marks=marks;
		this.rollno=rollno;
		
		System.out.println(marks+","+name+","+rollno);
		
//		System.out.println(rollno);
//		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Oops o=new Oops();
		
		

		System.out.println(o.marks+","+o.name+","+o.rollno);
		
		 	o.displayDetails("Altamash khan ", 43, 02);
	}
}
