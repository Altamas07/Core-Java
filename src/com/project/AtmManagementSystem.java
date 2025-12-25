package com.project;

import java.util.Scanner;

interface AtmService{
	
	void withdraw(double amount );
	void checkBalance();
	void deposit(double amount);
	
}

  class Account {
	  
	  private int accountNumber;
	  private int pin;
	  private double balance;
	  
	  
	  
	  Account( int accountNumber, int pin, double balance){
		  
		  this.accountNumber=accountNumber;
		  this.pin=pin;
		  this.balance=balance;
		  
	  }
	  public int getAccountNumber() {
		  return accountNumber;
	  }
	  public void setAccountNumber(int accountNumber) {
		  this.accountNumber = accountNumber;
	  }
	  public int getPin() {
		  return pin;
	  }
	  public void setPin(int pin) {
		  this.pin = pin;
	  }
	  public double getBalance() {
		  return balance;
	  }
	  public void setBalance(double balance) {
		  this.balance = balance;
	  }
  }

abstract  class Bank{
	
	Account account;
	
	public Bank(Account account){
		
		this.account=account;
		
	}
	
	public boolean verifyPin(int inputPin) {
		
		if(inputPin==account.getPin()) {
			
			return true;
			
		}
		
		else {
			
			System.out.println("Please enter valid pin ::");
			
			return false;
			
		}
		
		
			
	}
	
}

   class SBI  extends Bank implements AtmService{


	public SBI(Account account) {
		super(account);
		
	}

	@Override
	public void withdraw(double amount) {
		
		if(amount>=account.getBalance()) {
			
			account.setBalance(account.getBalance()-amount);
			
			System.out.println("You have withdrawed "+amount +" successfully");
			
			System.out.println("Remaining balance is ::"+account.getBalance());
		}
		
		else {
			
			System.out.println("Insufficient Balance ::");
			
			
		}
		
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Available balance is ::"+account.getBalance());
		
	}

	@Override
	public void deposit( double amount) {
		
	
			
		account.setBalance(account.getBalance()+amount);
		System.out.println("Successfully depositted "+amount+" Available balance is ::"+account.getBalance());
	}
	   
	   
	   
   }
public class AtmManagementSystem {

	public static void main(String[] args) {
		
		Account acc=new Account(1234569067, 7860, 5000);
		
		AtmService atmService=new SBI(acc) ;
			
			Scanner sc=new Scanner(System.in);
			int attempts = 0;
		    boolean pinVerified = false;

		    // Keep asking for PIN until correct or max 3 attempts
		    while (attempts < 3 && !pinVerified) {
			
			System.out.println("Enter pin ");
			
			int pin=sc.nextInt();
			
			Bank bank=(Bank) atmService;
			
			 if (bank.verifyPin(pin)) {
				 
		            pinVerified = true;
		            
		        } else {
		        	
		            attempts++;
		            
		            if (attempts < 3) {
		            	
		                System.out.println("Try again...");
		                
		            } else {
		                System.out.println("Maximum attempts reached. Account Blocked.");
		                sc.close();
		                return;
		            }
		        }
		    }
		    // If PIN is correct, show operations menu
		    if (pinVerified) {
		        System.out.println("Choose your operation: 1: Withdraw  2: CheckBalance  3: Deposit");
		        int choice = sc.nextInt();

				
				
				switch(choice) {
				
				case 1:
					
					System.out.println("Enter your amount to withdraw ");
					double w=sc.nextDouble();
					
					atmService.withdraw(w);
					
					break;
					
				case 2:
					
					atmService.checkBalance();
					break;
					
					
				case 3:
					
					System.out.println("ENter your amount to deposit ::");
					
					double d=sc.nextDouble();
					
					atmService.deposit(d);
					
					break;
					
					
					default :
						
						System.out.println("Invalid choice");
				}
			}
			
			sc.close();
		
	}

}
