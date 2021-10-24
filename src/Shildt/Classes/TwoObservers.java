package Shildt.Classes;

import java.util.Observable;
import java.util.Observer;

class Watcher1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Метод  update () вызван, отсчет count равен " + ((Integer) arg).intValue());
    }
}

class Watcher2 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
//        по  окончании выдать  звуковой сигнал
        if (((Integer) arg).intValue() == 0) System.out.println("Готово" + '\7');
    }
}
class BeingWatched2 extends Observable{
    void coutChanges(int setCount){
        for (; setCount >= 0; --setCount) {
            setChanged();
            notifyObservers(setCount);
        }
    }
}

public class TwoObservers {
    public static void main(String[] args) {
        BeingWatched2 bw2 = new BeingWatched2();
        Watcher1 w1 = new Watcher1();
        Watcher2 w2 = new Watcher2();
        bw2.addObserver(w1);
        bw2.addObserver(w2);
        bw2.coutChanges(5);

    }
}
