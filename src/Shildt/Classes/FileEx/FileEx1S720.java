package Shildt.Classes.FileEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

class OtherVars {
    void construktorFile() {
        //создается в каталоге, указываемом в качестве
        // единственного аргумента конструктора;
        File f1 = new File("/");

        //второй объект - с   указанием пути и имени файла в
        // качестве двух аргументов конструктора
        File f2 = new File("/", "autoexec.bat");

        //третий объект - с   указанием пути, присваиваемому
        // переменной fl, а также имени файла, причем переменная fЗ
        // ссылается на тот же самый объект типа File, обозначающий
        // файл, что и переменная f2.
        File f3 = new File("f1", "autoexec.bat");
    }

    void scanAndFileWriterAndReader() throws IOException {
        FileWriter fw = new FileWriter("COPYRIGHT");
        fw.write("Проверка текста");
        fw.close();

//        FileReader fr = new FileReader("fw.txt");
//        Scanner sc = new Scanner(fr);
//        String st = sc.next();
//        System.out.println(st);
    }

    void fileDemoS720() {

    }
}

public class FileEx1S720 {
    static void prn(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException {
        OtherVars otherVars = new OtherVars();
//        otherVars.scanAndFileWriterAndReader();
        FileWriter fw = new FileWriter("Files\\COPYRIGHT");
        File f1 = new File("Files\\COPYRIGHT");
        prn("Имя  файла:  " + f1.getName());
        prn("Путь:  " + f1.getPath());
        prn("Абсолютный путь:  " + f1.getAbsolutePath());
        prn("Родительский каталог:  " + f1.getParent());
        prn((f1.exists() ? "существует" :   "не существует"));
        prn(f1.canWrite() ? "доступен для записи" : "не  доступен для записи");
        prn(f1.canRead() ? "доступен для чтения" : "не  доступен для чтения");
        prn(f1.isDirectory() ? "является каталогом" : "не является каталогом");
        prn(f1.isFile() ? "является обычным  файлом"   : "может  быть именованным каналом");
        prn(f1.isAbsolute() ? "является абсолютным" : "не  является абсолютным");
        prn("Последнее изменение в  файле :  " + f1.lastModified());
        prn("Размер:  " + f1.length()+ " байт" );
        f1.renameTo(new File("Files\\COPYRIGHT.txt"));
        System.out.println(f1.delete());


    }
}
