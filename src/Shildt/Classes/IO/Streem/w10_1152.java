package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.stream.Stream;

public class w10_1152 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бeтa");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");
        Stream<String>stream_myList = myList.stream();

    }
}
