package Shildt.Classes.IO.NIO;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOStreamWrite795 {
    public static void main(String[] args) {
        String pathString = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test.txt";
//        открыть файл и  получить связанный  с  ним поток вывода
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get(pathString)))) {
//    вывести в  поток заданное количество байтов
            for (int i = 0; i < 26; i++) {
                fout.write((byte) ('A'+i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
