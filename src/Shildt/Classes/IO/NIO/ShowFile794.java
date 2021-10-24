package Shildt.Classes.IO.NIO;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShowFile794 {
    public static void main(String[] args) {
        int i;
//        сначала удостовериться, что указано имя файла
        if(args.length !=1){
            System.out.println("Пpимeнeниe :   Show  File имя_файла");
            return;
        }
//        открыть  файл и  получить связанный  с  ним поток ввода-вывода

        try (InputStream fin = Files.newInputStream(Paths.get(args[0]))){
            do {
                i = fin.read();
                if( i != -1) System.out.println((char) i);

            }while (i != -1);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
