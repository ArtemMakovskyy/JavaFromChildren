package Shildt.Classes.IO.NIO.FileVisitor;
//https://spec-zone.ru/RU/Java/Tutorials/essential/io/walk.html


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class MyFileVisitor_visitFile extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult postVisitDirectorye(Path dir, IOException exc) {
        System.out.format("Directory: %s%n", dir);
        return FileVisitResult.CONTINUE;
    }
}

class MyFileVisitor_visitFile2 extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link: %s ", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular file: %s ", file);
        } else {
            System.out.format("Other: %s ", file);
        }
        System.out.println("(" + attr.size() + "bytes)");
        return FileVisitResult.CONTINUE;
    }
}
class MyFileVisitor_postVisitDirectory extends SimpleFileVisitor<Path> {
    public FileVisitResult postVisitDirectorye(Path dir, IOException exc) {
        System.out.format("Directory: %s%n", dir);
        return FileVisitResult.CONTINUE;
    }
}








public class TRREE2 {
    public static void main(String[] args) {
        String dirName = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\NIO\\exapmles";
        System.out.println("Дepeвo  каталогов, начиная с  каталога: \n" + dirName + ":\n         Пути к файлам: ");
        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor_visitFile2());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
