package com.innerclass;

public class RegularInnerclass {

	class Inner{ // we can not declare static field or method in inner class 
		
		void m11() {
			// inside inner class we can access both static and non static field of outer class 
			System.out.println("Inner class");
		}
		
		}
	  void m1() {
		
		Inner i=new Inner();
		i.m11();
		
	  }
		public static void main(String[] args) {
			
			
			
			RegularInnerclass re=new RegularInnerclass();
			 re.m1();
			 
			
		}
		
	}


