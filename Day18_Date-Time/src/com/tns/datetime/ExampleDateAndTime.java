package com.tns.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

@SuppressWarnings("unused")
public class ExampleDateAndTime {

	public static void main(String[] args) {
		//LocalDate d=LocalDate.now();
		//System.out.println(d);
		
		//LocalTime t=LocalTime.now();
		//System.out.println(t);
		
		LocalDateTime dt=LocalDateTime.now(); //to retrieve both  date and time simultaneously
		System.out.println(dt);
		
		LocalDate d=LocalDate.of(2022,Month.FEBRUARY, 29); //will check whether this date exist or not 
														  //and if not then we will get execution error
		System.out.println(d);

	}

}
