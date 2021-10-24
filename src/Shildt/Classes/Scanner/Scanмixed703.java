package Shildt.Classes.Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scanмixed703 {
    public static void main(String[] args) throws IOException {
        int i;
        double d;
        boolean b;
        String str;

        FileWriter fw = new FileWriter("test.txt");
        fw.write("Tecтиpoвaниe Scanner 10 12,2 один true два false");
        fw.close();

        Scanner src = new Scanner(new FileReader("test.txt"));
        while (src.hasNext()) {
            if (src.hasNextInt()) {
                i = src.nextInt();
                System.out.println("int  = " + i);
            } else if (src.hasNextDouble()) {
                d = src.nextDouble();
                System.out.println("double = " + d);

            } else if (src.hasNextBoolean()) {
                b = src.nextBoolean();
                System.out.println("bool = " + b);
            } else {
                str = src.next();
                System.out.println("String = " + str);
            }
        }
        src.close();
    }
}
