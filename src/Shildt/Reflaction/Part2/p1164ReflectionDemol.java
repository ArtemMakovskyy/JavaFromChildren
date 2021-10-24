package Shildt.Reflaction.Part2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Work_Reflection {
    void _1p1164() {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
/**Сначала в этой программе вызывается метод forName () из класса Class для получения
 * объекта класса java.awt.Dimension.(измерение) Как только он будет получен, вызываются
 * методы getConstructors (), getFileds () и getMethods () для анализа объекта этого класса.
 * Они возвращают массивы типа Constructor, Field и Method, содержащие сведения об этом
 * объекте. Они возвращают массивы.
 */
            System.out.println("Koнcтpyктopы:");
            Constructor constructors[] = c.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(" " + constructors[i]);
            }
            System.out.println("Пoля:");
            Field[] fields = c.getFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(" " + fields[i]);
            }
            System.out.println("Meтoды:");
            Method[] methods = c.getMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(" " + methods[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void _2ReflectionDemo2_1166() {
        /**
         * ласс Modifier содержит также ряд статических методов, возвращающих тип
         * модификаторов, которые могут быть применены к определенному типу элемента
         * программы. Ниже приведены общие формы этих методов. static int classModifiers()
         * static int constructorModifiers() static int fieldМodifiers()
         * static int interfaceModifiers() static int methodМodifiers()
         * static int parameterModifiers() Например, метод methodModifiers ()
         * возвращает модификаторы, которые могут быть применены к методу.
         * Каждый метод возвращает признаки, скомпонованные в виде значения типа
         * int и указывающие допустимые модификаторы. Значения модификаторов
         * определяются константами PROTECTED, PUBLIC, PRIVATE, STATIC, FINAL и
         * прочими, определенными в классе Modifier.
         */
        try {
            Aa a = new Aa();
            Class<?> c = a.getClass();
            System.out.println("Oткpытыe методы:");
            Method[] methods = c.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                int modifires = methods[i].getModifiers();
                if (Modifier.isPublic(modifires)) {
                    System.out.println(" " + methods[i].getName());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class p1164ReflectionDemol {
    public static void main(String[] args) {
        Work_Reflection w = new Work_Reflection();
//        w._1p1164();
        w._2ReflectionDemo2_1166();// не работает
    }
}
