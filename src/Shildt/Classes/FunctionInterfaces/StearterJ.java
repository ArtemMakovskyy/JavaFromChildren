package Shildt.Classes.FunctionInterfaces;
//https://www.youtube.com/watch?v=PjV80Nsi6ls
import java.util.function.BiFunction;

public class StearterJ {
    public static void main(String[] args) {
        Starter s = new Starter();
        Person p = new Person("Ivan",300.0);
        Process process;




        s.processHospital(p, 4, (g, d) -> 0.8 * 8 * d * g);
        s.processAddition(p, 8.5, (g, h) -> 2.0 * h * g);


    }

    public void processHospital(Person person, Integer days, BiFunction<Double, Integer, Double> ph) {
        Double sum = ph.apply(person.getGrade(), days);
        //write DB
        //Send mail

    }

    public void processAddition(Person person, Double hours, BiFunction<Double, Double, Double> ph) {
        Double sum = ph.apply(person.getGrade(), hours);
        //write DB
        //Send mail

    }
//    public void processHospital(Person person,Integer days,ProcessHospital ph){
//        Double sum =  ph.process(person.getGrade(),days);
//        //write DB
//        //Send mail
//
//    }
//    public void processAddition(Person person,Double hours,ProcessAddition ph){
//        Double sum =  ph.process(person.getGrade(),hours);
//        //write DB
//        //Send mail
//
//    }
}

//interface Process<P1, P2, R> {
//    R process(P1 p1, P2 p2);
//}


//interface  ProcessHospitalJ{
//    double process(Double grade, Integer dates);
//}
//interface  ProcessAdditionJ{
//    double process(Double grade, Double hours);
//}
