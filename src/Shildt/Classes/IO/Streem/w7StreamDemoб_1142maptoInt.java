package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class w7StreamDemoб_1142maptoInt {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.1);
        myList.add(18.1);
        myList.add(10.1);
        myList.add(24.2);
        myList.add(17.3);
        myList.add(5.7);
        System.out.println("Иcxoдныe значения из списка myList: ");
        myList.forEach(a-> System.out.print(a+", "));
        System.out.println();
        //Отобразить максимально допустимый предел каждого значения
        // из списка myList на поток  данных типа IntStream
        IntStream cStrm  = myList.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.println("Maкcимaльнo допустимые пределы " + " значений из списка myList: ");
        cStrm.forEach(a-> System.out.print(a+", "));

    }
}
