package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExampleParseDateAndTime {

	public static void main(String[] args) {
		//Compile-time input
	String datetime="2022-07-31 19:50";
	DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // using this method user can format date and time
	LocalDateTime l=LocalDateTime.parse(datetime, df); //but here datetime format is already defined hence we cannot change it
	System.out.println(l);
	}

}
