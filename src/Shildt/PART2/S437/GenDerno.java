package Shildt.PART2.S437;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Tипoм  Т является " + ob.getClass().getName());
    }
}

public class GenDerno {
    public static void main(String[] args) {
//        Создать ссылку  типа Gen для целых чисел

        Gen<Integer> iOb;

//        Создать объект типа Gen<Integer> и присвоить  ссылку на  него переменной iОЬ.
//        Обратите внимание на применение автоупаковки дл я  инкапсуляции значения 88
//         в  объекте типа Inteqer
        iOb = new Gen<Integer>(88);


//        показать тип данных,   хранящихся в  переменной iОЬ
        iOb.showType();

//        получить значение переме нной iОЬ . Обратите внимание на то,
//        что для этого  не требуется никакого приведения типов
        int v = iOb.getOb();
        System.out.println("Знaчeниe:   " + v);
        System.out.println();

//        создать объект типа Gen для символьных строк
        Gen<String> strOb = new Gen<String>("Тест обобщений");

//        оказать тип данных ,   хранящихся в  переменной strOЬ
        strOb.showType();

//        получить значение переменной strOЬ . И  в этом  случае
//        приведение типов не  требуется
        String str = strOb.getOb();
        System.out.println("Знaчeниe:   " + str);

    }
}
