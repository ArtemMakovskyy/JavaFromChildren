package Shildt.Classes.IO.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyVisit extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file);
        return FileVisitResult.CONTINUE;
    }
}

public class DirTreeList_2 {
    public static void main(String[] args) {
        String strName = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\Scanner";
        Path pathName = Paths.get(strName);
try {
    Files.walkFileTree(pathName, new FileVisitor<Path>() {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println("preVisitDirectory " + dir);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            System.out.println("visitFile " + file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            System.out.println("visitFileFailed " + file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            System.out.println("postVisitDirectory " + dir + exc);
            return FileVisitResult.CONTINUE;
        }
    });
} catch (IOException e) {
    e.printStackTrace();
}

    }
}
