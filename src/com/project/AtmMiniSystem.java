package com.project;

import java.util.Scanner;

public class AtmMiniSystem {
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  StringBuffer userName=new StringBuffer("Altamash khan::");
	  double balance=5000;
	  int choice;
	  
	  do {
		  System.out.println("ATM SIMULATION MENU  ::////");
		  System.out.println("1: Deposit::: ");
		  System.out.println("2: Withdraw ::::");
		  System.out.println("3: Check balance :::");
		  System.out.println("4:Display UserName ::");
		  System.out.println("5:Update UserName:::");
		  System.out.println("6: Exit :::");
		  System.out.println("Enter your choice ::");
		 
		  choice=sc.nextInt();
		  
		  
		  switch(choice) {
		  
		  case 1:
			  
			  System.out.println("Enter your amount to deposit :: ");
			  double deposit=sc.nextDouble();
			  balance+=deposit;
			  System.out.println("You have depositted sucessfully ::"+deposit);
			  System.out.println("Available balance is ::"+balance);
			  break;
		  case 2:
			  
			  System.out.println("Enter your amount to withdraw :::");
			  double withdraw=sc.nextDouble();
			  balance-=withdraw;
			  System.out.println("You have withdrawed sucessfully :::"+withdraw);
			  System.out.println("Your available balance is ::"+balance );
			  break;
			  
		  case 3:
			  
			  System.out.println("Your available balance is ::"+balance); 
			  
			  break;
		  case 4: 
			  
			  System.out.println("YOUR USERNAME IS ::"+userName);
			  
			  break;
			  
		  case 5:
			  
			  System.out.println("Enter your new UserName to Update the previous ::");
			  sc.nextLine();
			  String newName=sc.nextLine();
			  userName.setLength(0);
			  userName.append(newName);
			  System.out.println("UserName updated sucessfully:: ");
			  break;
		  case 6:
			  
			  System.out.println("Thanks for using our Atm :::////");
			  
			  
		  
		  }
		  
		  
	  }
	  while(choice!=6);
		  System.out.println("Invalid choice :;;");
	  
	  sc.close();
}
}
