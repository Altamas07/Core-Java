package com.practicequestionbasicstoadvance;

public class StudentDetails {
	
	int rollno;
	int marks;
	String name ;
	String address;
	
	StudentDetails(int rollno,int marks,String name,String address){
		
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
		this.address=address;
		
	}
	
	void displaydetails() {
		
		System.out.println(rollno);
		System.out.println(marks);
		System.out.println(name);
		System.out.println(address);
	}

	
	      public static void main(String[] args) {
			
	    	  StudentDetails studentDetails=new StudentDetails(32, 98, "asdfgh", "jkjhgfdfgh");
	    	  StudentDetails studentDetails2=new StudentDetails(12, 87, "kjhgfdsa", "dfghjknb");
	    	  
	    	  studentDetails.displaydetails();
	    	  System.out.println("\n");
	    	  studentDetails2.displaydetails();
		}
}
