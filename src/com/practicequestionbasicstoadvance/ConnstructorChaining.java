package com.practicequestionbasicstoadvance;





public class ConnstructorChaining {
	
	int a;
	int c,b;
	String name;
	char ch;
	
	ConnstructorChaining(){
		
		this(10);
		
		System.out.println("No-arg constructor");
		
	}
	
	ConnstructorChaining(int a){
        
		this(23,45);
		this.a=a;
		
		System.out.println("Single parametrized constructor :"+a);
	}
	ConnstructorChaining(int c,int b){
		
		this("Khan");
		this.c=c;
		this.b=b;
		
		System.out.println("Double arg parametrized conructor::"+ (a+b));
		
		
		
	}
	ConnstructorChaining(String name){
		
		this('d');
		this.name=name;
		
		System.out.println(name );
	}
       ConnstructorChaining(char ch){
    	   
    	   this.ch=ch;
    	   
    	   System.out.println(ch);
       }
       
       public static void main(String[] args) {
		
    	   ConnstructorChaining connstructorChaining=new ConnstructorChaining();
    	   
	}
       
       //this process is called constructor chaining::
}
