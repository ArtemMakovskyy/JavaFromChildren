package Shildt.PART2.S437;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

public class Meta {
    //аннотироваь метод
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();
//        получить аннотацию из ме тода
//        и  вывести значения ее членов
        try {
//            сначала получить объект типа Class,
//            представляющий данный класс
            Class<?> c = ob.getClass();
//            затем получить объект типа Мethod,
//            представляющий данный метод
            Method m = c.getMethod("myMeth");
            Method m2 = c.getMethod(m.getName());
//            далее получить аннотацию дл я  данного класса
            //
            MyAnno anno = m.getAnnotation(MyAnno.class);

//
//            и  наконец, вывести  значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
            System.out.println(ob.getClass());
            System.out.println(c);
            System.out.println(m.getName());


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
myMeth();
    }
}
