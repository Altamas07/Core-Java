package com.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatOf {

	public static void main(String[] args) {
		
		double d=12345.8765;
		
		
		Locale locale=new Locale("pa", "IN");
		
		NumberFormat numFormat=NumberFormat.getCurrencyInstance(Locale.UK);
		
		System.out.println("CURRENCY Form OF UK::"+numFormat.format(d));
		

		NumberFormat numFormat1=NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println("CURRENCY Form OF Us::"+numFormat1.format(d));

		NumberFormat numFormat2=NumberFormat.getCurrencyInstance(locale);
		
		System.out.println("CURRENCY Form OF INDIA::"+numFormat2.format(d));
		

		NumberFormat numFormat3=NumberFormat.getCurrencyInstance(Locale.CHINA);
		
		System.out.println("CURRENCY Form OF CHINA ::"+numFormat3.format(d));

		NumberFormat numFormat4=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		System.out.println("CURRENCY Form OF FRANCE::"+numFormat4.format(d));

		NumberFormat numFormat5=NumberFormat.getCurrencyInstance(Locale.FRENCH);
		
		System.out.println("CURRENCY Form OF FRENCH::"+numFormat5.format(d));

		NumberFormat numFormat6=NumberFormat.getCurrencyInstance(Locale.GERMAN);
		
		System.out.println("CURRENCY Form OF GERMAN::"+numFormat6.format(d));

		NumberFormat numFormat7=NumberFormat.getCurrencyInstance(Locale.GERMANY);
		
		System.out.println("CURRENCY Form OF GERMANY::"+numFormat7.format(d));

		NumberFormat numFormat8=NumberFormat.getCurrencyInstance(Locale.ITALY);
		
		System.out.println("CURRENCY Form OF ITALY::"+numFormat8.format(d));

		NumberFormat numFormat9=NumberFormat.getCurrencyInstance(Locale.ITALIAN);
		
		System.out.println("CURRENCY Form OF ITALIAN::"+numFormat9.format(d));

		NumberFormat numFormat0=NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		
		System.out.println("CURRENCY Form OF TAIWAN::"+numFormat0.format(d));
		
	}
}
