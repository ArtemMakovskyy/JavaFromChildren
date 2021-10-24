package Shildt.Classes.DateFormat1173;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo1172 {
    public static void main(String[] args) {
        Date date = new Date() ;
        DateFormat df;
        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("date- "+ date);
        System.out.println("Япoния: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
        System.out.println("ENGLISH: " + df.format(date));
        /**
         * Метод getTimelnstance () возвращает экземпляр класса DateFormat,
         * способный форматировать сведения о времени. Параметр стиль может
         * принимать значение одной из следующих констант:
         * DEFAULT, SHORT, MEDIUM, LONG и FULL
         */
        System.out.println();
        /**
         * m Минуты (0-59)
         * s Секунды (0-59)
         * w Неделя в году (1-52)
         * у Год
         * z Часовой пояс
         * D День в году (1-366)
         * d день месяца
         * Е День недели (например, четверг)
         * F День недели в месяце
         * G Эра (АО -после Рождества Христова, или наша эра, ВС -до Рождества Христова, или до нашей эры)
         * Н Часы в сутках (0-23)
         * К Часы в формате АМ/РМ (0-11)
         * M Месяц
         * S Миллисекунды в секунде
         * W Неделя в месяце (1-5)
         * Х Часовой пояс в формате по стандарту ISO 8601
         * У Неделя в году
         * Z Часовой пояс в формате по стандарту RFC 822
         */
        Date date2 = new Date();
        SimpleDateFormat sdf;

        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date2));

        sdf = new SimpleDateFormat("E YYYY:MM:dd hh:mm:ss");
        System.out.println(sdf.format(date2));

        System.out.println();//1178
        LocalDate curDate = LocalDate.now();

        System.out.println("LocalDate "+curDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime "+localTime);

        System.out.println();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime "+localDateTime);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

        System.out.println();
        long l = System.nanoTime();
        System.out.println(l);
;

    }
}
