package Shildt.Classes.IO.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputStreamDernoS730 {
    public static void main(String[] args) {
        int size;
//        Для автоматического закрытия потока ввода используется оператор try с  ресурсами
        try (FileInputStream fis = new FileInputStream("C:\\Users\\Artem\\Documents\\JavaFromChildren\\" +
                "src\\Shildt\\Classes\\IO\\IO\\FileinputStreamDernoS730.java")) {
            System.out.println("Oбщee  количество доступных байтов :" + (size = fis.available()));
            int n = size / 40;
            System.out.println(n+" =n");
            System.out.println("Пepвыe " + n + " байтов,   " + "прочитанных из файла по очереди  методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) fis.read());
            }
            System.out.println("\nBce еще  доступно :   " + fis.available());
            System.out.println("Чтeниe следующих " + n + " байтов по очереди  методом  read( b[])");
            byte b[] = new byte[n];
            if (fis.read(b) != n) {
                System.err.println("Нельзя прочитать " + n + " байтов.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nBce еще  доступно:  " + (size = fis.available()));
            System.out.println("Пропустить половину оставшихся байтов методом skip ()");
            fis.skip(size / 2);
            System.out.println("Bce еще  доступно " + fis.available());
            System.out.println("Чтeниe " + n / 2 + " байтов,   размещаемых в  конце массива");
            if (fis.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("Нельзя прочитать " + n / 2 + "байтов.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nBce еще  доступно :   " + fis.available());


        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода:   " + e);
        }


    }
}
