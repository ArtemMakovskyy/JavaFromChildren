package Shildt.Classes.IO.NIO.FileVisitor;
/**
 * https://habr.com/ru/post/437694/
 */

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class TREEFVR {
    public static void main(String[] args) {
        String dir = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO";
        String file = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\w\\NIO2_writeFile.txt";
        String partOfName = "*.*";
        String partOfContent = "*.*";

        try {
            Files.walkFileTree(Paths.get(dir), new FileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    return FileVisitResult.CONTINUE;
//                    CONTINUE — продолжает обход дерева;
//                    TERMINATE — заканчивает обход дерева;
//                    SKIP_SUBTREE — продолжает обход, без захода в данную директорию;
//                    SKIP_SIBLINGS — исключает из обхода «родственников» данного файла или директории;


                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                    System.out.println(fileNAme);
                    boolean containsName = true;
                    if (partOfName != null && !file.getFileName().toString().contains(partOfName))
                        containsName = false;

                    String content = new String(Files.readAllBytes(file));
                    boolean containsContent = true;
                    if (partOfContent != null && !content.contains(partOfContent))
                        containsContent = false;

                    if (containsName && containsContent)
                        System.out.println(file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path fileNAme, IOException exc) throws IOException {
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
