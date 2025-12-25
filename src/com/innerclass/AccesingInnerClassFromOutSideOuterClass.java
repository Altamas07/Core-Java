package com.innerclass;

class Outer{
	
	class Inner{
		
		void m1() {
			
			System.out.println("Innerclasss ");
		}
	}
}
public class AccesingInnerClassFromOutSideOuterClass {

	public static void main(String[] args) {
		
		new Outer().new Inner().m1();;
		
	}
}
