package Shildt.Paralelizm.Exchanger;

import javaForChildren.HomeWork.Run;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<String>();
        new UseString(exgr);
        new MakeString(exgr);

    }
}

class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> c) {
        this.ex = c;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            //заполнить буфер
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
                try {
                    str = ex.exchange(str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> c) {
        this.ex = c;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.println("Получено  " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}