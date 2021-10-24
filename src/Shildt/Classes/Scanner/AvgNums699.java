package Shildt.Classes.Scanner;
//p 699
import java.util.Formatter;
import java.util.Scanner;

public class AvgNums699 {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            } else {
                String str = scanner.next();
                if (str.equals("ok")) break;
                else {
                    System.out.println("error formats of dates");
                    return;
                }
            }
        }
        scanner.close();
        Formatter frm = new Formatter();
        frm.format("%.2f",(sum/count));
        System.out.println("avareges =" + frm);
        frm.close();
    }
}
