package com.oops;

import java.util.Scanner;


class Bank{
	
	private double balance;

	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		
		if(amount<balance) {
			
			balance=balance-amount;
			
			System.out.println("YOU HAVE WITHDRAWED SUCESSFULLY :: "+ amount );
			System.out.println("AVAILABLE BALANCE IS -----:: "+    balance);
			
			
		}
		else {
			
			System.out.println("INSUFFICIENT FUND ___------::");

		}
		
		
	}
	public void deposit(double amount) {
		
		balance+=amount;
		
		System.out.println("You have successfully depositted "+amount+"Available balance is"+balance);
		
		
	}
	public void checkBalance() {
		
		System.out.println("Your available balance is :-----"+balance );
	}
}
public class Banking {
	
          public static void main(String[] args) {
			
       Scanner sc=new Scanner(System.in);

        	  Bank bank=new Bank();
        	  bank.setBalance(40000);
        	  
        	  int choice;
        	  
        	  
        	 
        	  
        	 
        	  do {
        		  
        		  System.out.println(" BANK  GUI SCREEN ");
        		  System.out.println("1-----   WITHDRAW");
        		  System.out.println("2----- DEPOSIT ");
        		  System.out.println("3 ------ CHECK BALANCE ");
            	  System.out.println("Please enter your choice ");
        	  
              choice=sc.nextInt();
        	  
        	  switch(choice) {
        	  
        	  case 1:
        		  System.out.println("Please enter your amount to withdraw _---------");
        		  double w=sc.nextDouble();
        		  bank.withdraw(w);
        		  
        		  break ;
        		  
        	  case 2:
        		  
        		  System.out.println("Please enter your withdraw amount --------");
        		  double d=sc.nextDouble();
        		  bank.deposit(d);
        		  
        		  break;
        		  
        	  case 3:
        		 
        		  bank.checkBalance();
        		  
        		  
        		  default :
        			  
        			  System.out.println("PLEASE ENTER VALID CHOICE ");
        	  }
        	  }
        	  while(choice!=4);
        		  
        		  System.out.println("invalid choice");
        	  
        		  sc.close();
		}
}
