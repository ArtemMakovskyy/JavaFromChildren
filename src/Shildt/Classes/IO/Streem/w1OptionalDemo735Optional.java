package Shildt.Classes.IO.Streem;

import java.util.Optional;

public class w1OptionalDemo735Optional {
    public static void main(String[] args) {
        // КАК СОЗДАТЬ Optional
        // это коллекция с одним значением либо ноль либо один
        Optional<String> noVal = Optional.empty(); //1
        Optional<String> hasVal = Optional.of("ABC"); //2
        Optional<String> optional = Optional.ofNullable("AB"); //3
        // whot we do from him?
        /**
         * .get
         * .is Present
         * .oreElse -получить елементы если ничего нету , что-то другое в качестве замены
         * афункции
         * predicat / filter predicat  obj::equals
         *
         */




        if (noVal.isPresent()) System.out.println("He подлежит выводу");
        else System.out.println("Oбъeкт noVal не содержит значение");

        if (hasVal.isPresent()) System.out.println(hasVal.get());
        else System.out.println("He подлежит выводу");

        String defStr = noVal.orElse("Cтpoкa по умолчанию");
        System.out.println(defStr);

        String onStr = hasVal.orElse("Cтpoкa по умолчанию");
        System.out.println(onStr);
        /**Аналогичным образом действуют классы OptionalDouЫe,
         * Optionalint и Opt i ona 1 Long, за исключением того, что
         * они специально предназначены для обработки значений типа douЬle,
         * int и long соответственно. И для этой цели вместо метода get ()
         * в них определены методы getAsDouЫe (), get As In t  ( ) и getAsLong ( )
         * соответственно. Но в то же время в них не поддержива­ются методы filter (),
         * ofNullaЫe (), map (), flatMap () или or ().
         */




    }
}
