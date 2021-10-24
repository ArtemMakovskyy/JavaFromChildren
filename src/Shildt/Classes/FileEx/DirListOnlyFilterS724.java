package Shildt.Classes.FileEx;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class OnlyExt implements FilenameFilter{
String ext;

    public OnlyExt(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

public class DirListOnlyFilterS724 {
    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=VBpAdF3JATE
        Path path;
        Files files;


        path = Paths.get("testFile.txt").toAbsolutePath();
        System.out.println(path);

        String dirName = "C:\\Users\\Artem\\Documents\\JavaFromChildren";
        File f1 = new File(dirName);
        FilenameFilter onlyFiles = new OnlyExt("txt");
        String s [] = f1.list(onlyFiles);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }



    }
}
