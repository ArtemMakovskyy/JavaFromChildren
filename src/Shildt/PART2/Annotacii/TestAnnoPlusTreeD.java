package Shildt.PART2.Annotacii;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String info();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface WhatDo {
    String description();
}


@Info(info = "Одномерныые координаты", val = 1)
class One {
    int x;

    public One(int x) {
        this.x = x;
    }
}

@WhatDo(description = "Объединяем  массивы")
class UnitAr<T> {
    T[] ob;

    public UnitAr(T[] ob) {
        this.ob = ob;
    }
}


@WhatDo(description = "Выводим данные")
public class TestAnnoPlusTreeD {
    @Info(info = "Распаковать данные массива", val = 1)
    static void show(UnitAr<? extends One> c) {
        for (int i = 0; i < c.ob.length; i++) {
            System.out.print(c.ob[i].x + " / ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        One[] one = {
                new One(1), new One(3), new One(8), new One(9),
        };
        UnitAr<One> oneGr = new UnitAr<>(one);
        show(oneGr);

        TestAnnoPlusTreeD ob = new TestAnnoPlusTreeD();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();
//            вывести  все аннотации для класс
            System.out.println("Bce аннотации для класса : ");
            for (Annotation a : annos)
                System.out.println(a);
            System.out.println();


//            вывести  все аннотации для  метода
            Method m = ob.getClass().getMethod("show");
            annos = m.getAnnotations();
            System.out.println("Bce аннотации для метода");
            for (Annotation a : annos)
                System.out.println(a);
            System.out.println();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
