package Shildt.PART2.Annotacii;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str();

    int val() default 100;
}

public class Meta2_2 {
    //аннотироваь метод
    @MyAnno2(str = "Пример аннотации", val = 100)
    public static void myMeth() {
        Meta2_2 ob = new Meta2_2();
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
            MyAnno2 anno = m.getAnnotation(MyAnno2.class);
//
//            и  наконец, вывести  значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
