package com.practiceQuestion2;

class klj {
      
	static int rollNo;
	
	static int details(int rollNo) {
		
		System.out.println(rollNo);
		
		return rollNo;
	}
}
	public class ShowDetails{
		
		public static void main(String[] args) {
			
			klj.details(345);
			klj.details(987);
		}
	}

