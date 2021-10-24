package Shildt.PART2.S370ReadingFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestShowFil2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        InputStreamReader isr = null;
        String path = "D:\\1.txt";


//        if (args.length != 1) {
//            System.out.println("Иcпoльзoвaниe:  ShowFile имя_файла");
//            return;
//        }

        try {
            fin = new FileInputStream(path);
            isr = new InputStreamReader(fin);
        } catch (FileNotFoundException e) {
            System.out.println("Heвoзмoжнo  открыть файл");
            return;
        }
        try {
            do {
                i = isr.read();
                if (i != -1) ;
                System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Oшибкa чтения из файла");
        } finally {
            try {
              if(fin!=null)  fin.close();
            } catch (IOException e) {
                System.out.println("Oшибкa закрытия файла");
            }
        }
    }
}
