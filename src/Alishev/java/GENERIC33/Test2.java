package Alishev.java.GENERIC33;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<ANimal2> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new ANimal2(1));
        listOfAnimals.add(new ANimal2(2));

        test(listOfAnimals);
    }

    private static void test(List<ANimal2> list) {
        for (ANimal2 animal : list) {
            System.out.println(animal);
        }
    }
}
