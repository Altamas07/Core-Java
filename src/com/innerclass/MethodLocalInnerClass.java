package com.innerclass;

// a class which is defined inside a method is called method local inner class 

// the purpose of this class is method specific repetition it is rarely used 

// if we declare inner class inside static method we can access only static member of outer class 
// if we declare inner class inside instance  method we can access instance and  static member of outer class
public class MethodLocalInnerClass {

	void methodOne() {
		
		
		class Inner{
			
			void sum(int i,int j) {
				
				System.out.println("The sum is---__"+(i+j));
			}
		}
		Inner inner=new Inner();
		inner.sum(13, 6);
		inner.sum(34, 76);
		inner.sum(76, 32);
		
	}
	
	public static void main(String[] args) {
		
		new MethodLocalInnerClass().methodOne();
	}
}
