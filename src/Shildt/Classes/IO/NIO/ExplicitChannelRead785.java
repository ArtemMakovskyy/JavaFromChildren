package Shildt.Classes.IO.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead785 {
    public static void main(String[] args) {
//        try {
//            File f = new File("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test.txt");
//            f.createNewFile();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        int count;
        Path filePath = null;
        try {
//            получить путь к  файлу
            filePath = Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path  Error " + e);
            return;
        }
//        затем  получить канал к  этому файлу в
//        Олоке оператора try  с ресурсами
        try (SeekableByteChannel fChan = Files.newByteChannel(filePath)) {
//            выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
//                читать данные из файла в  Оуфер
                count = fChan.read(mBuf);
//                прекратить чтение по достижении конца файла
                if (count != -1) {
//                    подготовить Оуфер к  чтению из него данных
                    mBuf.rewind();
//                    читать байты данных из буфера и выводить их на экран как символы
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);
            System.out.println("\nend");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
