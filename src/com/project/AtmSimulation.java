package com.project;


	import java.util.Scanner;

	public class AtmSimulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance=5000;
		
		int choice;
		do {
			System.out.println("Atm Menu ::");
			System.out.println("1: deposit :");
			System.out.println("2: withdraw :");
			System.out.println("3: check balance :");
			System.out.println("4: Exit :");
			System.out.println("Enter your chooice ::");
			  choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter your deposit amount ::" );
				double deposit=sc.nextDouble();
				balance=balance+deposit;
			
			System.out.println("YOU HAVE DEPOSITTED SUCCESSFULLY::");
			System.out.println("Available balance is::"+balance);
			break;
			
		case 2:
			System.out.println("Enter your amount to withdraw :");
			double	withdraw =sc.nextDouble();
				balance-=withdraw;
			
			System.out.println("YOU HAVE WITHDRAWED SUCCESSFULLY ::"+withdraw);
			
			
			
		case 3:
			System.out.println("YOUR AVAILABLE BALANCE  IS ::"+balance);
			break;
		case 4 :
			System.out.println("THANKS FOR USING OUR ATM ::");
			break;
			default :
				System.out.println("INVALID CHOICE ::");
				
		}
		
	}while(choice!=4) ;
		
		sc.close();

	}
	}

