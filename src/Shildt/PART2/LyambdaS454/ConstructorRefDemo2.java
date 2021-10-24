package Shildt.PART2.LyambdaS454;

interface MyFunc6<T> {
    MyClass6<T> func(T n);
}

class MyClass6<T> {
    private T val;

    public MyClass6() {
        this.val = null;
    }

    public MyClass6(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}


public class ConstructorRefDemo2 {
    public static void main(String[] args) {

//        создать ссылку на конструктор обобщенного класса МyClass<T>
        MyFunc6<Integer> myClassCons = MyClass6<Integer>::new;

//        создать экземпляр класса МyClass<T> по данной  ссылке на конструктор
        MyClass6<Integer> mc = myClassCons.func(100);

//        воспользоваться только что созданным экземпляром  класса МyClass<T>
        System.out.println("Значение  val в  объекте mc равно " + mc.getVal());

    }

}
