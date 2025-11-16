package com.practiceQuestion2;



class Animals{
	
	void sound(){
		
		System.out.println("Barking ");
		
	}
}

class Leopard extends Animal{
	
	
	void sound() {
		
		
		System.out.println("Leopard is Attacking  :");
	}

}
class Lion extends Leopard{
	
	void sound() {
		super.sound();
		System.out.println("Lion  is roaring ::");
	}
}
public class SuperKeywordUsage {
	public static void main(String[] args) {
		
		Lion l=new Lion();
		l.sound();
		
		
	}
	
}
