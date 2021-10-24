package Shildt.Reflaction;
//https://www.youtube.com/watch?v=XJQuBXWADZg&list=PLiJ76e8LBYQX0CsDJhH0hXMCWReZKNbBh&index=22&t=9s
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflactionChecker {
    public void showClassFields(Object object) {
        Class clazz = object.getClass();    //*
        clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields)
            System.out.println(field.getName());
    }

    public void showClassMethods(Object object) {
        Class clazz = object.getClass();    //*
        clazz.getFields();
        Method[] methods = clazz.getMethods();
        for (Method method : methods)
            System.out.println(method.getName());
    }

    public void showAnnotationsFields(Object object) {
        Class clazz = object.getClass();    //*
        clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] anno = field.getAnnotations();
            for (Annotation annotation : anno) {
                System.out.println(field.getName() + " : " + annotation.toString());
            }
        }
    }

    public void fillPrivetFields(Object obj) throws IllegalAccessException {
        Class clazz = obj.getClass();    //*
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(RebAnno.class);
            if (annotation == null) {
                continue;
            }
            field.setAccessible(true);// поле из приватного делается доступным
            field.set(obj, "FieldString");
            field.setAccessible(false);// поле делаентся не доступным
        }
    }

    public Object createNewObject(Object object) throws IllegalAccessException, InstantiationException {
        Class clazz = object.getClass();
        return clazz.newInstance();
    }
}


