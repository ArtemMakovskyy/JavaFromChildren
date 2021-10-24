package Shildt.Collection;

import java.util.Objects;
import java.util.TreeSet;

class Stud implements Comparable<Stud>{
    String name;
    int course;

    public Stud(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stud stud = (Stud) o;
        return course == stud.course ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Stud o) {
        return this.course - o.course;
    }
}
public class TreeSetExam2 {
    public static void main(String[] args) {
        Stud stud1 = new Stud("Zaur",5);
        Stud stud2 = new Stud("Misha",1);
        Stud stud3 = new Stud("Igor",2);
        Stud stud4 = new Stud("Marina",3);
        Stud stud5 = new Stud("Olya",4);
        Stud stud6 = new Stud("Olya",4);
        TreeSet<Stud>treeSetStud = new TreeSet<>();
        treeSetStud.add(stud1);
        treeSetStud.add(stud2);
        treeSetStud.add(stud3);
        treeSetStud.add(stud4);
        treeSetStud.add(stud5);
        System.out.println(treeSetStud);
        treeSetStud.add(stud6);
        System.out.println(treeSetStud.subSet(stud4, stud6));
        System.out.println(stud6.equals(stud5));
        System.out.println(stud6.hashCode());


    }

}
