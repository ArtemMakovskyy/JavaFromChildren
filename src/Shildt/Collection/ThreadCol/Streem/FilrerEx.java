package Shildt.Collection.ThreadCol.Streem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.youtube.com/watch?v=C7uDcRGiwg8&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=30
public class FilrerEx {
    public static void main(String[] args) {
        StudentFilter st1 = new StudentFilter("Ivan", 'm', 22, 3, 8.3);
        StudentFilter st2 = new StudentFilter("Nik", 'm', 28, 2, 6.4);
        StudentFilter st3 = new StudentFilter("Elena", 'f', 19, 1, 8.9);
        StudentFilter st4 = new StudentFilter("Petr", 'm', 35, 4, 7);
        StudentFilter st5 = new StudentFilter("Mariya", 'f', 23, 3, 7.4);
        List<StudentFilter> student = new ArrayList<>();
        student.add(st1);
        student.add(st2);
        student.add(st3);
        student.add(st4);
        student.add(st5);
        List<StudentFilter> student2 = new ArrayList<>();
        List<StudentFilter> student3 = new ArrayList<>();

        student2 = student.stream().filter(elem ->
                elem.getAge() > 22 && elem.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
        System.out.println(student2);
        /** Стрим с нуля */
//        Stream<StudentFilter> myStream = Stream.of(st1, st2, st3, st4, st5);
//        myStream.filter(elem -> elem.getAge() > 22 && elem.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());


    }
}

class StudentFilter {
    private String name;
    private char sex;
    private int age;
    private int cource;
    private double avgGrade;

    public StudentFilter(String name, char sex, int age, int cource, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.cource = cource;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "StudentFilter{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", cource=" + cource +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}