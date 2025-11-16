package com.practicequestion;

public class CheckingPrime {
    public static void main(String[] args) {
		int num=32;
		boolean prime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
			 prime=false;
			break;
		}
		}
			
			if(prime) {
				System.out.println("prime");
				
			}
			else {
				System.out.println("not prime");
			}
	}
  }

