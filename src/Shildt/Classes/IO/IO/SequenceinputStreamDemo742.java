package Shildt.Classes.IO.IO;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}

public class SequenceinputStreamDemo742 {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement("src/Shildt/Classes/IO/IO/fos_file0.txt");
        files.addElement("src/Shildt/Classes/IO/IO/fos_file1.txt");
        files.addElement("src/Shildt/Classes/IO/IO/fos_file2.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try{
            while ((c = input.read()) != -1);
            System.out.println((char) c);
        } catch (IOException e) {
            System.err.println("!!!!!!!!!!!");
        }finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
