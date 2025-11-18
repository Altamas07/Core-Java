package com.practicequestionbasicstoadvance;

public class PreIncrementAndPostIncrement {
            
	public static void main(String[] args) {
		
		int x=10;
		//int y=++x; // here value is increased by 1 before printing it is called pre-increment 
		
		//System.out.println(y);
		
	//	int z=x++;
		
	//	System.out.println(z);  // here value is printed then 1 is incremented it is called post increment 
		
	//	System.out.println(x);
		
	//	int d=--x;
		
	//	System.out.println(d);  // here value is decreased by 1 and after that value got printed
		                       //  it is called pre-increment
		
		int f=x--;
		
		System.out.println(f);
		System.out.println(x); // here after printing value of f then the value of x is getting decreased by -1
		                       // so it is called podt-increment 
		
	}
	
}
