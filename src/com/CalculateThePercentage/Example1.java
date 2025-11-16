package com.calculateThePercentage;

public class Example1 {

	// 1. Fields (Variables / Data members)
	String name;
	int age;

	// 2. Static Variable
	static String college = "Mumbai University";

	// 3. Constructor
	Example1(String n, int a) {
		name = n;
		age = a;
	}

	// 4. Method
	void display() {
		System.out.println(name + " - " + age + " - " + college);
	}

	// 5. Static Method
	static void collegeInfo() {
		System.out.println("College: " + college);
	}

	// 6. Instance Initializer Block
	{
		System.out.println("Instance Block executed!");
	}

	// 7. Static Block
	static {
		System.out.println("Static Block executed!");
	}

	// 8. Inner Class
	class Address {
		String city = "Mumbai";
	}

	// Main Class

	public static void main(String[] args) {
		
		 Example1.collegeInfo(); // static method

		 Example1 s1 = new  Example1("Altamash", 20);
	        s1.display();

	        // Inner class object
	        Example1.Address addr = s1.new Address();
	        System.out.println("City: " + addr.city);

	}

}
