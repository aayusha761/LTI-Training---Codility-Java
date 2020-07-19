package com.lti.day2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your dob (dd-mm-yyyy)");
		
		String birth_date =console.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dob = LocalDate.parse(birth_date, formatter);
		

	    LocalDate cd = LocalDate.now();
//	    LocalDate dob = LocalDate.of(year, month, date);
;
	    Period diff = Period.between(dob, cd);
//	    System.out.println(diff);
	    int years = Period.between(dob, cd).getYears();
	    System.out.println("You are "+years+" old!!");
	    
	}
}