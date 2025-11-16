package com.project;

import java.util.Scanner;


class Student{
	  
	  String name;
	  int[] marks;
	  char grade;
	  double percentage;
	  int total;
	  
	  Student(String name,int subjects){
		  
		  this.name=name;
		  this.marks=new int[subjects];
		  
	  }
	  void calculateResults(){
		    
		  
		  total=0;
		  for(int mark:marks) {
			  
			  total+=mark;
		  }
		  percentage=(double) total/marks.length;
		  
		  
		  if(percentage>=80) {
			  
			  grade='A';
		  }
		  else if(percentage>=60){
			  
			  grade='B';
			  
		  }
		  else if(percentage>=40) {
			  
			  grade='C';
		  }
		  else {
			  
			  grade='F';
		  }
		  
	  }
	  
	  void displayResults() {
		  
		  System.out.println("Name:"+name);
		  System.out.println("Marks:");
		  for(int mark:marks) {
			  System.out.println(mark);
		  }
		  System.out.println("total:"+total);
		  System.out.println("Percentage:"+percentage+"%");
		  System.out.println("Grade:"+grade);
		  System.out.println("_________________________________________________"); 
		  
	  }
  }


public class StudentManagementSystem {
      public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter  number of student name ::");
		  int  n=sc.nextInt();
		 
		System.out.println("Enter your subject::");
		int subject=sc.nextInt();
		Student []student=new Student[n];
		
		for(int i=0;i<n;i++) {
			sc.nextLine();
			System.out.println("\nEnter name of students:"+(i+1)+" ");
			String name=sc.nextLine();
		student[i]=new Student(name, subject);
		System.out.println("Enter marks of your ::"+subject+"subject:: ");
		
		for(int j=0;j<subject;j++) {
			
			System.out.println("Subject"+(j+1));
			student[i].marks[j]=sc.nextInt();
			
			
		}
		student[i].calculateResults();
		
		}
		System.out.println("\n====Student Results::");
		 for(Student s:student ) {
			 if(s!=null) {
				 s.displayResults();
			 }
			 
			
		 }
		
		sc.close();
	}
}
