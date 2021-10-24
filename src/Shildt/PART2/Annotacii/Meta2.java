package Shildt.PART2.Annotacii;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MeAn {
    String str();

    int val();
}


@MeAn(str = "META2", val = 99)
public class Meta2 {


    @MeAn(str = "META2", val = 100)
    public static void myMeth() throws NoSuchMethodException {
        Meta2 ob = new Meta2();

        Annotation an[] = ob.getClass().getAnnotations();
//        вывести  все аннотации для класса Меtа2
        System.out.println("Bce аннотации для класса Meta2:");
        for (Annotation a : an) {
            System.out.println( a);
        }
        System.out.println();
        System.out.println("вывести  все аннотации для  метода myMeth()" );
        Method m = ob.getClass().getMethod("myMeth");
        an = m.getAnnotations();
        for (Annotation a : an) {
            System.out.println( a);
        }

    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }
}
