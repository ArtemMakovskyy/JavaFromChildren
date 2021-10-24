package Shildt.Classes;
// p 674

import java.lang.annotation.Target;
import java.util.Observable;
import java.util.Observer;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

/**
 * Класс ObservaЫe служит для создания подклассов, за которыми могуг наблюдать программы
 * Наблюдаемый объект должен следовать двум простым правилам
 * 1) eсли он  изменяется,  то  должен вызывать метод setChanged ()*
 * 2) когда он готов известить наблюдателей об этом изменении, то должен вызвать метод notifyObservers ()
 * это вынуждает наблюдающий объект (или объекты) вызывать метод update ().
 */
//Observer,- Наблюдающие классы  котором определен метод update ( )
@Target(value = {CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
@interface Anno {
    String s() default "";
}

@Anno(s = "Это наблюдающий класс")
class Wotcher implements Observer {

    public void update(Observable obj, Object arg) {
        System.out.println("Метод update () вызван, отсчет count равен " + ((Integer) arg).intValue());
    }
}

@Anno(s = "Это наблюдаемый  класс")
class BeingWatched extends Observable {  // наблюдаемый класс  extends Observable
    void counter(int period) {
        for (; period >= 0; period--) {
            setChanged(); //1) если изменяется вызывает метод
            notifyObservers(period); //2) метод сообщающий об изменении
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Oжидaниe прервано");
            }
        }
    }
}

public class ObserverDemoP674 {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Wotcher observing = new Wotcher();
        //Ввести наблюдающий объект в  список наблюдателей за наблюдаемым объектом
        observed.addObserver(observing);
        observed.counter(10);


    }
}
