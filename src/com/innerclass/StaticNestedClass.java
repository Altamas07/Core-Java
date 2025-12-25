package com.innerclass;
// 3- Static inner class 

// we can access only non static field of outer class 
// we can declare both instance and static inside static inner class 
// we can declare main method inside static nested class but in normal inner class we can't 
// we can call static nested class directly from main it is not dependent on outer class 
public class StaticNestedClass {

	static class Inner{
		
		void method() {
			
			System.out.println("Instance method ");
		}
		
		static void methodOne() {
			
			System.out.println("Static method ");
		}
		
		
	}
	public static void main(String[] args) {
		
		StaticNestedClass.Inner t=new StaticNestedClass.Inner();
		Inner.methodOne();
		t.method();
		
	}
}
