package Shildt.Classes.Formatter;

import java.util.Formatter;

//P 687//
public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("Копирование файла%nПередача завершена на %d%%", 88);
        System.out.println(fmt);
        fmt.close();

//        Копирование файла
//        Передача завершена на 88%

        Formatter fmt2 = new Formatter();
        fmt2.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
        System.out.println(fmt2);
        fmt2.close();

//|10,123450|
//|   10,123450|
//|00010,123450|

        Formatter fmt3;

        for (int i = 1; i <= 10; i++) {
            fmt3 = new Formatter();
            fmt3.format("%4d %4d %4d", i, i * i, i * i * i);
            System.out.println(fmt3);
            fmt3.close();
        }
//        1    1    1
//        2    4    8
//        3    9   27
//        4   16   64
//        5   25  125
//        6   36  216
//        7   49  343
//        8   64  512
//        9   81  729
//        10  100 1000

        // Выравнивание выводимых данных p 691
//        выровнять по правому краю (по  умолчанию)
//        fmt. format (" |%10.2f| ", 123 .123);

//        а  теперь выровнять  по левому краю
//        fmt. format("|%-10.2f|",   123.123);

//        fmt. format ("%  d",   -100) ;
//        -100
//
//        fmt. format ("%  d",   100);
//        100
//
//        fmt . format (   "%+d",   100) ;
//        +100

//        fmt . forma t ("%(d", 100) ;
//        -100


//        Признак запятой
//        fmt. format("%,.2f", 4356783497.34) ;
//        4, 356, 783, 497. 34 - читабельносьт

        // з 693 Применение индекса аргумента

//        fmt. format ("%3$d %1$d %2$d", 10, 20,  30);
//     30    10    20
//        позволяет повторно использовать аргумент,
//        fmt.format("Чиcлo %d  в шестнадцатеричном формате равно %1$х",   255);
//        число 255 в  шестнадцатеричном формате равно ff





    }
}
