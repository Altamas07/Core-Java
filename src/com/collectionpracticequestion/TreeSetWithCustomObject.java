package com.collectionpracticequestion;

import java.util.Comparator;
import java.util.TreeSet;


class Student {
	
	int age;
	String name;
	
	Student(int age,String name){
		
		this.age=age;
		this.name=name;
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age+"  "+name;
	}
}
	
	class Comparator12 implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.age-o2.age;
			
		}
		
	}

public class TreeSetWithCustomObject {

	public static void main(String[] args) {
		// 1st way
		TreeSet<Student> ts=new TreeSet<>((o1,o2)->o1.age-o2.age);
		ts.add(new Student(23,"Altamash"));
		ts.add(new Student(12, "SAAD"));
		ts.add(new Student(67, "KHAN"));
		
		System.out.println(ts);
		
		// 2nd way
		TreeSet<Student> ts1=new TreeSet<>(new Comparator12());
		ts1.add(new Student(23,"Altamash"));
		ts1.add(new Student(12, "SAAD"));
		ts1.add(new Student(67, "KHAN"));
		
		System.out.println(ts1);
		

	}
}
