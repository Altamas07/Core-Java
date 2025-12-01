package com.abstraction;


abstract class Abstr{
	
	String name ;
	int rollNo;
	int studentID;
	String address;
	// here if i take thousand line of variable 
	
	Abstr(String name,int rollNo,int studentId,String address ){
		
	
	 // after creating constructor of abstract class i don't need to be initialized this
	//  field every time this is the benefit if creating constructor
		
		
	 this.address=address;
	 this.name=name;
	 this.rollNo=rollNo;
	 this.studentID=studentId;
	 
	 
	}
}

   /*  class student extends Abstr {
    	 
    	 String collageName;
    	 
    	 student (String name,int rollNo,int studentId,String address, String collageName){
    		 
    		 this.address=address;
    		 this.name=name;
    		 this.rollNo=rollNo;
    		 this.studentID=studentId;
    		 this.collageName=collageName;
    		 
    		 // here i want only student collage name but i have to initialize all instance field of 
    		 //parent class also even i need only one property i have to initialize all but if i take
    		 //constructor in parent class so how it will work lets see
    		 
    		 
    	 }
     }
   */  
     class Teacher extends Abstr{
    	 
    	 String subject;
    	 
    	 Teacher(String name,int rollNo,int studentId,String address, String subject ){
    		 
    		super(name,rollNo,studentId,address); // here after creating constructor of abstract class i don't need to be initialized 
    		                                      // the field of parent class every time i extends that class i don't need to be 
    		                                     // initialized that field every time ; 
    		 
    		 this.subject=subject;
    	 }
     }
     
     
public class AbsractClassConstructor {
   
	public static void main(String[] args) {
		
		Abstr teacher=new Teacher("dfghj", 56, 4, "sakinaka", "English");
		
		System.out.println(teacher.studentID);
		
		
	}
}
