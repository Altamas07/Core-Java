package com.internationalization;

import java.text.DateFormat;
import java.util.Date;

public class RepresentingDateAndTime {

	public static void main(String[] args) {
		
		System.out.println("FULL FORM OF DATE ::"+DateFormat.getDateInstance(0).format(new Date()));
		System.out.println("LONG FORM OF DATE ::"+DateFormat.getDateInstance(1).format(new Date()));
		System.out.println("MEDIUM FORM OF DATE ::"+DateFormat.getDateInstance(2).format(new Date()));
		System.out.println("SHORT FORM OF DATE ::"+DateFormat.getDateInstance(3).format(new Date()));

	}
}
