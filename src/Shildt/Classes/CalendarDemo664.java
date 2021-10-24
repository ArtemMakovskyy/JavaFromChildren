package Shildt.Classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo664 {
    public static void main(String[] args) {
        String months [] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Des"};
        Calendar calendar = Calendar.getInstance();
        System.out.print("Date "+ months[calendar.get(Calendar.MONTH)]);
        System.out.print(" "+ calendar.get(Calendar.DATE)+" ");
        System.out.print(" "+ calendar.get(Calendar.DAY_OF_YEAR)+" ");
        System.out.println(" "+ calendar.get(Calendar.YEAR)+" ");
        System.out.print("Time "+ calendar.get(Calendar.HOUR)+" ");
        System.out.print(" "+ calendar.get(Calendar.MINUTE)+" ");
        System.out.print(" "+ calendar.get(Calendar.SECOND)+" ");

        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 29);
        calendar.set(Calendar.SECOND, 22);

        System.out.println("modified time");
        System.out.print("Time "+ calendar.get(Calendar.HOUR)+" ");
        System.out.print(" "+ calendar.get(Calendar.MINUTE)+" ");
        System.out.print(" "+ calendar.get(Calendar.SECOND)+" ");

        /** GregorianCalendarDemo */

        int year;
        GregorianCalendar gCalendar = new GregorianCalendar();
        System.out.println();
        System.out.print("Date "+ months[gCalendar.get(Calendar.MONTH)]);
        System.out.print(" "+ gCalendar.get(Calendar.DATE)+" ");
        System.out.print(" "+ gCalendar.get(Calendar.YEAR)+" ");

        System.out.print("Time "+ gCalendar.get(Calendar.HOUR)+" ");
        System.out.print(" "+ gCalendar.get(Calendar.MINUTE)+" ");
        System.out.print(" "+ gCalendar.get(Calendar.SECOND)+" ");

        year = gCalendar.get(Calendar.YEAR);
        if(gCalendar.isLeapYear(year)){
            System.out.println("Teкyщий год  високосный");

        }else System.out.println("Teкyщий год  не високосный");

    }
}
