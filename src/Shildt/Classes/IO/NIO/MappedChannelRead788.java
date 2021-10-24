package Shildt.Classes.IO.NIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelRead788 {
    public static void main(String[] args) {
        String pathStr = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test.txt";
//        получить канал к  файлу в  блоке оператора try  с ресурсами
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(pathStr))){
//            получить размер файла
            long fileSize = fileChannel.size();
//            а  теперь сопоставить файл с  буфером
            MappedByteBuffer mBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY,0,fileSize);
//            читать байты из буфера и  выводить их  на экран
            for (int i = 0; i < fileSize; i++)
                System.out.print((char)mBuffer.get());
                System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nend");
    }
}
