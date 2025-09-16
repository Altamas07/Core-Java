package com.Encapsulation;

import java.util.Scanner;

class BankingApp {
	private double balance;
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("you have depositted : " + amount);
			System.out.println("Available balance is : " + amount);
		} else {
			System.out.println("Pls Give me positve number :");
		}
	}
	public void withdraw(double amount) {
		if (amount > balance) {
			balance = balance - amount;
			System.out.println("You have successfully withdrawl:" + amount + "rs");
			System.out.println("Available amount is:" + balance + "rs");
		} else {
			System.out.println("Insufficient Balance : Balance is : "+balance);
		}
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankingApp account = new BankingApp();
		int choice;
		do {
			System.out.println("---/n + Banking menu");
			System.out.println("1- Deposit");
			System.out.println("2- Withdraw");
			System.out.println("3- Check Balance");
			System.out.println("4- Exit Menu");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your deposit amount");
				  double deposit = sc.nextDouble();
				  account.deposit(deposit);
				break;
			case 2:
				System.out.println("Enter your withdraw amount");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 3:
				System.out.println("Remaining Balance : "+account.getBalance());
				break;
			case 4:
				System.out.println("Thank you for banking with us");
				break;
			default:
				System.out.println("Invalid Choice...");

			
			}	
		} while (choice != 4);
	}
}
