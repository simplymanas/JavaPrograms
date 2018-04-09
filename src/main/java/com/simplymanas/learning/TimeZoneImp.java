package com.simplymanas.learning;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneImp {
    public static void main(String[] args) {
        Calendar cal =  new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.printf("New York Time: %02d:%02d:%02d", hour, minute, second);
    }
}

