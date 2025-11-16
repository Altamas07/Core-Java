package com.practiceQuestion2;


class Animal{
	
	void sound() {
		
		System.out.println("Animal is crying");
		
	}
}
  class Cat extends Animal{
	  
	  void sound(){
		  System.out.println("Cat sounds like a meow");
		  
	  }
  }
  
  class Dog extends Animal{
	  
	  void sound() {
		  System.out.println("Dog is barking :");
		  
	  }
	  
  }
public class Overriding {
	
	public static void main(String[] args) {
		
		
		Animal an=new Animal();
		an.sound();
		Cat ca=new Cat();
		ca.sound();
		Dog d=new Dog();
		d.sound();
		
		
		
		
	}
	

}
