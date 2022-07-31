package com.tns.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExampleDuration {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now(); //31th july
		LocalDate date2=date1.plusDays(10);
		System.out.println(date2); //8th august
		
		long df=ChronoUnit.DAYS.between(date1, date2); // to find difference btw two dates
		System.out.println(df);

	}

}
