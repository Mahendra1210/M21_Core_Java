package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2ParseDateAndTime {

	public static void main(String[] args) {
	//Runtime input
	LocalDateTime datetime=LocalDateTime.now();
	DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"); // using this method user can format date and time
	String var=datetime.format(df);
	System.out.println(var);

	}

}
