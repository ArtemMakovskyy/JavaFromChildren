package LessonsJava;

public class Main {
    public static void main(String[] args) {
        new MyTread2().start();
        new MyTread2().start();
    }
}
class MyTread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread()+" i = "+i);
        }
    }
}