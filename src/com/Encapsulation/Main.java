package com.encapsulation;


 class BankingApp21 {
	private String accountHolder;
	private long accountNumber1;
	private double balance;
	public String getAccountHolderName() {
		return accountHolder;
	}
	public long getAccountNumber() {
		return accountNumber1;
	}
	public void setAccountHolderName(String accountHolderName) {
		accountHolder = accountHolderName;
	}
	
	public void setAccountNumber(long accountNumber) {
		accountNumber1 = accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("You have depositted :" +amount);
			System.out.println("Your available balance is:"+ getBalance());
		}
		else {
			System.out.println("Please enter valid amount");
		}
	}
     public void withdraw(double amount) {
    	 if(amount>0) {
    		 balance=balance-amount;
    		 System.out.println("You have sucessfully withdrawed :" +amount);
    		 System.out.println("Available balance is:"+balance);
    	 } 
    	 else {
    		 System.out.println("Insufficient balance    : "+"Available balance is :"+balance);
    	 }
     }
      
     
 }
 
public class Main {
	 public static void main(String[] args) {
	
	BankingApp21 account=new BankingApp21();
	account.setAccountHolderName("Altamash Khan");
	account.setAccountNumber(764463838);
	account.deposit(10000);
	account.withdraw(6574);
	System.out.println(account.getAccountHolderName());
	System.out.println(account.getAccountNumber());
}
	 }
