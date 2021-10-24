package Shildt.Classes.Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class AvgFile701 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0;

        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("2,5 3,5 5,4 6 7 9 10 ok");
        fileWriter.close();

        FileReader fr = new FileReader("test.txt");

        Scanner scanner = new Scanner(fr);

        while (scanner.hasNextDouble()){
            if(scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count++;
            }else {
                String str = scanner.next();
                if(str.equals("ok"))break;
                else {
                    System.out.println("err");
                    return;
                }
            }
        }
        scanner.close();
        System.out.println(sum);

    }
}
