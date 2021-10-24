package Shildt.Classes;

import java.util.Date;
import java.util.Optional;

public class OptionalDemo_P659 {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");
        if (noVal.isPresent()) System.out.println("He подлежит вы вод");
        else System.out.println("Oбъeкт noVal не содержит значение");
        if (hasVal.isPresent()) System.out.println("Объект hasVal содержит " +
                "следующую строку:   " + hasVal.get());
        String defStr = noVal.orElse("Cтpoкa по умолчанию");
        System.out.println(defStr);

        Date date = new Date();
        System.out.println(date);
//        вывести  количество миллисекунд,   прошедших
//        с 1 января 1970 г. по Гринвичу
        long msec = date.getTime();
        System.out.println(msec);
    }
}
