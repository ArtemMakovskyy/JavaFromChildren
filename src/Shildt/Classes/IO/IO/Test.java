package Shildt.Classes.IO.IO;


import java.io.*;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
//        FileWriter fw1 = new FileWriter("file_1.txt");
//        FileWriter fw2 = new FileWriter("file_2.txt");
//        FileWriter fw3 = new FileWriter("file_3.txt");

//        String path = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\IO";
//        String source = "Now is the time for all good men\n"
//                + "  to соте to the aid of their country\n"
//                + "  and рау their due taxes.";
//        byte[] buffer = source.getBytes();
//        try (FileOutputStream fos0 = new FileOutputStream(path + "\\fos_file0.txt",true);
//             FileOutputStream fos1 = new FileOutputStream(path + "\\fos_file1.txt",true);
//             FileOutputStream fos2 = new FileOutputStream(path + "\\fos_file2.txt")) {
//            for (int i = 0; i < buffer.length; i += 2) {
//                fos0.write(buffer[i]);
//            }
//
//            fos1.write(buffer);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        String tmp = "abcdefghijklmnopqrstuvwxyz";
//        byte b[] = tmp.getBytes();
//        try (InputStream byteArIS1 = new ByteArrayInputStream(b);
//             InputStream byteArIS2 = new ByteArrayInputStream(b, 0, b.length / 2);) {
//
//            int c;
//            while ((c = byteArIS1.read()) != -1) {
//
//                System.out.print((char) c);
//            }
//            byteArIS1.reset();
//        }

//        ByteArrayOutputStream baOS = new ByteArrayOutputStream();
//        String s = "Эти  данные должны быть выведены в  массив";
//        byte buf [] = s.getBytes();
//        baOS.write(buf);
//
//
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\IO\\1.txt");
//baOS.writeTo(fos);


//        FileInputStream fis = new FileInputStream("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\IO\\fos_file1.txt");
//        BufferedInputStream bIS = new BufferedInputStream(fis);
//        System.out.println(bIS.available());
//        int c;
//        while ((c = bIS.read())!=-1){
//            System.out.print((char) c);
//        }
//
//        String s = "Это знак авторского права &сору; ";
//        byte [] buf = s.getBytes();
//        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
//
//        BufferedInputStream bisA = new BufferedInputStream(bais);


        FileInputStream fis1 = new FileInputStream("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\IO\\fos_file1.txt");
        FileInputStream fis2 = new FileInputStream("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\IO\\fos_file2.txt");
//        FileInputStream fis3 = new FileInputStream("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\IO\\fos_file3.txt");

        SequenceInputStream sec = new SequenceInputStream(fis1,fis2);

        for (int i = 0; i < sec.available(); i++) {
            System.out.print((char) sec.read());
        }



    }
}
