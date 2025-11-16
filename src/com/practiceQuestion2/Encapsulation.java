package com.practiceQuestion2;

class Khan {
     private double balance;

	 public double getBalance() {
		 return balance;
	 }

	 public void setBalance(double balance) {
		 this.balance = balance;
	 }
     
    public void deposit(double amount ) {
   
    	if(amount >0) {
    		
    		System.out.println("You have depositted"+amount+" sucesfully :");
    		balance+=amount;
    		
    		System.out.println("Available balance is :"+balance);
    		
    	}
    	else {
    		System.out.println("Enter valid amount to deposit :");
    	}
    	System.out.println("\n");
    }
    
    
    	public void withdraw(double amount){
    		
    		if(amount >0) {
    		
    			balance-=amount;
    			
    			System.out.println("You have withdrawed "+amount+"succesfully");
    			
    			System.out.println("Available balance is :"+balance);
    			
    			
    			
    		}
    		else {
    			System.out.println("Please enter valid amount to withdraw : ");
    		}
    		
    		
    	}
    	
    }
     public class Encapsulation  {
    	 public static void main(String[] args) {
			
    		 Khan enc=new Khan();
    		 
    		 enc.setBalance(5000.0);
    		 enc.deposit(5000);
    		 enc.withdraw(3000);
    		 
    		 System.out.println(enc.getBalance());
		}
     }

