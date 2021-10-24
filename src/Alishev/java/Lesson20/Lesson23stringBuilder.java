package Alishev.java.Lesson20;

import java.util.Locale;

public class Lesson23stringBuilder {
    public static void main(String[] args) {
        String x = new String("Hello");
        String y = "Hi";
        System.out.println(x.toUpperCase());
        System.out.println(x);
        x=x.toUpperCase();
        System.out.println(x);

        String st1 = "Hello";
        String st2 = " my";
        String st3 = " frend";
        String st4 = st1+st2+st3;
        System.out.println(st4);

        System.out.println();
        StringBuilder sb = new StringBuilder("Ok");

        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder("Hi");
        sb2.append(" my").append(" dirling").append(" friend!");
        System.out.println(sb2.toString());
        System.out.println();

        System.out.printf("This is a string, %s\n","olala" );
        System.out.printf("This is a string, %d\n", 10);
        System.out.printf("%f This is %s a string, %d\n", 10.4,"NEW TEXT",500);
        System.out.printf("Stringg %10d\n",532); // ширина строки 10
        System.out.printf("Stringg %.2f\n",532.554654654); // знаки после запятой в в ещественном числе
        System.out.printf("Stringg %.2f\n",532.1);
        System.out.printf("Stringg %-10.2f\n",532.1);
        System.out.printf("Stringg %-10.2f\n",5546532.1654654);
        System.out.printf("Stringg %10.2f\n",32.1654654);
    }
}
