package Shildt.PART2.LyambdaS454;

/**
 * /////////////////////////////p 464
 *
 * @param <R>
 * @param <T>
 */
interface MyFuncc<R, T> {
    R func(T n);
}

class MyClasss<T> {
    private T val;

    public MyClasss(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}

class MyClasss2 {
    String str;

    public MyClasss2(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

public class ConstructorRefDemoЗ {
    //    Фабричный метод для объектов разных классов.
// У каждого класса должен  быть  свой  конструктор,
// принимающий один параме тр типа Т. А параметр R
// обозначает тип создаваемого объекта
    static <R, T> R myClassFactory(MyFuncc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
//        Создать ссылку на  конструктор  класса МyClass .
//        В данном  случае оператор new обращается к  конструктору,
//        принимающему аргумент
        MyFuncc<MyClasss<Double>, Double> myClassCons = MyClasss<Double>::new;
//
//        создать экземпляр типа  класса МyClass,  используя фабричный ме тод
        MyClasss<Double> mc = myClassFactory(myClassCons, 100.1);
//
//        использовать только что созданный экземпляр класса МyClass
        System.out.println("Значение val в объекте mc  равно " + mc.getVal());

//        А теперь создать экземпляр другого класса
//        используя метод JDYClassFactory()
        MyFuncc<MyClasss2, String> myClassCons2 = MyClasss2::new;
//
//        создать экземпляр класса МyClass2,  используя фабричный ме тод
        MyClasss2 mc2 = myClassFactory(myClassCons2, " Лямбда");

        System.out.println("Значение str в объекте mc2 равно" + mc2.getStr());
    }
}
