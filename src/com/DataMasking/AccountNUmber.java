package com.dataMasking;

	public class AccountNUmber {
	    public static void main(String[] args) {
	        String AccountNUmber="7509098041605310";
	        String AccountNUmber1[]=AccountNUmber.split("");
	        for(int i=0; i<AccountNUmber1.length; i++)
	        {
	            if (i<AccountNUmber1.length-4) {
	                System.out.print("*");
	            }
	            else
	            System.out.print(AccountNUmber1[i]);
	        }


	    }
	}


