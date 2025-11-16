package com.exception;

//import javax.naming.InsufficientResourcesException;

@SuppressWarnings("serial")
class InsufficientBalance extends Exception{
	public InsufficientBalance(String string) {
		super(string);
	}
}
public class CustomException2 {
        static void withdraw(double amount) throws InsufficientBalance{
        	double balance = 2000;
			if (amount>balance) {
				throw new InsufficientBalance("you have insufficient balance to withdraw: "+"available balance is:"+balance);
        		
        	}
			else {
				balance=balance-amount;
				System.out.println("you have witdrawed :"+amount +"succesfully ");
			}
        }
        public static void main(String[] args) {
			try {
				withdraw(5000);
				
			}
			catch(InsufficientBalance e) {
				System.out.println("Exception caught :"+ e.getMessage());
			}
		}
}
