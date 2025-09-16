package com.ControlStatement;
import java.util.Scanner;
public class AutoMorphic {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
            int num=sc.nextInt();
            
            int square=num*num;
            
            int temp=num;
            
            boolean isAutoMorphic=true;
            
            while(num%10!=square%10) {
            	
            	isAutoMorphic=false;
            	
            	break;
            }
           
            
            
            if(isAutoMorphic) {
            	System.out.println(num +  "  is automorphic");
            } 
            
            else {
            	System.out.println(num+"    is not a automorphic "); 
            	
            }
	}

}