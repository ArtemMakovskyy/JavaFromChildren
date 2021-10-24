package Alishev.java.Lesson33GEnPar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");//1
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);
//////////////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");//1
        animals2.add("frog");

        String animlas2 = animals2.get(1);
        System.out.println(animlas2);
    }
}
