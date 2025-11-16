package com.practicequestionbasicstoadvance;

public class MixedVarArgParameter {
	
	
static	void sum(String s,int...x) {
		
		System.out.println(x.length);
	}
	
	public static void main(String[] args) {
		
		
		sum("sfghj",34,65,76);
		
		sum("876",43,87,54);
		
		// inside var arg parameter we cannot take vararg before than normal parameter and also can not take more 
		//than one vararg method inside a var arg method 
		
	}

}
