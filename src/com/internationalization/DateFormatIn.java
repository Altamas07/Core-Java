package com.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatIn {

	public static void main(String[] args) {
		
		DateFormat UK=DateFormat.getDateInstance(0,Locale.UK);
		DateFormat US=DateFormat.getDateInstance(0,Locale.US);
		DateFormat ITALY=DateFormat.getDateTimeInstance(0,0,Locale.US);
		DateFormat ITALY1=DateFormat.getDateTimeInstance(0,1,Locale.US);
		DateFormat ITALY2=DateFormat.getDateTimeInstance(0,2,Locale.US);
		DateFormat ITALY3=DateFormat.getDateTimeInstance(0,3,Locale.US);
		System.out.println("LONG FORM OF UK::"+UK.format(new Date()));
		System.out.println("LONG FORM OF US::"+US.format(new Date()));
		System.out.println("ITALY date and time full::X"+ITALY.format(new Date()));
		System.out.println("ITALY date and time long::"+ITALY1.format(new Date()));
		System.out.println("ITALY date and time medium::"+ITALY2.format(new Date()));
		System.out.println("ITALY date and time short::"+ITALY3.format(new Date()));
	}
}
