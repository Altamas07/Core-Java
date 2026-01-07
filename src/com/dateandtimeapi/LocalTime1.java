package com.dateandtimeapi;

import java.time.LocalTime;

public class LocalTime1 {

	public static void main(String[] args) {
		
		LocalTime now=LocalTime.now();
		System.out.println(now);
		int getHour=now.getHour();
		int getMin=now.getMinute();
		int getSec=now.getSecond();
		System.out.println(getHour);
		System.out.println(getMin);
		System.out.println(getSec);
	} 
	
}
