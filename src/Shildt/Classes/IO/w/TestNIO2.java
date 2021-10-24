package Shildt.Classes.IO.w;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyVisitors extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}

class NIO2START {
    String strUrl = "src/Shildt/Classes/IO/w/";

    void N2_1_PathFile(String name_file) {
        Path filePath = Paths.get(strUrl + name_file);
        System.out.println("Получение сведений о пути к файnу и самом файле");
        System.out.println(
                filePath.getName(1) + " \n " +
                        filePath.getParent() + " \n " +
                        filePath.getNameCount() + " \n " +
                        Files.isWritable(filePath) + " \n " +
                        Files.isDirectory(filePath));

        try {
            BasicFileAttributes attributes =
                    Files.readAttributes(filePath, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);

            System.out.println(attributes.isDirectory() + " \n " +
                    attributes.isRegularFile() + " \n " +
                    attributes.isSymbolicLink() + " \n " +
                    attributes.lastModifiedTime() + " \n " +
                    attributes.lastAccessTime() + " \n " +
                    attributes.size());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void N2_2_DirList() {
        Path dir = Paths.get(strUrl);

        try (DirectoryStream<Path> directoryStream =
                     Files.newDirectoryStream(dir)) {
            System.out.println("Получение содержимого каталога \n" +
                    "Kaтaлoг " + dir);
            for (Path inf_dir : directoryStream) {
                BasicFileAttributes attributes =
                        Files.readAttributes(inf_dir, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
                if (attributes.isDirectory()) {
                    System.out.println("dir");
                } else System.out.println("not dir");
                System.out.println(inf_dir.getName(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void N2_3_DirListFilter() {
        Path dir = Paths.get(strUrl);
        DirectoryStream.Filter<Path> how =
                new DirectoryStream.Filter<Path>() {
                    @Override
                    public boolean accept(Path filename) throws IOException {
                        if (Files.isWritable(filename)) return true;
                        return false;
                    }
                };


        try (DirectoryStream<Path> directoryStream =
                     Files.newDirectoryStream(dir, how)) {
            System.out.println("Получение содержимого каталога \n" +
                    "Kaтaлoг " + dir);
            for (Path inf_dir : directoryStream) {
                BasicFileAttributes attributes =
                        Files.readAttributes(inf_dir, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
                if (attributes.isDirectory()) {
                    System.out.println("dir");
                } else System.out.println("not dir");
                System.out.println(inf_dir.getName(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void N2_4_DirsFiles() {
        String dir = "C:\\test";
        System.out.println("Дepeвo  каталогов, начиная с  каталога: " + dir + "\n");
try {
    Files.walkFileTree(Paths.get(strUrl), new MyVisitors());
} catch (IOException e) {
    e.printStackTrace();
}

    }
}

public class TestNIO2 {
    public static void main(String[] args) {
        NIO2START start = new NIO2START();
//        start.N2_1_PathFile("NIO_Write.txt");
//        start.N2_2_DirList();
//        start.N2_3_DirListFilter();
        start.N2_4_DirsFiles();
    }
}

