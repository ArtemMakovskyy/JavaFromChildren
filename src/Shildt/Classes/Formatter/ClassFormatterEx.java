package Shildt.Classes.Formatter;

import java.util.Formatter;

//P682
public class ClassFormatterEx {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("Форматировать %s очень просто: %d %f",
                "средствами Java", 10, 98.6);
        System.out.println(fmt);
        String s = fmt.toString();
        fmt.close();
        /** ================================================ */
        Formatter fmt2 = new Formatter();
        for (double i = 1.23; i < 1.0e+6; i =+ 100) {
            fmt2.format("%f %e", i, i);
            System.out.println(fmt2);
        }
        fmt2.close();

    }
}
