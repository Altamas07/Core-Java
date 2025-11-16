package com.practiceQuestion2;

import java.util.ArrayList;

public class Arraylist1 {
   public static void main(String[] args) {
	
	   ArrayList<String> arr=new ArrayList<String>();
	   
	   arr.add("jhgfd");
	   arr.add("kjhgfd");
	   arr.add("sdfghj");
	   
	   
	   arr.remove(2);
	   System.out.println(arr);
	   
	   
	  
	   for(String num:arr) {
		   System.out.println(num);
		   
	   }
	   
	   
	   
}
}
