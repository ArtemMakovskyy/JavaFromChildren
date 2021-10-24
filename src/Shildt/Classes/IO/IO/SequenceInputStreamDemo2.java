package Shildt.Classes.IO.IO;
//https://www.youtube.com/watch?v=dcouDHjI_I4

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

class SequenceEnumeration implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public SequenceEnumeration(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement());
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}

public class SequenceInputStreamDemo2 {
    private Vector<String> files;
    private StringBuilder sb = new StringBuilder();

    public SequenceInputStreamDemo2(Vector<String> files) {
        this.files = files;
    }

    public void read() {
        try (InputStream in = new SequenceInputStream(new SequenceEnumeration(files))) {
            int data;
            while ((data = in.read()) != -1) {
                sb.append((char) data);
            }

            String result = new String(sb);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Vector<String> files = new Vector<>();
        files.add("src/Shildt/Classes/IO/IO/fos_file0.txt");
        files.add("src/Shildt/Classes/IO/IO/fos_file1.txt");
        files.add("src/Shildt/Classes/IO/IO/fos_file2.txt");
        SequenceInputStreamDemo2 input = new SequenceInputStreamDemo2(files);
        input.read();

    }
}





