package Alishev.java.Potoki;

public class Test {
    public static void main(String[] args) {
        MyTread myTread = new MyTread();
        myTread.start();

        MyTread2 myTread2 = new MyTread2();
        myTread2.start();

        System.out.println("++++");

    }
}

class MyTread extends Thread{
public void run(){
    for(int i =0;i<1000;i++){
        System.out.println(i+ "  Hello from MyTread  ");
    }
}
}

class MyTread2 extends Thread{
    public void run(){
        for(int i =0;i<1000;i++){
            System.out.println("Hello from MyTread  2  "+i);
        }
    }
}