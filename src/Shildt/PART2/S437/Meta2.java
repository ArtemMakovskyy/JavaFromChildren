package Shildt.PART2.S437;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnO {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация текстового класса")
@MyAnnO(str = "Meta2", val = 99)
class Meta2 {
    @What(description = "Аннотация текстового класса")
    @MyAnnO(str = "Testing", val = 100)

    public static void myMeth2() {
        Meta2 ob = new Meta2();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("Bce аннотации для класса Meta2:");
            for (Annotation a :
                    annos)
                System.out.println(a);
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth2");
            annos = m.getAnnotations();
            System.out.println("Bce аннотации для метода myMeth():");
            for (Annotation a :
                    annos)
                System.out.println(a);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth2();
    }
}


