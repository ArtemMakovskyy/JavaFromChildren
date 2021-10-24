package Shildt.PART2.LyambdaS454;

import java.util.function.Function;

// Использовать встроенный функциональный интерфейс Function
public class UseFunctioninterfaceDemo {
    public static void main(String[] args) {
//        Это блочное лямбда-выражение вычисляет факториал целочисленного значения .
//        Для этой  цели на сей раз используется функциональный интерфейс F'unction
//      Function<T, R>{  R apply(T t);
        Function<Integer,Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <=n ; i++)
                result = i * result;
            return result;
        };
        System.out.println(factorial.apply(4));
        System.out.println(factorial.apply(5));
    }
}
