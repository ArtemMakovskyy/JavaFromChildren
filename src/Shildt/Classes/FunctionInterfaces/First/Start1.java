package Shildt.Classes.FunctionInterfaces.First;

import java.io.File;
import java.io.FileFilter;

public class Start1 {
    public static void main(String[] args) {
        File src = new File(".");
        File[] files = src.listFiles(pathname -> pathname.isDirectory());
        for (File f: files){
            System.out.println(f.getName());
        }


    }
}
