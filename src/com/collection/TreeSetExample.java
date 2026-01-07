package com.collection;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	 
	 int id;
	 String name;
	 
	 
	 public Employee( int id ,String name) {
		
		 this.id=id;
		 this.name=name;
		 
		 
		 
	}


	 @Override
	 public int compareTo(Employee o) {

         int lencompare=Integer.compare(this.name.length(), o.name.length());
         
         if(lencompare!=0) {
        	 
        	 return lencompare;
         }
		return this.name.compareTo(o.name);
		
		
	 }
	 public String toString() {
			
			return name + "("+id+")";
		}
 }
public class TreeSetExample {

	public static void main(String[] args) {
		
	
	TreeSet<Employee> tse=new TreeSet<Employee>();
	
	tse.add(new Employee(54, "Altamsh khan 33"));
	tse.add(new Employee(34, "saad khan"));
	tse.add(new Employee(64, "Adnan"));
	tse.add(new Employee(74, "Asif  khan"));
	tse.add(new Employee(84, "Aaaa han"));
	tse.add(new Employee(34, "Altaf khan"));
	tse.add(new Employee(24, "Alfaham han"));
	
	System.out.println(tse);
	}
}
