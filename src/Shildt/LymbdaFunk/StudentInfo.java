package Shildt.LymbdaFunk;

import java.util.ArrayList;

interface StudentChacks {
    boolean check(StudentsLyabda students);
}

public class StudentInfo {

    public static void main(String[] args) {
        StudentsLyabda st1 = new StudentsLyabda("Ivan", 'm', 22, 3, 8.3);
        StudentsLyabda st2 = new StudentsLyabda("Nikol", 'm', 28, 2, 6.4);
        StudentsLyabda st3 = new StudentsLyabda("Elena", 'f', 19, 1, 8.39);
        StudentsLyabda st4 = new StudentsLyabda("Petr", 'm', 35, 4, 7);
        StudentsLyabda st5 = new StudentsLyabda("Mariya", 'f', 23, 3, 9.1);
        ArrayList<StudentsLyabda> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.testStudents(students,new ChackOverGrade());
        System.out.println("--------------");
        info.testStudents(students, new StudentChacks() {
            @Override
            public boolean check(StudentsLyabda students) {
                return students.age<30;
            }
        });
//        info.printStudentOverGrade(students, 8);
//        info.printStudentUnderAge(students, 30);
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');
//
    }
    void testStudents(ArrayList<StudentsLyabda> students, StudentChacks sc) {
        for (StudentsLyabda s : students) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
//
//    void printStudentOverGrade(ArrayList<StudentsLyabda> al, double grade) {
//        for (StudentsLyabda s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//        System.out.println("--------------");
//    }
//
//
//    void printStudentUnderAge(ArrayList<StudentsLyabda> al, int age) {
//        for (StudentsLyabda s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//        System.out.println("--------------");
//    }
//
//    void printStudentsMixCondition(ArrayList<StudentsLyabda> al, int age, double grade, char sex) {
//        for (StudentsLyabda s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//
//        }
//        System.out.println("--------------");
}
class  ChackOverGrade implements StudentChacks{

    @Override
    public boolean check(StudentsLyabda students) {
        return students.avgGrade>8;
    }
}
