package com.practicequestionbasicstoadvance;

public class AcessingInstanceVariableDirectly {
	
	int x=89;
	
	void m1() {
		
		System.out.println(x); //here  i am accessing instance variable directly without making object 
	}
	
	public static void main(String[] args) {
		
		AcessingInstanceVariableDirectly acessingInstanceVariableDirectly =new AcessingInstanceVariableDirectly();
		
		acessingInstanceVariableDirectly.m1();
		
		
		
	}

}
