package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class w5StreamDemo4_1139map {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.);
        myList.add(18.);
        myList.add(10.);
        myList.add(24.);
        myList.add(17.);
        myList.add(5.);
//        Отобразить квадратные корни элементов из списка myList на новый поток данных

        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));

//        получить произведение квадратных корней
        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> (a * b));
        System.out.println("Пpoизвeдeниe квадратных корней равно  " + productOfSqrRoots);
//=============================
// https://www.youtube.com/watch?v=oTdm_CVIdJM&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=30

        for (int i = 0; i < myList.size(); i++) {
            myList.set(i, myList.get(i) + 1);
        }
        System.out.println(myList);

        Stream<Double> streemD = myList.stream().map(a -> (a + 2));
        ArrayList<Double> al = (ArrayList<Double>) streemD.collect(Collectors.toList());
        System.out.println(al + "al");
        // v2
        ArrayList<Double> al2 = (ArrayList<Double>) myList.stream().map(a -> (a + 1))
                .collect(Collectors.toList());
        System.out.println(al2);
///////
        int[] array = {4, 3, 2, 5, -4, 4};
        Arrays.stream(array).map(a -> a + 3);

        int[] array3;
        int[] array2 = {4, 3, 2, 6, -4, 4};
        array3 = Arrays.stream(array2).map(a -> {
            if (a % 3 == 0) {
                a = a / 3;
            } else a = a;
            return a;
        }).toArray();

        for (int i: array3){
            System.out.print(i+" " );
        }
        System.out.println(Arrays.toString(array3));



    }
}
