package Alishev.java.Arrays;

public class ArraysString {
    public static void main(String[] args) {
        int[] nambers = new int[5];
        nambers[0] = 10;

        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "by";
        strings[2] = "olala";


        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string : strings) {        // присваи ваю имя переменной стринг: массив
            System.out.println(string);

        }
    }
}
