package com.CalculateThePercentage;
import java.util.Scanner;
public class CalculateThePercentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your subject1 marks");
		double subject1=sc.nextDouble();
		System.out.println("Enter your subject2 marks");
		double subject2=sc.nextDouble();
		System.out.println("Enter your subject3 marks");
		double subject3=sc.nextDouble();
		System.out.println("Enter your subject4 marks");
		double subject4=sc.nextDouble();
		System.out.println("Enter your subject5 marks");
		double subject5=sc.nextDouble();
       double totalMarksObtained=subject1+subject2+subject3+subject4+subject5;
       double totalMaximumMarks=500.0;
       double percentage=(totalMarksObtained/totalMaximumMarks)*100;
       System.out.println(totalMarksObtained);
       System.out.println(percentage);		
}
}
