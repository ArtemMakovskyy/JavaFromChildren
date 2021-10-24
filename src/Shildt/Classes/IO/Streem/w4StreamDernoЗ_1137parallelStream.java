package Shildt.Classes.IO.Streem;

import java.util.ArrayList;

public class w4StreamDernoЗ_1137parallelStream {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.);
        myList.add(18.);
        myList.add(10.);
        myList.add(24.);
        myList.add(17.);
        myList.add(5.);
        myList.set(0,7.1);
        System.out.println("Иcxoдный список: " + myList);

        double productOfSqrRoots =
                myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);

        System.out.println(productOfSqrRoots);



    }
}
