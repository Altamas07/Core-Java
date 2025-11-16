package com.practicequestion;

public class CheckingArmStrong {
public static void main(String[] args) {
	  int num=153;
	  double sum=0;
	  int rev;
	  int temp=num;
	  
	 while(num>0) {
		 rev=num%10;
		 sum=Math.pow(rev, 3);
		 num=num/10;
	 }
	 if(sum==temp) {
	 System.out.println("Armstrong");
}
	 else {
		 System.out.println("Not Armstromg");
	 }
}
}