package com.controlStatement;
import java.util.Scanner;
public class AutoMorphic {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		// AutoMorphic numbers are whose square ends with the same number itself;
            int num=sc.nextInt();
            
            int square=num*num;
            
           
            
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
            sc.close();
	}

}