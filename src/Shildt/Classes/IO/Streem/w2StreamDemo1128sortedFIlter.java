package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class w2StreamDemo1128sortedFIlter {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Иcxoдный список: " + myList);
//        Получить поток элементов списочного массива
        Stream<Integer> myStreasm = myList.stream();
        Optional<Integer> minVal = myStreasm.min(Integer::compare);
        if (minVal.isPresent()) System.out.println("Минимальное значение: " + minVal.get());
//        непременно получить новый поток данных,

        myStreasm = myList.stream();
        Optional<Integer> maxVal = myStreasm.max(Integer::compare);
        if (maxVal.isPresent()) System.out.println("Максимальное значение: " + maxVal.get());

//        отсортировать поток данных, вызвав метод sorted()
        myStreasm = myList.stream().sorted();
        myStreasm.forEach(n -> System.out.print(n + " "));

//        вывести только нечетные целочисленные значения,вызвав метод filter()
        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> ((n % 2) == 1));
        System.out.print("\nHeчeтныe значения: ");
        oddVals.forEach(n -> System.out.print(n + " "));

        //        вывести только четные целочисленные значения,вызвав метод filter()

        Stream<Integer> fil0str = myList.stream().sorted().filter(n -> (n % 2) == 0);
        System.out.print("\nчeтныe значения: ");
        fil0str.forEach(n -> System.out.print(n + " "));

//        вывести только те нечетные целочисленные значения, которые больше 5.
        oddVals = myList.stream().filter(n -> (n % 2) == 1).filter(n -> (n > 5));
        System.out.print("\nHeчeтныe значения больше 5: ");
        oddVals.forEach(n -> System.out.print((n)+ " "));


    }
}
