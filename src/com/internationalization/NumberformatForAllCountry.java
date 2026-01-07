package com.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberformatForAllCountry {

	public static void main(String[] args) {
		
		double d=87654.987;
		
		NumberFormat nf=NumberFormat.getInstance(Locale.CANADA);
		NumberFormat nf1=NumberFormat.getInstance(Locale.CHINA);
		NumberFormat nf2=NumberFormat.getInstance(Locale.CHINESE);
		NumberFormat nf3=NumberFormat.getInstance(Locale.FRANCE);
		NumberFormat nf4=NumberFormat.getInstance(Locale.FRENCH);
		NumberFormat nf5=NumberFormat.getInstance(Locale.ENGLISH);
		NumberFormat nf6=NumberFormat.getInstance(Locale.GERMAN);
		NumberFormat nf7=NumberFormat.getInstance(Locale.GERMANY);
		NumberFormat nf8=NumberFormat.getInstance(Locale.ITALIAN);
		NumberFormat nf9=NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf0=NumberFormat.getInstance(Locale.JAPAN);
		NumberFormat nf11=NumberFormat.getInstance(Locale.JAPANESE);
		NumberFormat nf12=NumberFormat.getInstance(Locale.KOREA);
		NumberFormat nf13=NumberFormat.getInstance(Locale.KOREAN);
		NumberFormat nf14=NumberFormat.getInstance(Locale.TAIWAN);
		NumberFormat nf15=NumberFormat.getInstance(Locale.UK);
		NumberFormat nf16=NumberFormat.getInstance(Locale.US);
		NumberFormat nf17=NumberFormat.getInstance(Locale.SIMPLIFIED_CHINESE);
		NumberFormat nf18=NumberFormat.getInstance(Locale.TRADITIONAL_CHINESE);
		
		System.out.println("CANADA FORM::"+nf.format(d));
		System.out.println("CHINA FORM::"+nf1.format(d));
		System.out.println("CHINEESE FORM::"+nf2.format(d));
	    System.out.println("FRANCE FORM::"+nf3.format(d));
	System.out.println("FRENCH FORM:::"+nf4.format(d));
	System.out.println("ENGLISH FORM:::"+nf5.format(d));
	System.out.println("GERMNAN FORM::"+nf6.format(d));
	System.out.println("GERMANY FORM::"+nf7.format(d));
	System.out.println("ITALIAN FORM::"+nf8.format(d));
	System.out.println("ITALY FORM:::"+nf9.format(d));
	System.out.println("JAPAN FORM:::"+nf0.format(d));
	System.out.println("JAPANEESE FORM:::"+nf11.format(d));
	System.out.println("KOREA  FORM::"+nf12.format(d));
	System.out.println("KOREAN FORM::"+nf13.format(d));
	System.out.println("TAIWAN FORM:::"+nf14.format(d));
	System.out.println("UK FORM::"+nf15.format(d));
	System.out.println("US FORM::"+nf16.format(d));
	System.out.println("SIMPLIFIED CHINESE FORM::"+nf17.format(d));
	System.out.println("TRADITIONAL CHINESE  FORM:::"+nf18.format(d));
	
	
}
}