package Shildt.Classes.DateFormat1173;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class DateTimeFormatter1179 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.FULL)));

//        LocalTime curlTime = LocalTime.now();
//        System.out.println(curlTime.format(
//                DateTimeFormatter
//                        .ofLocalizedDateTime(FormatStyle.SHORT)));
    }
}
