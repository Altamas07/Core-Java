package com.operators;
import java.util.Scanner;
public class ConvertingKilometerIntoMiles {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your km");
    float km=sc.nextFloat();
float miles=(km*5)/8;
System.out.println(miles);
sc.close();
	}

	}

