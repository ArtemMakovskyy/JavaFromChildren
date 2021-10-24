package Shildt.Classes.IO.NIO;
//https://www.youtube.com/watch?v=VBpAdF3JATE&t=1003s

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//class MyFileVisitor extends SimpleFileVisitor<Path>{
//
//        }
class TestObjectFile {
    void Obj_1_File() {
        File file = new File("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\exapmles\\test.txt");
        System.out.println(file.exists());
        if (file.exists()) {
            try {
                System.out.println(file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void Obj_2_FilesAndPath() throws IOException {
        Path path;
        Files files;
        File file = new File("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\exapmles\\test.txt");
        path = Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\exapmles\\test.txt");
        path = file.toPath();

        Files.copy(Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src" +
                "\\Shildt\\Classes\\IO\\NIO\\exapmles\\test.txt"), Paths.get("C:\\Users\\Artem" +
                "\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO" +
                "\\exapmles\\test2.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.move(Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src" +
//                "\\Shildt\\Classes\\IO\\NIO\\exapmles\\testFile.txt"),Paths.get("C:\\Users\\Artem" +
//                "\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO" +
//                "\\exapmles\\testFile__.txt"), StandardCopyOption.REPLACE_EXISTING);
    }

    void Obj_3_Atributes() throws IOException {
        Path path = Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test.txt").toAbsolutePath();
        System.out.println(Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS));
        //        attributes. после точки смотреть атрибуты
//        BasicFileAttributes attributes = Files.readAttributes(path,BasicFileAttributes.class,LinkOption.NOFOLLOW_LINKS);
//        PosixFileAttributes posixFileAttributes = Files.readAttributes(path,PosixFileAttributes.class,LinkOption.NOFOLLOW_LINKS);

        byte[] b = Files.readAllBytes(path);
        for (byte bt : b) System.out.print((char) bt);
//        Files.write(path,"bla".getBytes());  // можем напрямую писать байты в файл без стримов
    }

    void Obj_4_ArraysRead() throws IOException {
        Path path = Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test3.txt").toAbsolutePath();
        List<String> list = Files.readAllLines(Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test.txt"));
        for (String s : list) System.out.println(s);

        List<String> list2 = new ArrayList<>();
        list2.add("Artem ");
        list2.add("Makovskyy ");
        list2.add("\n W");
        list2.add("\n END");
        Files.write(path, list2);
    }

    void Obj_5_Strem() throws IOException {
        Path path = Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test4.txt").toAbsolutePath();
        InputStream inputStream = Files.newInputStream(path);
        OutputStream outputStream = Files.newOutputStream(path);
        Reader reader = Files.newBufferedReader(path);
        Writer writer = Files.newBufferedWriter(path);
    }

    void Obj_6_Directory() throws IOException {
        Path path = Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test4.txt");
        try (DirectoryStream<Path> entries = Files.newDirectoryStream(Paths.get("."))) {
            for (Path path1 : entries) {
                System.out.println(path1.getFileName());
            }
        }
    }

    void Obj_7_Directory() throws IOException {
        Path path = Paths.get("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\test4.txt");
//    Files.walkFileTree(Paths.get("."),new HashSet<FileVisitOption>(),1,new io.MyFileVisitor());
    Files.walkFileTree(Paths.get("."),new MyFileVisitor());

    }
}

public class FilesMethods {
    public static void main(String[] args) throws IOException {
        TestObjectFile of = new TestObjectFile();
//        of.Obj_1_File();
//        of.Obj_2_FilesAndPath();
//        of.Obj_3_Atributes();
//        of.Obj_4_ArraysRead();
//        of.Obj_5_Strem();
//        of.Obj_6_Directory();

    }
}
