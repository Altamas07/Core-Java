package com.dateandtimeapi;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate1 {

	public static void main(String[] args) {
		
		LocalDate no=LocalDate.now();
		System.out.println(no);
		
		int day=no.getDayOfMonth();
		Month month=no.getMonth();
		
		int year=no.getYear();
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
	}
}
