package Shildt.Classes.IO.IO;

import java.io.File;

public class FileEX {
    public static void main(String[] args) {
//        File f = null;
//        boolean bool = false;
//
//        try {
//
//            // returns pathnames for files and directory
//            f = new File("C:/Texts/TutorialsPoint/Java");
//
//            // create directories
//            bool = f.mkdirs();
//
//            // print
//            System.out.print("Directory created? "+bool);
//
//        } catch(Exception e) {
//            // if any error occurs
//            e.printStackTrace();
//        }
        File f1 = new File("/d");
        System.out.println(f1.mkdirs());

        File f2 = new File("/dir2/dir1");
        boolean b2 = f2.mkdirs();
        System.out.println(b2);


    }
}
