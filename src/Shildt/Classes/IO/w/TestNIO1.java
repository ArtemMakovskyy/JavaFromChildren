package Shildt.Classes.IO.w;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

class TetidNIOVars {
    String strUrl = "src/Shildt/Classes/IO/w/";

    void Start_1_bufferSeeck(String nameFile) throws IOException {
        Path path = Paths.get(strUrl + nameFile);

        SeekableByteChannel channelFile = Files.newByteChannel(path);
        ByteBuffer buffer = ByteBuffer.allocate(128);

        int count = 0;
        do {
            count = channelFile.read(buffer);
            buffer.rewind();
            for (int i = 0; i < count; i++) {
                System.out.print((char) buffer.get());
            }

        } while (count != -1);
        channelFile.close();
    }

    void Start_2_bufferSeeck(String nameFile) {

        Path path = Paths.get(strUrl + nameFile);
        int count;
        try (SeekableByteChannel FileChannel = Files.newByteChannel(path)) {
            ByteBuffer buffer = ByteBuffer.allocate(128);
            do {
                count = FileChannel.read(buffer);
                buffer.rewind();
                if (count != -1) {
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            } while (count != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void Start_3_bMappedByteBufferSeeck(String nameFile) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(strUrl + nameFile))) {
            MappedByteBuffer buffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());

            for (int i = 0; i < fileChannel.size(); i++) {
                System.out.print((char) buffer.get());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void Start_4_FileChannelWriteByBuffer(String nameFile) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(
                Paths.get(strUrl + nameFile), StandardOpenOption.WRITE, StandardOpenOption.CREATE
        )) {

            ByteBuffer buffer = ByteBuffer.allocate(25);

            for (int i = 0; i < buffer.capacity(); i++) {
                buffer.put((byte) ('A' + i));
            }

            buffer.flip();
            fileChannel.write(buffer);
            buffer.rewind();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void Start_5_FileChannelReadWriteByBuffer(String nameFile) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(
                Paths.get(strUrl + nameFile), StandardOpenOption.READ,
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {


            MappedByteBuffer buffer =
                    fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void Start_6_Copy(String nameFile, String copyName) {
        String[] paths = {strUrl + nameFile, strUrl + copyName};

        System.out.println(paths.length + " start");
        try {
            Path sources = Paths.get(paths[0]);
            Path target = Paths.get(paths[1]);
            Files.copy(sources, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    void Start_7_NIO2_ShowFile794(String readFile) {
        int i;
        try (InputStream fis = Files.newInputStream(Paths.get(strUrl + readFile), StandardOpenOption.READ)) {
            do {
                i = fis.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void Start_8_NIO2_StreamWrite(String writeFIle) {
        Path path = Paths.get(strUrl + writeFIle);
        try (OutputStream fos = new BufferedOutputStream(Files.newOutputStream(path))){

            for (int i = 0; i < 25; i++) {
                fos.write((byte) 'A' + i );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class TestNIO1 {
    public static void main(String[] args) throws IOException {
        TetidNIOVars start = new TetidNIOVars();
//        start.Start_2_bufferSeeck("NIO.txt");
//        start.Start_3_bMappedByteBufferSeeck("NIO.txt");
//        start.Start_4_FileChannelWriteByBuffer("NIO_Write.txt");
//        start.Start_5_FileChannelReadWriteByBuffer("NIO_Write2.txt");
//        start.Start_6_Copy("NIO_Write2.txt", "NIO_Write2_copy.txt");
//        start.Start_7_NIO2_ShowFile794("NIO.txt");
        start.Start_8_NIO2_StreamWrite("NIO2_writeFile.txt");

    }
}
