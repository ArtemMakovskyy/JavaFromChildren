package Shildt.Classes.Formatter;

import java.util.Formatter;

public class PrecisionDemo689 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
//        Формат  с двумя цифрами после десятичной  точки
        fmt.format("%.2f", 123.1234567);
        System.out.println(fmt);
        fmt.close();
//        Формат  с  двумя цифрами после десятичной точки в  поле из 16 символов
        Formatter fmt2 = new Formatter();
        fmt2.format("%16.2e", 123.1234567);
        System.out.println(fmt2);
        fmt2.close();

        Formatter fmt3 = new Formatter();
        fmt3.format("%.15s", "Форматировать в  Java теперь очень просто.");
        System.out.println(fmt3);
        fmt3.close();

        Formatter fmt4 = new Formatter();
        fmt4.format("%.4g",123.1234567 );
        System.out.println(fmt4);
        fmt4.close();

    }
}
