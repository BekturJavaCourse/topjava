package ru.javawebinar.topjava.util;

import org.springframework.lang.Nullable;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateTimeUtil {
    private static final DateTimeFormatter Date_Time_Formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static boolean isBetweenInclusive(LocalTime lt,LocalTime startTime,LocalTime endTime){
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }

    public static String toString(LocalDateTime ldt){
        return ldt == null ? "" : ldt.format(Date_Time_Formatter);
    }
}
