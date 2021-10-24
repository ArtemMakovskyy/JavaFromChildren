package Shildt.Classes.IO.NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList799 {
    public static void main(String[] args) {
        String dirname = "src/Shildt/Classes/IO/NIO";
//        получить и  обработать поток ввода каталога
//        в  блоке оператора try
        try (DirectoryStream<Path> dirstream = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Kaтaлoг " + dirname);
//            Класс DirectoryStreaш реализует  интерфейс IteraЫe
//            поэтому для вывода содержимого каталога можно
//            организовать цикл for в  стиле for each
            for (Path p : dirstream) {
                BasicFileAttributes attribs =
                        Files.readAttributes(p, BasicFileAttributes.class);
                if(attribs.isDirectory()) System.out.println("<DIR>  ");
                else System.out.print(" не каталог  ");
                System.out.println(p.getName(1));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
