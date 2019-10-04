package com.app.java8features.dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		//Date date;
		LocalDate currentDate = LocalDate.now();
		// date = currentDate; ->cannot append LocalDate to a date datatype
		System.out.println("Current Date : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time : "+currentDateTime);
		
		currentDateTime = LocalDateTime.of(2033, Month.DECEMBER, 11, 10, 30);
		System.out.println("Using of method of LocalDateTime class "+currentDateTime);
		
		currentDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Using of method of LocalDateTime class "+currentDateTime );
		
		Date date = new Date();
		System.out.println("current date :"+date); 
		
		date = new Date(2014, 12, 10);
		System.out.println(date);
		
	}

}
