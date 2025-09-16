package com.ControlStatement;
import java.util.Scanner;
public class PetersonNumber {
	static int factorial(int n) {
		 
		 int fact=1;
		 for(int i=1;i<=n;i++) {
			 fact=fact*i;
		 }
		 return fact;
	}
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
     	int num	=sc.nextInt();
     	int temp=num;
     	int sum=0;
     	   while(temp>0) {
     		   int digit=temp%10;
     		   sum=sum+factorial(digit);
     		   temp=temp/10;
     	   }
     	   if (sum==num)
     	   {
     		   System.out.println(num+" : is Peterson number"); 
     		   
     	   }
     	   else {
     		   System.out.println(num + " : is not a Peterson number");
     	   }
	}
}
