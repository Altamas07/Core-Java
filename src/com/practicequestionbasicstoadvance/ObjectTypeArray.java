package com.practicequestionbasicstoadvance;



public class ObjectTypeArray {
	
	public static void main(String[] args) {
		
		
		Object[] o=new Object[10];
		
		o[0]=new Object();
		
		o[1]=new String("Altamsh");
		
		o[2]=new Integer(10);
		
		o[3]=new Character('A');
		
		o[4]=new Boolean(false);
		
	// here we make array of Object so we can take any object at any index ::
		
		
		   Number[] n=new Number[10];
		   
		   n[0]=new Integer(23);
		   
		   n[1]=new Long(234);
		   
		//   n[2]=new String("ASDFGHJKL");  // here we can not take any string  Because we have taken number type array so 
		                                     //it can not converted from string to int  ::
		  
	}

}
