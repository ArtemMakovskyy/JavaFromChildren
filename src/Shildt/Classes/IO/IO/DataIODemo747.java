package Shildt.Classes.IO.IO;

import java.io.*;

public class DataIODemo747 {
    public static void main(String[] args) {
//        сначала вывести данные в  файл
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("src/Shildt/Classes/IO/IO/Test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        а  теперь ввести данные из файла
        try (DataInputStream din = new DataInputStream(new FileInputStream("src/Shildt/Classes/IO/IO/Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Пoлyчaeмыe значения :  " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
