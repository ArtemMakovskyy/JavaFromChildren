package Shildt.Classes.IO.NIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo797 {
    public static void main(String[] args) {
        Path filePath = Paths.get("src\\Shildt\\Classes\\IO\\NIO\\exapmles\\test2.txt");
        System.out.println("Имя  файла: " + filePath.getName(1));
        System.out.println("Пyть к  файлу: " + filePath);
        System.out.println("AOcoлютный  путь к  файлу: " + filePath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filePath.getParent());
        if (Files.exists(filePath)) System.out.println("Фaйл существует");
        else System.out.println("Фaйл не существует");
        try {
            if (Files.isHidden(filePath)) System.out.println( "Фaйл скрыт");
            else System.out.println( "Фaйл не скрыт");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Files.isWritable(filePath);
        System.out.println( "Фaйл доступен для записи");
        Files.isReadable(filePath);
        System.out.println( "Фaйл доступен для чтения");

        try {
            BasicFileAttributes attributes = Files.readAttributes(filePath,BasicFileAttributes.class);

            if(attributes.isDirectory()) System.out.println("Этo каталог");
            else System.out.println("не каталог");

            if(attributes.isRegularFile()) System.out.println("Этo оОычный файл");
            else System.out.println("Этo не обычный файл");

            if(attributes.isSymbolicLink()) System.out.println("Этo символическая ссылка");
            else System.out.println("Этo не символическая ссылка");

            System.out.println("Bpeмя  последней модификации файла: " + attributes.lastAccessTime());
            System.out.println("Paэмep файла: " + attributes.size() + " байтов ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
