package com.lti.day2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//Time in New York
//Given that your requirement is to use the "Eastern zone," I'd use US/Eastern, but note:
//
//It's just a link to America/New_York.
public class Time {
	public static void main(String[] args) {  
	    
		ZoneId india = ZoneId.of("Asia/Kolkata");
	    ZonedDateTime zone1  = ZonedDateTime.now(india);
	    System.out.println("In India Central Time Zone: " + zone1);
	    
	    ZoneId NY = ZoneId.of("America/New_York");
	    ZonedDateTime zone2   = ZonedDateTime.now(NY);
	    System.out.println("In New York Central Time Zone: "  + zone2.toLocalTime());
	    
	    System.out.println("In New York Central Time Zone: "  + zone2.toLocalTime().getHour()+':'+zone2.toLocalTime().getMinute());
	    
	    
	    
	    Scanner console = new Scanner(System.in);
	    
	    System.out.println("Enter Date");
	    String date = console.nextLine();
	    
	    System.out.println("Enter Month");
	    String month = console.nextLine();
	    
	    System.out.println("Enter Year");
	    String year = console.nextLine();
	    
	    
	    //day of given date (older)
	    Calendar c = Calendar.getInstance();
	    c.set(Integer.parseInt(year), Integer.parseInt(month)-1,Integer.parseInt(date));	    
	    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	    
	    
	    String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	    System.out.println(days[dayOfWeek - 1]);
	    
	    
	    //get day of the given date (new)
	    System.out.println(LocalDate.of(Integer.parseInt(year), Integer.parseInt(month),Integer.parseInt(date)).getDayOfWeek());
	    
	    
	    
	    //before Java 8
	    
	    SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
	    Date d = new Date();
	    String fmd = df.format(d);
	    System.out.println(fmd);
	    
	    
	    
	    
	    //display date
	    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY"); 
	    System.out.println(LocalDate.now().format(formatter));
	}
}