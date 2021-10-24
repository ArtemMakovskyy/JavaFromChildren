package Shildt.Reflaction;
//https://www.youtube.com/watch?v=XJQuBXWADZg&list=PLiJ76e8LBYQX0CsDJhH0hXMCWReZKNbBh&index=22&t=9s
public class ReflactionExanple {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ReflactionChecker checker = new ReflactionChecker();
        Rabit rabbit = new Rabit();

//        checker.showClassName(rabbit);
//        checker.showClassFields(rabbit);
//        checker.showClassMethods(checker);
        checker.showAnnotationsFields(rabbit);
//        checker.fillPrivetFields(rabbit);

//       Object clone =  checker.createNewObject(rabbit);

//        checker.showClassName(clone);

//        System.out.println(rabbit.getDd());
//        System.out.println(rabbit.getRabbitName());

    }
}
