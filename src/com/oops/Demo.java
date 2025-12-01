package com.oops;


class Student{
	
	int id;
	String name;
	int marks;
	
	
	Student( int id,String name , int marks){
		
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}

	
	void displayDetails() {
		
		System.out.println("Id------   "+id);
		
		System.out.println("Name--------__"+name);
		
		System.out.println("Marks-----____ "+marks);
		
		System.out.println(" ");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Student student=new Student(34, "Altamash khan", 87);
		Student student2=new Student(12, "Raiyyan", 34);
		Student student3=new Student(17, "Adnan", 89);
		Student student4=new Student(19, "Aamir", 67);
		
		student.displayDetails();
		student2.displayDetails();
		student3.displayDetails();
		student4.displayDetails();
	}
}
