package Shildt.PART2.Annotacii.T1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@interface MyInfo{
    String str();
}
public class ListExample {

    private static class Student {
        final int age;
        final String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    @MyInfo(str = "Тест аннотаций")
    public static void infAnno(){

        try {
            ListExample le = new ListExample();
            Class<?> c = le.getClass();
            Method m = c.getMethod("infAnno");
            MyInfo mi = m.getAnnotation(MyInfo.class);
            System.out.println(mi.str());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {

        final List<Student> students = new ArrayList<>() {{
            add(new Student(36, "Abdul"));
            add(new Student(35, "arewtwer"));
            add(new Student(34, "b"));
            add(new Student(33, "c"));
            add(new Student(32, "d"));
//            add(new Student(31, "null"));
        }};
//        int counter = 0;
//        for (Student s :
//                students) {
//            if (s.age < 30 && s.name == null || s.name.length() < 4) counter++;
//
//        }
//        System.out.println(counter);
        long count = students.
                stream().
                filter(student -> student.age > 30).
                map(student -> student.name).
                filter(name -> name.length() <= 4).
                count();
        System.out.println(count);
        infAnno();


    }

}
