package Shildt.PART2.LyambdaS454;

interface MyFuncC<R, T> {
        R func(T n);
        }

class MyClassS2 {
    String str;

    public MyClassS2(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

public class ConstructorRefDemo4 {

    static <R, T> R myClassFactory(MyFuncC<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {

        MyFuncC<MyClassS2, String> myClasSCons2 = MyClassS2::new;

        MyClassS2 mc2 = myClassFactory(myClasSCons2, " Лямбда");

        System.out.println("Значение str в объекте mc2 равно" + mc2.getStr());
    }
}
