package Shildt.PART2.LyambdaS454;
interface MyFunc5{
    MyClass func(int n);
}
class MyClass{
    private int val;

    public MyClass(int v) {
        this.val = v;
    }
    public MyClass() {
        this.val = 0;
    }

    public int getVal() {
        return val;
    }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
//        Создать ссылку на конструктор класса МyClass.
//        Метод func() из интерфейса МyFunc принимает аргумент,
//        поэтому оператор new обращается к  параметризированному
//        конструктору класса МyClass, а  не к  его конструктору по умолчанию

        MyFunc5 myClassCns = MyClass::new;

//        создать экземпляр класса МyClass по ссылке на его конструктор
        MyClass mc = myClassCns.func(100);

//        использовать только что созданный экземпляр класса МyClass
        System.out.println(mc.getVal());

        ////////////////////////////////////

        MyFunc5 mf = MyClass::new;
        MyClass mc2 = mf.func(300);
        System.out.println(mc2.getVal());



    }
}
