package com.lti.day4;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import java.util.Date;
import org.joda.time.LocalDate;
import org.junit.experimental.theories.DataPoints;

import org.junit.experimental.theories.Theories;

import org.junit.experimental.theories.Theory;

import org.junit.runner.RunWith;

 

@RunWith(Theories.class)

public class TimeUtilTheoryTest {

 

    private TimeUtil timeUtil = new TimeUtil();

 

    @DataPoints

    public static String[] strDates = new String[]{

            "20180429",

            "2018-04-29",

            "04/29/2018",

            "01/20/1999",

            "1899-12-25",

            "2020-02-29", // leap year future

            "00010101",

            "19160229" // leap year past

        };

     

    @Theory

    public void testStringAsDate(String strDate) {
         

        Date date = timeUtil.stringAsDate(strDate);

         

        assertThat(date, is(not(nullValue())));

         

        String year = null;

        String month = null;

        String day = null;

        if(strDate.contains("-")) {

            String[] parts = strDate.split("-");

            year = parts[0];

            month = parts[1];

            day = parts[2];

        } else if (strDate.contains("/")) {

            String[] parts = strDate.split("/");

            year = parts[2];

            month = parts[0];

            day = parts[1];        

        } else {

            year = strDate.substring(0, 4);

            month = strDate.substring(4, 6);

            day = strDate.substring(6);

        }

         

        LocalDate ld = new LocalDate(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));

        assertThat(date, is(ld.toDate()));

    }

 

}

