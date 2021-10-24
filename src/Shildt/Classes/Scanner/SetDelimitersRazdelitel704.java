package Shildt.Classes.Scanner;
//з744
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SetDelimitersRazdelitel704 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0;

        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("2.3,4.5.6.7,4.9,1.10,5.ok");
        fileWriter.close();

        FileReader fr = new FileReader("test.txt");

        Scanner scanner = new Scanner(fr);
        scanner.useDelimiter(".*"); // устанавливаем разделитель

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
