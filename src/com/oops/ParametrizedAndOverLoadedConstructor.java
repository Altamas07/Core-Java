package com.oops;


class Employee{
	
	 int id;
	 String name;
	double salary;
	
	
	Employee(){
		
		System.out.println("default constructor using ::");
		
		
	}
	
	Employee( int id,String name,double salary){
		
		
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	
	}
	
	Employee(int id,String name){
		
		
		
		
		this.id=id;
		this.name=name;
		this.salary=0.0;
		
		
	}
	
	void display() {
		
		System.out.println("ID----------"+id);
		System.out.println("EMPLOYEE NAME----------"+name);
		System.out.println("EMPLOYEE ID----------"+salary);
	}
}
public class ParametrizedAndOverLoadedConstructor {
         public static void main(String[] args) {
	     
        	 Employee employee=new Employee();
        	 Employee employee1=new Employee(23,"Altamsh khan ",4500.0);
        	 Employee employee2=new Employee(43,"Khan");
        	 
        	 employee.display();
        	 employee1.display();
        	 employee2.display();
}
}
