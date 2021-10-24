package Shildt.Classes.FunctionInterfaces;

//https://www.youtube.com/watch?v=PjV80Nsi6ls
public class Starter {
    public static void main(String[] args) {
        Starter start = new Starter();
        Person p = new Person("Ivan", 300.0);

        start.processHospital(p, 4, (g, d) -> 0.8 * 8 * d * g);
        start.processAddition(p, 8.5, (g, h) -> 2.0 * h * g);
    }

    public void processHospital(Person person, Integer days, ProcessHospital ph) {
        Double sum = ph.process(person.getGrade(), days);
        System.out.println(sum);
        //write DB
        //Send mail
    }

    public void processAddition(Person person, Double hours, ProcessAddition ph) {
        Double sum = ph.process(person.getGrade(), hours);
        System.out.println(sum);
        //write DB
        //Send mail

    }
}

interface ProcessHospital {
    double process(Double grade, Integer dates);
}

interface ProcessAddition {
    double process(Double grade, Double hours);
}
