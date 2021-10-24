package Shildt.PART2.Annotacii;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface CopyIn{
    String strText();
}
public class MyAnNo {
    @CopyIn(strText = "Тестируем")
    public static void startuem() throws NoSuchMethodException {
        MyAnNo ob = new MyAnNo();

        Class<?> c = ob.getClass();
        Method m = c.getMethod("startuem");
//        Method m = c.getMethod("startuem", String.class, int.class);
        CopyIn an = m.getAnnotation(CopyIn.class);
        System.out.println(an.strText());
        System.out.println();

        Class <?> c2 = MyAnNo.class; // == Class<?> c = ob.getClass();


    }

    public static void main(String[] args) throws NoSuchMethodException {
        startuem();
    }
}
