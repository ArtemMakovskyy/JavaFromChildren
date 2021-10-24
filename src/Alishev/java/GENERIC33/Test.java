/**
 *
 * GENERICS Work 33
 */

package Alishev.java.GENERIC33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /////////java 5///////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");//1
        animals.add("frog");

        String animal = (String)animals.get(1);
        System.out.println(animal);

///////////// after ///dgenerics ////////
        List<String> animals2 = new ArrayList<String>();

        animals2.add("cat");//0
        animals2.add("dog");//1
        animals2.add("frog");

        String animal2 = animals2.get(0);
        System.out.println(animal2);
/////////////java 7//////////////
List<String>animals3 = new ArrayList<>();

    }
}
