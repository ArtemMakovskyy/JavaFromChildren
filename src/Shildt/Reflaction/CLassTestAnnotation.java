package Shildt.Reflaction;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyNewTestAnno{
    String s();
}
@MyNewTestAnno(s="first text Class")
public class CLassTestAnnotation {

    @MyNewTestAnno(s="test field")
    String st = "Test field";

    @MyNewTestAnno(s="second text method")
    public static void showField(Object o){
        Class<?> clasz = o.getClass();
        Field [] fields = o.getClass().getDeclaredFields();
        for (Field f: fields) System.out.println(f.getName() + ":"+ f.getType()+ ":"+f.getAnnotatedType());
    }


    public static void showAnno(){
        CLassTestAnnotation ob = new CLassTestAnnotation();
        try {
            Annotation[] annotation = ob.getClass().getAnnotations();
            for (Annotation a: annotation) System.out.println(a);

            Method m  = ob.getClass().getMethod("showField",Object.class);
            annotation = m.getAnnotations();
            for (Annotation a: annotation) System.out.println(a);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        CLassTestAnnotation ob = new CLassTestAnnotation();

//showField(ob);
showAnno();


    }
}
