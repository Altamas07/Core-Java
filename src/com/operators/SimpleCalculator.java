package com.operators;
import java.util.Scanner;

public class SimpleCalculator {
	
   public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter your first number");
	 int a=sc.nextInt();
	 System.out.println("Enter your second number");
	 int b=sc.nextInt();
	 System.out.println("Enter your operator: +,-,*,%,/");
	 char operator =sc.next().charAt(0);

	 int result=0;
	 switch (operator) {
	 case'+':
		 result= a+b;
		 System.out.println(result);
		 break;
	 case'-':
		 result=a-b;
		 System.out.println(result);
		 break;
	 case'*':
		 result=a*b;
		 System.out.println(result);
		 break;
	 case'%':
		 result=a%b;
		 break;
	 case'/':
		 result = a/b;
		 System.out.println(result);
		 break;
		 default:
			 System.out.println("Invalid Operator");
	 }
   }
}
