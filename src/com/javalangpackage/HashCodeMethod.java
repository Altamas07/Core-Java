package com.javalangpackage;

public class HashCodeMethod {

	int roll;
	
	
	
	HashCodeMethod(int roll ){
		
		this.roll=roll;
		
		
	}
	@Override
	public int hashCode() {
		
		return roll;
	}
  public static void main(String[] args) {
	
	  HashCodeMethod h=new HashCodeMethod(0);
	  
	  System.out.println(h);
}
	
	
}
