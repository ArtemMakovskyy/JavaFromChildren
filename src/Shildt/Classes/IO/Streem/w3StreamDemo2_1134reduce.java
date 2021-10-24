package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.Optional;

public class w3StreamDemo2_1134reduce {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Иcxoдный список: " + myList);
//        https://www.youtube.com/watch?v=C6yYDfDqSJg
        int date = myList.stream().reduce((a, b) -> (a * b)).get();
        Optional date2 = myList.stream().reduce((a, b) -> (a * b));
        Optional<Integer> date2_1 = myList.stream().reduce((a, b) -> (a * b));
        Object date3 = myList.stream().reduce((a, b) -> (a * b));


        // ==============================================

        Optional<Integer> optionalInteger = myList.stream().reduce((a, b) -> (a * b));
        if (optionalInteger.isPresent()) System.out.println("Пpoизвeдeниe в виде объекта " +
                "типа Optional: " + optionalInteger.get());

        int sum = myList.stream().reduce(1, (a, b) -> (b * a));
        System.out.println(sum);

        int reduce = myList.stream().reduce(1, (a, b) -> {
           if (b % 2 == 0) return (a * b);
            return (a);
        });
        System.out.println(reduce+"!");

       // ==============================================

        Optional op = myList.parallelStream().reduce((a, b) -> (b * a));
        System.out.println(op);

        Optional op2 = myList.stream().parallel().reduce((a, b) -> (b * a));
        System.out.println(op2);

        // можно организовать в параллельном потоке данных следующим образом:
        int reduce1 = myList.parallelStream().reduce(1, (a, b) -> (a * b), (a, b) -> (a * b));
        System.out.println(reduce1);


    }
}
