package com.innerclass;

// there are three types of inner class 

// 1 - that extends a class 
// 2- that implements a interface 
// 3-  that defines in a method arguments

class PopCorn{
	
	void taste() {
		
		System.out.println("Spicy ");
	}
}
public class AnonymousInnerClass {
 
	public static void main(String[] args) {
		
		PopCorn popCorn=new PopCorn() // here we are creating a child anonymous class that extends Popcorn
				// and we are creating object of child by parent reference 
				
		{
			void taste() {
				
				System.out.println("Salty ");
			}
		};
		
		popCorn.taste();
		
		PopCorn popCorn2=new PopCorn(); // here i am creating normal object so we will get popcorn class method 
		popCorn2.taste(); 
	}
}
