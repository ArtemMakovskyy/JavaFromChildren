package Shildt.Classes.FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirListKATALOGI {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("testFile.txt");
        String dirName = "C:\\Users\\Artem\\Documents\\JavaFromChildren";
        File f1 = new File(dirName);
        if (f1.isDirectory()) {
            System.out.println("Kaтaлoг " + dirName);
            String s[] = f1.list();

            System.out.println(dirName+"\\"+s[1]+"!!!!!!!!!!!");
            System.out.println(s[1]+"!!!!!!!!!!!");
            System.out.println();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName + "\\" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " является каталогом");
                } else {
                    System.out.println(s[i] + " является файлом");
                }
            }
        } else {
            System.out.println(dirName + "-- не является каталогом");
        }
        System.out.println("============");
        System.out.println(f1.isDirectory());



    }
}
