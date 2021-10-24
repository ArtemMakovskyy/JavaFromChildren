package Shildt.Classes.FunctionInterfaces;
//https://www.youtube.com/watch?v=PjV80Nsi6ls
import java.util.Date;

public class Person {
    private String name;
    private Date dateOfBirth;
    private Double grade;

    public Person(String name,  Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
