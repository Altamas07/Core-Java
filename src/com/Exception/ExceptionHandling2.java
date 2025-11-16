package com.exception;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		
	try {
	int a[]= {1,2,3,4,5,};
	
	int b[]= { 1,2,0,4,5};
	System.out.println(a[5]);
	System.out.println(b[5]);
	}catch (Exception e){
		
	System.out.println(e);
	System.out.println("Good evening");

}
	
}
}