package com.overriding;

    class GrandFather{
    	void eat() {
		   System.out.println("Grandfather is eating apple");
		   
	   }
   }
    class Father extends GrandFather{
    	@Override
    	void eat() {
    		System.out.println("Father is eating mango");
			
    	}
    	void sleep(){
    		System.out.println("Father is sleeping");
    	}
    }



public class Overriding {
public static void main(String[] args) {
	 GrandFather obj1=new Father();
	 obj1.eat();
	
}
}
