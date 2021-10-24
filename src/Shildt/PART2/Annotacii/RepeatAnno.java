package Shildt.PART2.Annotacii;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//сделать аннотацию МyAnno повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(value = MyRepeatedAnnos.class)
@interface MyAnno{
    String str() default "Testing" ;
    int value() default 9000;
}
//    Это контейнерная  аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
    MyAnno[] value();
}


public class RepeatAnno {
//    повторить аннотацию МyAnno в  методе myМeth()
    @MyAnno( str = "First annotation", value = -1)
    @MyAnno( str = "Second annotation", value = 100)
    public static void MyMeth(String str, int i){
        RepeatAnno ob = new RepeatAnno();
        try {
            Class <?> c = ob.getClass();
            Method m = c.getMethod("MyMeth", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyMeth("test",1);
    }



}
