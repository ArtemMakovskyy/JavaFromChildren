package Shildt.WorkinLan22P811.WorkJava;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class _177Connect {
    public static void main(String[] args) {
        try (Socket socket = new Socket()){
            socket.connect(new InetSocketAddress("localhost",8189),2000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
