package Shildt.Classes.IO.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path>{
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) {

        System.out.println(path);

        return FileVisitResult.CONTINUE;
    }
}
public class DirTreeList803 {
    public static void main(String[] args) {
        String dirName = "C:\\test";
        System.out.println("Дepeвo  каталогов, начиная с  каталога " + dirName + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
