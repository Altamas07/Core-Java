package com.oops;


class Shape{
	
	void area (){
		
		System.out.println("The area is -----");
	}
}

class Circle extends Shape{
	
	int radius=4;
	
	void area() {
		
		System.out.println("The area of circle is ---" +Math.PI*radius*radius);
	}
}

 class Square extends Shape {
	
	int side=5;
	
	void area() {
		
		System.out.println("The area of square is -----"+side*side);
	}
	
}
  class Rectangle extends Shape{
	  
	  int length=20;
	  int breadth=15;
	  
	  void area() {
		  
		  System.out.println("The area of reactangle is -----"+2*(length+breadth));
	  }
  }
public class Overriding {

	public static void main(String[] args) {
		
		Circle circle=new Circle();
		Square square=new Square();
		Rectangle rectangle=new Rectangle();
		
		
		circle.area();
		
		System.out.println("\n");
		
		square.area();
		
		System.out.println("\n");
		
		rectangle.area();
		
		
	}
	
}
