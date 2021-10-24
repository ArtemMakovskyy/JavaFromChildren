package Shildt.Classes.IO.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
//        получить канал к  файлу в  блоке оп ератора  try  с ресурсами
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("C:\\Users\\Artem\\Documents\\JavaFro" +
                                "mChildren\\src\\Shildt\\Classes\\IO\\NIO\\test.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE)) {
//            создать буфер
            ByteBuffer buffer = ByteBuffer.allocate(26);
            // записать некоторое количество байтов в  буфер
            for (int i = 0; i < 26; i++)
                buffer.put((byte) ('A' + i));
//                по дготовить буфер к  записи данных
                buffer.rewind();
//                записать данные из  буфера в  выходной файл
                fileChannel.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
