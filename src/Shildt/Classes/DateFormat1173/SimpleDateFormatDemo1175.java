package Shildt.Classes.DateFormat1173;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1175 {
    public static void main(String[] args) {
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
        Date date = new Date();
        SimpleDateFormat sdf;

        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date));

        sdf = new SimpleDateFormat("E YYYY:MM:dd hh:mm:ss");
        System.out.println(sdf.format(date));

    }
}
