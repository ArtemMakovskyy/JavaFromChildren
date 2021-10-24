package Shildt.LymbdaFunk;

public class StudentsLyabda {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public StudentsLyabda(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "StudentsLyabda{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public static void main(String[] args) {


    }
}
