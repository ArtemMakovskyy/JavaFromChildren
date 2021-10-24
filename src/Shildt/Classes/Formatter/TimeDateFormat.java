package Shildt.Classes.Formatter;

import java.util.Calendar;
import java.util.Formatter;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter fmt1 = new Formatter();
        Formatter fmt2 = new Formatter();
        Formatter fmt3 = new Formatter();
        Formatter fmt4 = new Formatter();
        Calendar cal = Calendar.getInstance();

//        вывести время в  стандартном 12-часовом формате
        System.out.println(fmt1.format("%tr", cal));
//        вывести  все сведения о  дате и  времени
        System.out.println(fmt2.format("%tc", cal));
//        вывести только часы и  минуты
        System.out.println(fmt3.format("%tl:%tM", cal,cal));
//        вывести  название и  номер месяца
        System.out.println(fmt4.format("%tB %tb %tm", cal, cal, cal));

        fmt1.close();
        fmt2.close();
        fmt3.close();
        fmt4.close();


    }
}
